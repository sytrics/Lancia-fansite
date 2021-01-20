package com.example.lancia.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartREPO extends CrudRepository<Shoppingcart, Integer> {   // le repo des methodes utilisables par Thymeleaf
    public Shoppingcart findByProductid(int id);
    public List<Shoppingcart> findAll();
}
