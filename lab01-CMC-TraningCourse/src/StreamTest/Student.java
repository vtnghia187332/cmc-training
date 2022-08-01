package StreamTest;

import java.util.Objects;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String university;
    private double averageScore;

    public Student(String studentId, String studentName, int age, String university, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.university = university;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
