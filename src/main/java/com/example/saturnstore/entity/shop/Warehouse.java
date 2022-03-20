package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    private String city;
    private String street;
    private String number;

    @OneToOne
    private Shop owner;

    @OneToMany
    private Set<Product> products;

}
