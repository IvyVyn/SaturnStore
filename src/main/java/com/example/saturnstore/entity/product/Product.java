package com.example.saturnstore.entity.product;

import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.shop.Warehouse;

import java.util.Set;

public class Product {

    private long id;
    private String serialNumber;
    private Price price;
    private ProductStatus productStatus;
    private ProductCard productCard;
    private Warehouse warehouse;
    private Set<Order> orders;

}
