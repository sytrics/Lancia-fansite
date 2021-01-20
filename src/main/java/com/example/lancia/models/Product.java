package com.example.lancia.models;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {   // La classe Product gère l'affichage des produits disponibles dans Boutique
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imgpath;
    private String type;
    private float price;

    // getters and Setters

    public String getName() {
        return name;
    }

    public String getImgpath() {
        return imgpath;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // constructors

    public Product() {

    }

    public Product(int id, String name, String imgpath, String type, float price) {
        this.id = id;
        this.name = name;
        this.imgpath = imgpath;
        this.type = type;
        this.price = price;

    }


}