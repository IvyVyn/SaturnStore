package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;

import java.time.Instant;
import java.util.List;

public class Message {

    private long id;
    private UserAccount author;
    private String content;
    private Instant sendTime;
    private Instant readTime;
    private List<String> photo;
    private Dialog dialog;

}
