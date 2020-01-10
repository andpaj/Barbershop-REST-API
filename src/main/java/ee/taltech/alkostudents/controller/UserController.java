package ee.taltech.alkostudents.controller;

import ee.taltech.alkostudents.exception.MyBadRequestException;
import ee.taltech.alkostudents.model.LoginDetails;
import ee.taltech.alkostudents.model.User;
import ee.taltech.alkostudents.security.JwtTokenProvider;
import ee.taltech.alkostudents.security.MyUser;
import ee.taltech.alkostudents.security.MyUserDetailsService;
import ee.taltech.alkostudents.security.UserSessionHolder;
import ee.taltech.alkostudents.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;
    private AuthenticationManager authenticationManager;
    private MyUserDetailsService myUserDetailsService;
    private JwtTokenProvider jwtTokenProvider;

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        if (user.getUsername() == null) {
            throw new MyBadRequestException();
        }
        if (user.getPassword() == null) {
            throw new MyBadRequestException();
        }
        userService.saveUser(user);
    }

    @PostMapping("/login")
    public LoginDetails login(@RequestBody User user) {
        if (user.getUsername() == null) {
            throw new MyBadRequestException();
        }
        if (user.getPassword() == null) {
            throw new MyBadRequestException();
        }
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(user.getUsername());
        final String token = jwtTokenProvider.generateToken(userDetails);
        MyUser myUser = (MyUser) userDetails;
        return new LoginDetails(myUser.getUsername(), token, toAuthorities(myUser), myUser.getRole());
    }

    @GetMapping("me")
    public MyUser me() {
        return UserSessionHolder.getLoggedInUser();
    }

    private List<String> toAuthorities(MyUser myUser) {
        return myUser.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
    }
}
