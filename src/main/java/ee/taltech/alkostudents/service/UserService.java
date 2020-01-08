package ee.taltech.alkostudents.service;

import ee.taltech.alkostudents.model.User;
import ee.taltech.alkostudents.repository.UserRepository;
import ee.taltech.alkostudents.security.Role;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user) {
        User user2 = new User();
        user.setUsername(user.getUsername());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setFirstname(user.getFirstname());
        user.setLastname(user.getLastname());
        user.setEmail(user.getEmail());
        user.setRole(Role.USER);
        userRepository.save(user2);
        return user;
    }
}
