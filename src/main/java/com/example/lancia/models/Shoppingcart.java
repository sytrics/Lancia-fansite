package com.example.lancia.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Cart")
public class Shoppingcart {    // classe gérant le panier d'achat de la boutique

    @Id
    private int productid;
    private int quantity;

    // getters and Setters

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // constructors

    public Shoppingcart() {
    }


    public Shoppingcart( int productid, int quantity) {
        this.productid = productid;
        this.quantity = quantity;
    }


    // methode pour retrouver l'id d'un produit
    public Product getProduct(ProductREPO repo) {
        Product item = repo.findById(this.productid);
        return item;
    }

}

