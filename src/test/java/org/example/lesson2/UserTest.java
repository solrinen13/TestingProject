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
    private static String invalidLogin;
    static User userEmpty;
    private static String invalidEmail;
    private static String invalidEmail2;

    @BeforeAll
    private static void initParam() throws Exception {
        System.out.println("Start testing");
        email = "s.n@gmail.com";
        invalidEmail = "s.ngmail.com";
        invalidEmail2 = "sn@gmailcom";
        login = "login";
        invalidLogin = "s.n@gmail.com";
        userEmpty = new User();
        user = new User(email, login);
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void shouldCreateObject() {
        assertFalse(user.getEmail().isBlank());
        assertFalse(user.getLogin().isBlank());
        System.out.println("Создание объекта успешно");
    }

    @Test
    void shouldCreateEmptyObject() {
        assertNull(userEmpty.getEmail());
        assertNull(userEmpty.getLogin());
        System.out.println("Создание пустого объекта успешно");
    }

    @Test
    void checkEmail() {
        Assertions.assertThrows(Exception.class, () -> {
            new User(invalidEmail, login);
        });
        Assertions.assertThrows(Exception.class, () -> {
            new User(invalidEmail2, login);
        });
        Assertions.assertDoesNotThrow(() -> {
            new User(email, login);
        });
        System.out.println("Бросок исключение при написания неверного эмаила работает");
    }

    @Test
    void checkEqualsEmailAndLogin() {
        Assertions.assertThrows(Exception.class, () -> {
            new User(email, invalidLogin);
        });
        Assertions.assertDoesNotThrow(() -> {
            new User(email, login);
        });
        System.out.println("Бросок исключение при совпадения логина работает");
    }


}