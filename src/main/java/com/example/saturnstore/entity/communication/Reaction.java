package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    private UserAccount author;

    @Enumerated(EnumType.STRING)
    private ReactionType reactionType;
    private Instant creationTime;

    @ManyToOne
    private Commentary commentary;

}
