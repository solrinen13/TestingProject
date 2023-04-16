package org.example.lesson2;

public class User {
    String email;
    String login;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
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
