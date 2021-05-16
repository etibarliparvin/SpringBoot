package com.company.springboot.service.impl;

import com.company.springboot.dao.inter.UserDaoInter;
import com.company.springboot.models.User;
import com.company.springboot.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoInter userDaoInter;

    @Override
    @Transactional
    public boolean save(User user) {
        return userDaoInter.save(user);
    }
}
