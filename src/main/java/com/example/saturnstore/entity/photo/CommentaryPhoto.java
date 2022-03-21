package com.example.saturnstore.entity.photo;

import com.example.saturnstore.entity.communication.Commentary;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("COMMENTARY_PHOTO")
public class CommentaryPhoto extends Photo {

    @ManyToOne
    private Commentary commentary;

}
