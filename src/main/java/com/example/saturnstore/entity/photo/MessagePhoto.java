package com.example.saturnstore.entity.photo;

import com.example.saturnstore.entity.communication.Message;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("MESSAGE_PHOTO")
public class MessagePhoto extends Photo {

    @ManyToOne
    private Message message;

}
