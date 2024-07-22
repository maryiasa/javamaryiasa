package hw9Sahanovich;

import hw7SahanovichM.model.student.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class hw9StreamMain {

    private static final Logger LOGGER = LogManager.getLogger(hw9StreamMain.class);

    public static void main(String[] args) {

        List<Student> aList = new ArrayList<>();
        aList.add(new Student("Ivanov Ivan", 25));
        aList.add(new Student("Abakyan Abi", 17));
        aList.add(new Student("Abakyan Abi", 18));
        aList.add(new Student("Sidorov Senya", 31));
        aList.add(new Student("Filimonov Filya"));
        aList.add(new Student("Filimonov Filya", 28));
        aList.add(new Student("Filimonov Fenya", 27));

        LOGGER.info("Initial aList: " + aList);

        //1st way
        aList.stream();

        aList.stream().forEach(student -> student.setStudentAge(student.getStudentAge() + 1));

        LOGGER.info("Updated aList (1st way) -> age+1: " + aList);

        List studentFList = aList.stream().map(n -> n.getStudentFullName().startsWith("F")).collect(Collectors.toList());

        LOGGER.info("aList map -> FullName starts with F: " + studentFList);

        List sortedStudentList = aList.stream().sorted().toList();

        LOGGER.info("sortedStudentList: " + sortedStudentList);

        List filteredStudentList = aList.stream().filter(n -> n.getStudentAge() > 30).toList();

        LOGGER.info("filteredStudentList: " + filteredStudentList);

        Long countAList = aList.stream().count();

        LOGGER.info("countAList: " + countAList);

        //2nd way
        Stream.Builder<Student> studStreamBuilder = Stream.builder();

        studStreamBuilder.accept(aList.get(0));
        studStreamBuilder.accept(aList.get(1));
        studStreamBuilder.accept(aList.get(2));
        studStreamBuilder.accept(aList.get(3));
        studStreamBuilder.accept(aList.get(4));

        Stream<Student> studStream = studStreamBuilder.build();
        studStream.forEach(student -> student.setStudentAge(student.getStudentAge() + 1));

        LOGGER.info("Updated aList (2nd way)-> age+1: " + aList);

    }
}
