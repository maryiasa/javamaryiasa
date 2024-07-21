package hw7SahanovichM.main;

import hw7SahanovichM.interfaces.IRemoveStudent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import hw7SahanovichM.model.student.Student;

import java.util.*;

public class StudentMain {

    private static final Logger LOGGER = LogManager.getLogger(StudentMain.class);

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

        LOGGER.info(studentLList);
        studentLList.removeFirst();
        LOGGER.info(studentLList.get(2));
        studentLList.remove(studentF);
        studentLList.remove(1);
        LOGGER.info(studentLList);


        List<Student> aList = new ArrayList<>();
        aList.add(new Student("Ivanov Ivan", 25));
        aList.add(new Student("Abakyan Abi", 17));
        aList.add(new Student("Sidorov Senya", 31));
        aList.add(new Student("Filimonov Filya"));
        aList.add(new Student("Filimonov Fenya", 27));

        LOGGER.info("ArrayList " + aList);

        IRemoveStudent remover = l -> l.removeIf(n -> n.getStudentAge() < 18);

        remover.removeStudent((ArrayList<Student>) aList);

        LOGGER.info("Updated ArrayList " + aList);
        LOGGER.info(aList.getFirst());

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

        LOGGER.info(deleteStudents);
        LOGGER.info(hashSet);
        hashSet.remove(studentI);
        LOGGER.info(hashSet);
        hashSet.removeAll(deleteStudents);
        LOGGER.info(hashSet);


        Set<Student> linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(studentS);
        linkedHashSet.add(studentFF);
        linkedHashSet.add(studentF);
        LOGGER.info(linkedHashSet);
        linkedHashSet.add(studentA);
        linkedHashSet.add(studentI);

        LOGGER.info(linkedHashSet.remove(studentF));
        LOGGER.info(linkedHashSet);


        Set<Student> treeSet = new TreeSet<>();

        treeSet.add(studentFF);
        treeSet.add(studentF);
        treeSet.add(studentA);
        treeSet.add(studentI);
        treeSet.add(studentS);

        LOGGER.info(treeSet);

        LOGGER.info(treeSet.isEmpty());
        treeSet.remove(studentF);
        LOGGER.info(treeSet);
        LOGGER.info("test");
        LOGGER.info(studentS.getStudentFullName().compareTo(studentI.getStudentFullName()));
        LOGGER.info(studentI.getStudentFullName().compareTo(studentS.getStudentFullName()));
        LOGGER.info(studentI.getStudentFullName().compareTo(studentI.getStudentFullName()));

    }
}
