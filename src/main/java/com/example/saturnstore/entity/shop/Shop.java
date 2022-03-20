package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.user.Subscriptable;
import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class Shop implements Subscriptable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    private String logotypeFileName;

    @OneToOne
    private UserAccount owner;

    @OneToMany
    private Set<UserAccount> members;

    @OneToMany
    private Set<Warehouse> warehouses;

    @OneToMany
    private Set<Promotion> promotions;

    @OneToMany
    private Set<Order> orders;

}
