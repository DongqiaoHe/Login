package com.joe.login.bean;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String token;
}
