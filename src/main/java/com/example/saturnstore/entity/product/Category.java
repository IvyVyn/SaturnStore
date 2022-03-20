package com.example.saturnstore.entity.product;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Category headCategory;

    @OneToMany
    private Set<Category> subCategory;

    @OneToMany
    private Set<ProductTemplate> productTemplates;

}
