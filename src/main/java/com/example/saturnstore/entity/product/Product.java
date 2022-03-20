package com.example.saturnstore.entity.product;

import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.shop.Warehouse;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String serialNumber;

    @OneToOne
    private Price price;

    @OneToOne
    private ProductCard productCard;

    @ManyToOne
    private Warehouse warehouse;

    @OneToMany
    private Set<Order> orders;

}
