package com.example.saturnstore.entity.product;

import com.example.saturnstore.entity.communication.ProductClaim;
import com.example.saturnstore.entity.communication.Question;
import com.example.saturnstore.entity.communication.Review;
import com.example.saturnstore.entity.order.Order;
import com.example.saturnstore.entity.photo.Photo;
import com.example.saturnstore.entity.shop.Warehouse;
import com.example.saturnstore.entity.user.Subscriptable;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class ProductCard implements Subscriptable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Set<Price> priceSet;

    private String shortDescription;
    private String fullDescription;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    @ManyToOne
    private ProductTemplate productTemplate;

    @OneToMany
    private Set<Characteristic> characteristics;

    @OneToMany
    private Set<Photo> photos;

    @OneToMany
    private Set<Question> questions;

    @OneToMany
    private Set<Review> reviews;

    @OneToMany
    private Set<Warehouse> warehouses;

    @OneToMany
    private Set<Order> orders;

    @OneToMany
    private Set<ProductClaim> complaints;

}
