package com.hadi.controller;

import com.hadi.dto.UserDto;
import com.hadi.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class LoginController {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public LoginController(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(Principal principal, Authentication authentication) {
        return "Hi "+principal.getName()+ " You are "+authentication.getAuthorities()+" !!!!!";
    }

    @GetMapping("/bye")
    @ResponseBody
    public String sayBye() {
        return "Bye Hadi !!!!!";
    }

    @GetMapping("/customLogInPage")
    public String logIn() {
        return "logIn";
    }

    @GetMapping("/singup")
    public String callRegister(@ModelAttribute(value = "userDto") UserDto userDto) {
        return "singUp";
    }
    @GetMapping("/home")
    public String home() {
        return "homePage";
    }
    @PostMapping("/register")
    public String registerUser(UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userRepository.saveUser(userDto);
        return "redirect:/customLogInPage";
    }
    @GetMapping("/accessDenied")
    public String accessDeniedPage(Principal principal, Model model) {
        model.addAttribute("userName",principal.getName());
        return "accessDenied";
    }
}
