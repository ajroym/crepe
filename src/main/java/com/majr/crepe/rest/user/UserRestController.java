package com.majr.crepe.rest.user;

import com.majr.crepe.dto.user.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserService userService;

    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    UserDTO getUserDetails(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/all")
    List<UserDTO> getManyUserDetails() {
        return null;
    }

    @PostMapping("/create")
    UserDTO createNewUser() {
        return null;
    }

    @PutMapping("/update/{id}")
    UserDTO updateUser() {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteUser() {
        return null;
    }
}
