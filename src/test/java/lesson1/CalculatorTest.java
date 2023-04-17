package lesson1;

import org.example.lesson1.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static int x;
    private static int y;
    static Calculator calculator;

    @BeforeAll
    private static void initParam() {
        System.out.println("Start testing");
        x = 10;
        y = 5;
        calculator = new Calculator();
    }

    @AfterAll
    private static void shouldDoAfterAll() {
        System.out.println("Finish testing");
    }

    @Test
    void shouldGetSum() {
        Assertions.assertEquals(15, calculator.getSum(x, y));
    }

    @Test
    void shouldGetDivide() {
        Assertions.assertEquals(2, calculator.getDivide(x, y));
    }

    @Test
    void shouldGetMultiple() {
        Assertions.assertEquals(50, calculator.getMultiple(x, y));
    }

    @Test
    void shouldExceptionGetDivide() {
        y = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.getDivide(x, y));
    }
}