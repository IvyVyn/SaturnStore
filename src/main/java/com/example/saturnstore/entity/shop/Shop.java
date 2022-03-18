package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.user.Subscriptable;
import com.example.saturnstore.entity.user.UserAccount;

import java.util.Set;

public class Shop implements Subscriptable {

    private long id;
    private String name;
    private String logotypeFileName;
    private UserAccount owner;
    private Set<UserAccount> members;
    private Set<Warehouse> warehouses;
    private Set<Promotion> promotions;
    private Set<Order> orders;

}
