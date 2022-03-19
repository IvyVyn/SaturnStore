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
    private String serialNumber;
    private Price price;
    private ProductStatus productStatus;
    private ProductCard productCard;
    private Warehouse warehouse;
    private Set<Order> orders;

}
