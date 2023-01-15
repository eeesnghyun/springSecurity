package com.app.springsecurity.user.dto;

import com.app.springsecurity.user.repo.UserEntity;
import lombok.Data;

@Data
public class UserDTO {

    private String id;
    private String password;
    private String name;

    public UserEntity toEntity() {
        return UserEntity.builder()
                .userId(id)
                .userPw(password)
                .userName(name)
                .build();
    }
}
