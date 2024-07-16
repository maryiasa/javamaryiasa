package hw7SahanovichM.main;

import hw7SahanovichM.model.student.Student;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {
        Student studentI = new Student("Ivanov Ivan");
        Student studentA = new Student("Abakyan Abi");
        Student studentS = new Student("Sidorov Senya");
        Student studentF = new Student("Filimonov Filya");
        Student studentFF = new Student("Filimonov Fenya");


        LinkedList studentLList = new LinkedList<Student>();
        studentLList.add(studentI);
        studentLList.add(studentA);
        studentLList.add(studentS);
        studentLList.add(studentF);

        System.out.println(studentLList);
        studentLList.removeFirst();
        System.out.println(studentLList.get(2));
        studentLList.remove(studentF);
        studentLList.remove(1);
        System.out.println(studentLList);


        List<Student> aList = new ArrayList<>();
        aList.add(new Student("Ivanov Ivan", 25));
        aList.add(new Student("Abakyan Abi", 17));
        aList.add(new Student("Sidorov Senya", 31));
        aList.add(new Student("Filimonov Filya"));
        aList.add(new Student("Filimonov Fenya", 27));

        System.out.println("ArrayList " + aList);

        aList.removeIf(n -> n.getStudentAge() < 18);

        System.out.println("ArrayList " + aList);
        System.out.println(aList.getFirst());


        Set<Student> hashSet = new HashSet<>();

        hashSet.add(studentI);
        hashSet.add(studentA);
        hashSet.add(studentS);
        hashSet.add(studentS);
        hashSet.add(studentF);
        hashSet.add(studentFF);

        Set<Student> deleteStudents = new HashSet<>();
        deleteStudents.add(studentF);
        deleteStudents.add(studentFF);

        System.out.println(deleteStudents);
        System.out.println(hashSet);
        hashSet.remove(studentI);
        System.out.println(hashSet);
        hashSet.removeAll(deleteStudents);
        System.out.println(hashSet);


        Set<Student> linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(studentS);
        linkedHashSet.add(studentFF);
        linkedHashSet.add(studentF);
        System.out.println(linkedHashSet);
        linkedHashSet.add(studentA);
        linkedHashSet.add(studentI);

        System.out.println(linkedHashSet.remove(studentF));
        System.out.println(linkedHashSet);


        Set<Student> treeSet = new TreeSet<>();

        treeSet.add(studentFF);
        treeSet.add(studentF);
        treeSet.add(studentA);
        treeSet.add(studentI);
        treeSet.add(studentS);

        System.out.println(treeSet);

        System.out.println(treeSet.isEmpty());
        treeSet.remove(studentF);
        System.out.println(treeSet);
        System.out.println("test");
        System.out.println(studentS.getStudentFullName().compareTo(studentI.getStudentFullName()));
        System.out.println(studentI.getStudentFullName().compareTo(studentS.getStudentFullName()));
        System.out.println(studentI.getStudentFullName().compareTo(studentI.getStudentFullName()));

    }
}
