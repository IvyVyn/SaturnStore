package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class Answer extends Commentary {

    @ManyToOne
    private Commentary headCommentary;

}
