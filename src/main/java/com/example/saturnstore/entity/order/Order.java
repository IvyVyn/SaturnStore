package com.example.saturnstore.entity.order;

import com.example.saturnstore.entity.product.Product;
import com.example.saturnstore.entity.shop.Shop;
import com.example.saturnstore.entity.user.UserAccount;

import java.time.Instant;
import java.util.ArrayList;

public class Order {

    private long id;
    private UserAccount customer;
    private Shop seller;
    private ArrayList<Product> bucket;
    private OrderState state;
    private Instant lastChangeTime;

}
