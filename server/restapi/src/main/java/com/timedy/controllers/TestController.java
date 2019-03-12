package com.timedy.controllers;

import com.timedy.models.User;
import com.timedylogic.logic.AccountLogic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/cool-users")
    public List<User> coolCars() {
        AccountLogic accountLogic = new AccountLogic();
        return accountLogic.test();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestParam(name = "firstName", required = true) String firstName, @RequestParam(name = "lastName", required = true) String lastName, @RequestParam(name = "username", required = true) String username, @RequestParam(name = "password", required = true) String password){
        return new ResponseEntity<String>("First name: " + firstName + ", last name: " + lastName + ", username: " + username + ", password : " + password, HttpStatus.OK);
    }

    @RequestMapping(value="test", method =  RequestMethod.GET)
    public ResponseEntity test(){
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}

