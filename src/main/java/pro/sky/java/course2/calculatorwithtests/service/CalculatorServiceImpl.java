package pro.sky.java.course2.calculatorwithtests.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculatorwithtests.exceptions.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException();
        } else {
            return num1 / num2;
        }
    }
}
