package com.example.saturnstore.entity.product;

import com.example.saturnstore.entity.shop.Promotion;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("ALTER_PRICE")
public class AlterPrice extends Price {

    @ManyToOne
    private Promotion promotion;

}
