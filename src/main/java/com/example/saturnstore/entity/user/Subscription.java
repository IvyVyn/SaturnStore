package com.example.saturnstore.entity.user;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter


public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<UserAccount> subscribers;

    @Transient
    private SubscriptionType type;

    @Transient
    private Subscriptable subscriptionObject;

}