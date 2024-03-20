package com.app.springsecurity.user.dto;

import com.app.springsecurity.user.entity.UserEntity;
import lombok.Data;

@Data
public class UserDTO {

    private String userId;
    private String userPw;
    private String userName;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .userId(userId)
                .userPw(userPw)
                .userName(userName)
                .build();
    }

}
