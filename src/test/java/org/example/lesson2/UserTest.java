package org.example.lesson2;

import org.example.lesson1.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private static String email;
    private static String login;
    static User user;
    static User userEmpty;

    @BeforeAll
    private static void initParam() {
        System.out.println("Start testing");
        email = "s.n@gmail.com";
        login = "login";
        userEmpty = new User();
        user = new User(email, login);
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void shouldGetEmail() {
        assertFalse(user.getEmail().isBlank());
    }

    @Test
    void shouldGetLogin() {
        assertFalse(user.getLogin().isBlank());
    }

    @Test
    void shouldCreateEmptyObject() {
        assertTrue(userEmpty.getEmail() == null);
        assertTrue(userEmpty.getLogin() == null);
    }

    @Test
    void checkEmail() {
        user.getEmail().contains("@");
        user.getEmail().contains(".");
    }

    @Test
    void checkEqualsEmailAndLogin() {
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());

    }


}