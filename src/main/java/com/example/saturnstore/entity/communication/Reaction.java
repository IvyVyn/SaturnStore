package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    @ManyToOne
    private UserAccount author;
    private ReactionType reactionType;
    private Instant creationTime;

    @ManyToOne
    private Commentary commentary;

}
