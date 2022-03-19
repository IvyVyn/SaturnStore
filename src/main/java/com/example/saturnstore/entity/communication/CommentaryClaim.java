package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorColumn(name = "CLAIM_TYPE")
public class CommentaryClaim extends Claim {

    @ManyToOne
    private Commentary commentary;

}
