package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("ANSWER")
public class Answer extends Commentary {

    @ManyToOne
    private Commentary headCommentary;

}
