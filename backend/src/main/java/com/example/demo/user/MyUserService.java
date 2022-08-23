package com.example.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserService {


    private final MyUserRepo userRepository;
    private final PasswordEncoder passwordEncoder;

    public void createNewUser(MyUserCreationData userCreationData) {
        if (!Objects.equals(userCreationData.getPassword(), userCreationData.getPasswordRepeat())) {
            throw new IllegalArgumentException("passwords do not match");
        }

        if (userCreationData.getUsername() == null || userCreationData.getUsername().isBlank()) {
            throw new IllegalArgumentException("username is blank");
        }

        Gamer user = new Gamer();
        user.setUsername(userCreationData.getUsername());
        user.setPassword(passwordEncoder.encode(userCreationData.getPassword()));
        user.setRoles(List.of("user"));
        userRepository.save(user);
    }

    public Optional<Gamer> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<Gamer> findById(String userId) {
        return userRepository.findById(userId);
    }
}
