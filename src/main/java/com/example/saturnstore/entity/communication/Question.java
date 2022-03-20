package com.example.saturnstore.entity.communication;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue("QUESTION")
public class Question extends Commentary {


}
