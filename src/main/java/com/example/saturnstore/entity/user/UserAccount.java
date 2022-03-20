package com.example.saturnstore.entity.user;

import com.example.saturnstore.entity.communication.Claim;
import com.example.saturnstore.entity.communication.Message;
import com.example.saturnstore.entity.communication.Reaction;
import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.shop.Shop;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    private String patronymic;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String hashedPassword;

    @OneToMany
    private Set<Communication> communications;

    private String photoFileName;

    @Enumerated(EnumType.STRING)
    private UserAccountRole role;

    private Instant registrationTime;
    private Instant lastActivity;

    @OneToOne
    private Shop shop;

    @OneToMany
    private Set<Message> messages;

    @OneToMany
    private Set<Order> orders;

    @OneToMany
    private Set<Reaction> reactions;

    @Transient
    private Set<Subscription> subscriptions;

    @OneToMany
    private Set<Claim> complaintSet;

    @OneToMany
    private Set<UserAccount> complaints;

}
