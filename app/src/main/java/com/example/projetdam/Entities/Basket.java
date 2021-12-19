package com.example.projetdam.Entities;

import java.io.Serializable;

public class Basket implements Serializable {
    private String Id_basket;
    private String user_id;

    public Basket() {
    }

    public Basket(String id_basket, String user_id) {
        Id_basket = id_basket;
        this.user_id = user_id;
    }

}
