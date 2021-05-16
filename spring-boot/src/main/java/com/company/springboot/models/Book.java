package com.company.springboot.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock_count")
    private Integer stockCount;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private List<UserBook> userBookList;
    public Book() {
    }

    public Book(Integer id, String name, String description, String author, Double price, Integer stockCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.price = price;
        this.stockCount = stockCount;
    }

    public Integer getId() {
        return id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Book setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public Book setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
        return this;
    }

    public List<UserBook> getUserBookList() {
        return userBookList;
    }

    public Book setUserBookList(List<UserBook> userBookList) {
        this.userBookList = userBookList;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stockCount=" + stockCount +
                '}';
    }
}
