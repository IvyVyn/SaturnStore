package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.product.Product;

import java.util.Set;

public class Warehouse {

    private long id;
    private String city;
    private String street;
    private String number;
    private Shop owner;
    private Set<Product> products;

}
