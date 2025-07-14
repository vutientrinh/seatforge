package seatforge.seatforge.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import seatforge.seatforge.repository.UserRepository;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    public void getUser(){

    }
}
