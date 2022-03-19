package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.user.Subscriptable;
import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private long id;
    private String name;
    private String logotypeFileName;
    private UserAccount owner;
    private Set<UserAccount> members;
    private Set<Warehouse> warehouses;
    private Set<Promotion> promotions;
    private Set<Order> orders;

}
