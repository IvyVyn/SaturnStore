package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.order.Order;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

@Entity
public class Dialog {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    private String name;

    @OneToOne
    private Order order;

    @OneToMany
    private List<Message> messages;

}
