package com.example.saturnstore.entity.order;

import com.example.saturnstore.entity.product.Product;
import com.example.saturnstore.entity.shop.Shop;
import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    private UserAccount customer;

    @ManyToOne
    private Shop seller;

    @OneToMany
    private List<Product> products;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    private Instant lastChangeTime;

}
