package com.example.lancia.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductREPO extends CrudRepository<Product, Integer> {    // le repo des methodes utilisables par Thymeleaf
    public Product findById(int id);
    public List<Product> findAll();
}
