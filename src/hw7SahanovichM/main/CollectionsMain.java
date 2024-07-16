package hw7SahanovichM.main;

import hw7SahanovichM.model.student.Student;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("Ivanov Ivan", 25));
        map.put(2, new Student("Abakyan Abi", 17));
        map.put(3, new Student("Sidorov Senya", 31));
        map.put(4, new Student("Filimonov Filya"));
        map.put(5, new Student("Filimonov Fenya", 27));
        System.out.println(map);
        System.out.println(map.get(4));
        map.remove(3);
        System.out.println(map);


        Queue<Student> queue = new PriorityQueue();

        queue.add(new Student("Ivanov Ivan", 25));
        queue.add(new Student("Abakyan Abi", 17));
        queue.add(new Student("Sidorov Senya", 20));
        queue.add(new Student("Filimonov Fenya", 27));
        System.out.println("\nPriority Queue:");
        System.out.println(queue);
        queue.removeIf(n -> n.getStudentAge() < 18);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        Stack<Student> stack = new Stack<>();
        stack.push(new Student("Ivanov Ivan", 25));
        stack.push(new Student("Abakyan Abi", 17));
        stack.push( new Student("Sidorov Senya", 31));
        stack.push(new Student("Filimonov Filya"));
        stack.push(new Student("Filimonov Fenya", 27));
        System.out.println("\nStack:");
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.capacity());

    }

}
