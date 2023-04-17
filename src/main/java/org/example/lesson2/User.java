package org.example.lesson2;

import java.util.Objects;

public class User {
    String email;
    String login;

    public User(String email, String login) throws Exception {
        this.email = email;
        this.login = login;
        if (!getEmail().contains("@") || !getEmail().contains(".") || Objects.equals(getEmail(), getLogin())
        ) {
            throw new Exception();
        }


    }

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

}
