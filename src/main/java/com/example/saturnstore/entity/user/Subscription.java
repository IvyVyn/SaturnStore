package com.example.saturnstore.entity.user;

import java.util.Set;

public class Subscription {

    private long id;
    private String name;
    private Set<UserAccount> subscribers;
    private SubscriptionType type;
    private Subscriptable subscriptionObject;

}