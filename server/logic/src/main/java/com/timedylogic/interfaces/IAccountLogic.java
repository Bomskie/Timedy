package com.timedylogic.interfaces;

import com.timedy.models.User;

public interface IAccountLogic {
    User login(String email, String password);
    User register(String email, String password, String firstname, String lastname, int age);

}
