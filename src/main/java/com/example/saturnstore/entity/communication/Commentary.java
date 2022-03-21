package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.photo.CommentaryPhoto;
import com.example.saturnstore.entity.product.Product;
import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorColumn(name = "COMMENTARY_TYPE")
public abstract class Commentary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(updatable = false)
    private UserAccount author;

    private String content;
    private Instant creationTime;
    private boolean isDeleted;

    @OneToMany
    private Set<Reaction> reactions;

    @OneToMany
    private Set<CommentaryClaim> complaints;

    @ManyToOne
    private Product product;

    @OneToMany
    private Set<Answer> answers;

    @OneToMany
    private List<CommentaryPhoto> photos;

}
