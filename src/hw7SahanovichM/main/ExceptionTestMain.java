package hw7SahanovichM.main;

import hw7SahanovichM.exception.MyException;

public class ExceptionTestMain {

    public static int doDivision(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Division by zero is forbidden");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(doDivision(10, 0));
        } catch (MyException e) {
            System.out.println("We have exception :" + e.getClass());
        }

    }
}
