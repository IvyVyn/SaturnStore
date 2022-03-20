package com.example.saturnstore.entity.product;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    private String value;

    @ManyToOne
    private CharacteristicTemplate template;

    @ManyToOne
    private Product product;

}
