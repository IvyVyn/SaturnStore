package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;

import java.time.Instant;

public abstract class Claim {

    private long id;
    private UserAccount author;
    private String content;
    private Instant creationTime;
    private Instant closeTime;

}
