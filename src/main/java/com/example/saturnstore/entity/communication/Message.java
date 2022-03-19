package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private UserAccount author;

    private String content;

    private Instant sendTime;

    private Instant readTime;

    //TODO: New class for photo
    private List<String> photo = new java.util.ArrayList<>();
    @ManyToOne
    private Dialog dialog;

}
