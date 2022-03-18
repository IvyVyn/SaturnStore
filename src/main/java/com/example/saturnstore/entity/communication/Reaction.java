package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;

import java.time.Instant;

public class Reaction {

    private long id;
    private UserAccount author;
    private ReactionType reactionType;
    private Instant creationTime;

    private Commentary commentary;

}
