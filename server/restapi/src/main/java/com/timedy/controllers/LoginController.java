package com.timedy.controllers;

import com.timedy.models.User;
import com.timedylogic.interfaces.IAccountLogic;
import com.timedylogic.logic.AccountLogic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class LoginController {
    IAccountLogic accountLogic = new AccountLogic();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestParam(name = "email", required = true) String email,@RequestParam(name = "password", required = true) String password){
        User user = accountLogic.login(email,password);
        if(user != null){
            if(user.getEmail() != null){
                return new ResponseEntity<String>(user.getEmail()+ " "+ user.getFirstName(),HttpStatus.OK);
            }else{
                return new ResponseEntity<String>("Incorrecte Inlog Gegevens",HttpStatus.OK);
            }
        }else {
            return new ResponseEntity<>("Foutje....",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestParam(name = "email", required = true) String email, @RequestParam(name = "firstName", required = true) String firstName, @RequestParam(name = "lastName", required = true) String lastName, @RequestParam(name = "password", required = true) String password,@RequestParam(name = "age", required = true) int age){
        User user = accountLogic.register(email,password,firstName,lastName,age);
        if(user != null){
            return new ResponseEntity<String>(user.getEmail(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Foutje....",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
