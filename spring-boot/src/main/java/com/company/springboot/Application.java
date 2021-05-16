package com.company.springboot;

import com.company.springboot.dao.inter.UserDaoInter;
import com.company.springboot.models.User;
import com.company.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UserDaoInter userDao;

	@Autowired
	private User user;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Optional<User> user = userRepository.findById(1);
//		System.out.println(user.isPresent());
//		System.out.println(user.get());

		Optional<User> user = userRepository.findByEmailAndPassword("hs@gmail.com", "1234");
		user.ifPresent(System.out::println);
	}
}
