package com.app.springsecurity.user.repo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name="USER_INFO")
@NoArgsConstructor
public class UserEntity {
    @Id
    private String userId;
    private String userPw;
    private String userName;

    @Builder
    public UserEntity(
            String userId,
            String userPw,
            String userName) {
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
    }
}
