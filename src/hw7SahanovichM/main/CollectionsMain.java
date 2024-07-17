package hw7SahanovichM.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hw7SahanovichM.model.student.Student;

import java.util.*;

public class CollectionsMain {

    private static final Logger LOGGER = LogManager.getLogger(CollectionsMain.class);

    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("Ivanov Ivan", 25));
        map.put(2, new Student("Abakyan Abi", 17));
        map.put(3, new Student("Sidorov Senya", 31));
        map.put(4, new Student("Filimonov Filya"));
        map.put(5, new Student("Filimonov Fenya", 27));
        LOGGER.info(map);
        LOGGER.info(map.get(4));
        map.remove(3);
        LOGGER.info(map);


        Queue<Student> queue = new PriorityQueue();

        queue.add(new Student("Ivanov Ivan", 25));
        queue.add(new Student("Abakyan Abi", 17));
        queue.add(new Student("Sidorov Senya", 20));
        queue.add(new Student("Filimonov Fenya", 27));
        LOGGER.info("\nPriority Queue:");
        LOGGER.info(queue);
        queue.removeIf(n -> n.getStudentAge() < 18);
        LOGGER.info(queue);
        LOGGER.info(queue.peek());
        LOGGER.info(queue.poll());
        LOGGER.info(queue);

        Stack<Student> stack = new Stack<>();
        stack.push(new Student("Ivanov Ivan", 25));
        stack.push(new Student("Abakyan Abi", 17));
        stack.push( new Student("Sidorov Senya", 31));
        stack.push(new Student("Filimonov Filya"));
        stack.push(new Student("Filimonov Fenya", 27));
        LOGGER.info("\nStack:");
        LOGGER.info(stack.peek());
        LOGGER.info(stack);
        LOGGER.info(stack.pop());
        LOGGER.info(stack.peek());
        LOGGER.info(stack);
        LOGGER.info(stack.capacity());

    }

}
