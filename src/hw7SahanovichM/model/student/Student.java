package hw7SahanovichM.model.student;

public class Student implements Comparable<Student>{
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
        return studentFullName.compareTo(o.studentFullName);
    }


}
