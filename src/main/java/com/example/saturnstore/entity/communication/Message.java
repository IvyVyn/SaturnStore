package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.photo.Photo;
import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    private UserAccount author;

    private String content;

    private Instant sendTime;

    private Instant readTime;

    @OneToMany
    private List<Photo> photos;

    @ManyToOne
    private Dialog dialog;

    public void addPhoto(Photo photo){
        if (null == photos) photos = new ArrayList<>();
        photo.setOrder(photos.size() + 1);
        photos.add(photo);

    }

}
