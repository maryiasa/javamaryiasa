package hw7SahanovichM.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hw7SahanovichM.exception.MyException;

public class ExceptionTestMain {

    private static final Logger LOGGER = LogManager.getLogger(ExceptionTestMain.class);

    public static int doDivision(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Division by zero is forbidden");
        }
        return a/b;
    }

    public static void main(String[] args) {
        try {
            LOGGER.info(doDivision(10, 0));
        } catch (MyException e) {
            LOGGER.info("We have exception :" + e.getClass());
        }

    }
}
