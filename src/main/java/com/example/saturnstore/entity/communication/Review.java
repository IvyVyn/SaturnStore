package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("REVIEW")
public class Review extends Commentary {

    @Column(name = "rating")
    private int rating;

}
