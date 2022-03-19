package com.example.saturnstore.entity.user;

import com.example.saturnstore.entity.communication.Claim;
import com.example.saturnstore.entity.communication.Message;
import com.example.saturnstore.entity.communication.Reaction;
import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.shop.Shop;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private String login;
    private String hashedPassword;
    private Set<Communication> communications;
    private String photoFileName;
    private UserAccountRole role;
    private Instant registrationTime;
    private Instant lastActivity;

    private Shop shop;
    private Set<Message> messages;
    private Set<Order> orders;
    @OneToMany
    private Set<Reaction> reactions;
    private Set<Subscription> subscriptions;
    private Set<Claim> complaintSet;
    private Set<UserAccount> complaints;

}
