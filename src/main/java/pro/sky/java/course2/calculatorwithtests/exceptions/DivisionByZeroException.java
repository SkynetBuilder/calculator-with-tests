package pro.sky.java.course2.calculatorwithtests.exceptions;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException() {
        super("На ноль делить нельзя!");
    }
}
