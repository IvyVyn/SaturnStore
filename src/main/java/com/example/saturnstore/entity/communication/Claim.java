package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "CLAIM")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
        name = "CLAIM_TYPE")
public abstract class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne
    private UserAccount author;

    private String content;
    private Instant creationTime;
    private Instant closeTime;

}
