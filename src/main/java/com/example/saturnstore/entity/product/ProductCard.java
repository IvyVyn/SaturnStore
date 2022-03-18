package com.example.saturnstore.entity.product;

import com.example.saturnstore.entity.communication.ProductClaim;
import com.example.saturnstore.entity.communication.Question;
import com.example.saturnstore.entity.communication.Review;
import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.shop.Warehouse;
import com.example.saturnstore.entity.user.Subscriptable;

import java.util.Set;

public class ProductCard implements Subscriptable {

    private long id;
    private String name;
    private Set<Price> priceSet;
    private String shortDescription;
    private String fullDescription;
    private ProductStatus productStatus;
    private ProductTemplate productTemplate;
    private Set<Characteristic> characteristics;
    private Set<String> photos;

    private Set<Question> questions;
    private Set<Review> reviews;
    private Set<Warehouse> warehouses;
    private Set<Order> orders;
    private Set<ProductClaim> complaints;

}
