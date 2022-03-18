package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.product.Product;
import com.example.saturnstore.entity.user.UserAccount;

import java.time.Instant;
import java.util.Set;

public abstract class Commentary {

    private long id;
    private UserAccount author;
    private String content;
    private Instant creationTime;
    private boolean isDeleted;
    private Set<Reaction> reactions;
    private Set<CommentaryClaim> complaints;
    private Product product;
    private Set<Answer> answers;

}
