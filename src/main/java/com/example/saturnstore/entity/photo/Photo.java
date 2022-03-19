package com.example.saturnstore.entity.photo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    private Long id;

    @Column(name = "order")
    private int order;

    private String name;
}
