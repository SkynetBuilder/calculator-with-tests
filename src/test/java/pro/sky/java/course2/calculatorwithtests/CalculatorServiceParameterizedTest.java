package pro.sky.java.course2.calculatorwithtests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculatorwithtests.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> params() {
        return Stream.of(Arguments.of(455, 22),
                Arguments.of(647, 6556),
                Arguments.of(0, 3636534),
                Arguments.of(-5624543, 15));
    }

    @ParameterizedTest
    @MethodSource("params")
    void plusTest(int a, int b) {
        assertEquals(a + b, out.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("params")
    void minusTest(int a, int b) {
        assertEquals(a - b, out.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("params")
    void multiplyTest(int a, int b) {
        assertEquals(a * b, out.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("params")
    void divideTest(int a, int b) {
        assertEquals(a / b, out.divide(a, b));
    }
}
