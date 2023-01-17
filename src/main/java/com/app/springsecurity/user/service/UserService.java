package com.app.springsecurity.user.service;

import com.app.springsecurity.user.dto.UserDTO;
import com.app.springsecurity.user.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String saveUser(UserDTO userDTO) {
        //패스워드 암호화
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(userDTO.toEntity());
        return userDTO.getId();
    }


}
