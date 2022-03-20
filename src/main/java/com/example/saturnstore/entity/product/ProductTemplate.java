package com.example.saturnstore.entity.product;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class ProductTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @OneToOne
    private Category category;

    @OneToMany
    private List<CharacteristicTemplate> characteristics;

}
