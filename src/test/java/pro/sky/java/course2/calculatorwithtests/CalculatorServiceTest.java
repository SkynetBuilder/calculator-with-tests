package pro.sky.java.course2.calculatorwithtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculatorwithtests.exceptions.DivisionByZeroException;
import pro.sky.java.course2.calculatorwithtests.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    @Test
    void plusTest(){
        int a = 2;
        int b = 3;
        assertEquals((a+b), out.plus(a,b));
        int c = 3;
        int d = 2;
        assertEquals((c+d), out.plus(c,d));
    }
    @Test
    void minusTest(){
        int a = 51;
        int b = 2;
        assertEquals((a-b), out.minus(a,b));
        int c = 356;
        int d = 46276;
        assertEquals((c-d), out.minus(c,d));
    }
    @Test
    void multiplyTest(){
        int a = 20;
        int b = 33;
        assertEquals((a*b), out.multiply(a,b));
        int c = 3334;
        int d = 0;
        assertEquals((c*d), out.multiply(c,d));
    }
    @Test
    void divideTest(){
        int a = 33;
        int b = 3;
        assertEquals((a/b), out.divide(a,b));
        int c = 3;
        int d = 456;
        assertEquals((c/d), out.divide(c,d));
        int e = 0;
        assertThrows(DivisionByZeroException.class, () -> out.divide(d, e));
    }
}
