package com.example.saturnstore.entity.communication;

import com.example.saturnstore.entity.user.UserAccount;
import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Getter
@Setter

@Entity
@DiscriminatorValue("USER_ACCOUNT_CLAIM")
public class UserAccountClaim extends Claim {

    @ManyToOne
    private UserAccount userAccount;

}
