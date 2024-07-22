package hw7SahanovichM.model.student;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private String studentFullName;
    private int studentAge;

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName.isEmpty() ? "StudentFullName" : studentFullName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge < 0 ? 1 : studentAge;
    }

    public Student(String studentFullName) {
        this.setStudentFullName(studentFullName);
    }


    public Student(String studentFullName, int studentAge) {
        this.setStudentFullName(studentFullName);
        this.setStudentAge(studentAge);
    }

    @Override
    public String toString() {
        if (this.studentAge != 0) {
            return this.studentFullName + ", " + this.studentAge;
        } else return this.studentFullName;
    }

    @Override
    public int compareTo(Student o) {
        if (studentFullName.compareTo(o.studentFullName) == 0) {
            if (this.studentAge == o.studentAge) {
                return 0;
            }
        }
        return studentFullName.compareTo(o.studentFullName);

    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.studentAge == o2.studentAge) {
            return 0;
        } else if (o1.studentAge < o2.studentAge) {
            return -1;
        }
        return 1;
    }
}
