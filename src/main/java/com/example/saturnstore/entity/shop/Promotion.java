package com.example.saturnstore.entity.shop;

import com.example.saturnstore.entity.product.AlterPrice;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    private BigDecimal discount;

    @OneToOne
    private Shop owner;

    @Enumerated(EnumType.STRING)
    private PromotionType promotionType;

    private Instant startTime;
    private Instant endTime;

    @OneToMany
    private Set<AlterPrice> prices;

}
