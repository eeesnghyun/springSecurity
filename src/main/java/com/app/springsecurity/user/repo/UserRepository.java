package com.app.springsecurity.user.repo;

import com.app.springsecurity.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    public UserEntity findByUserId(String username);
}
