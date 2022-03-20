package com.example.saturnstore.entity.photo;

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
@DiscriminatorValue("PRODUCT_PHOTO")
public class ProductPhoto extends Photo {

    @ManyToOne
    private Product product;

}
