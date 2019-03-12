package com.timedy.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "user")
@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "email", unique = true )
    private String email;

    @Column(name = "password", nullable = false )
    private String password;

    @Column(name = "firstName", nullable = false )
    private String firstName;

    @Column(name = "lastName", nullable = false )
    private String lastName;

    @Column(name = "age", nullable = false )
    private int age;

    public User(String email, String password, String firstName, String lastName, int age) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(){

    }

}
