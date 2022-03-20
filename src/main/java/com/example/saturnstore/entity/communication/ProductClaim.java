package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.product.Product;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue("PRODUCT_CLAIM")
public class ProductClaim extends Claim {

    @ManyToOne
    private Product product;

}
