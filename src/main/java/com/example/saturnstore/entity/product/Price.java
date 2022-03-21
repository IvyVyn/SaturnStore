package com.example.saturnstore.entity.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "PRICE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
        name = "PRICE_TYPE")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    private BigDecimal original;
    private BigDecimal discount;
    private BigDecimal partner;
    private Instant startTime;

}
