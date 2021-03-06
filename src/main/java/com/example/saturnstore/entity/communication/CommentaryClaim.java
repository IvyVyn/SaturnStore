package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorColumn(name = "COMMENTARY_CLAIM")
public class CommentaryClaim extends Claim {

    @ManyToOne
    private Commentary commentary;

}
