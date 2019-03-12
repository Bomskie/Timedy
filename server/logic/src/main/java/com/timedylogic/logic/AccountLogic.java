package com.timedylogic.logic;

import com.timedy.dal.AccountService;
import com.timedy.models.User;
import com.timedylogic.interfaces.IAccountLogic;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.List;

public class AccountLogic implements IAccountLogic {
    AccountService accountService = new AccountService();

    public User login(String email, String password) {
       User user = accountService.getUser(email);
       if(user != null){
          if(BCrypt.checkpw(password, user.getPassword())){
              return user;
          }else{
              return new User();
          }
       }else{
           return null;
       }
    }

    public User register(String email, String password, String firstname, String lastname, int age) {
        User user = new User(email,BCrypt.hashpw(password ,BCrypt.gensalt()),firstname,lastname,age);
        return accountService.create(user);


    }

    public List<User> test(){
        User u = new User("test", "", "","",1);
        accountService.create(u);
        return accountService.readAll();
    }
}
