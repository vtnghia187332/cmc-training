package StreamTest;

public class StudentDTO {
    private String studentName;
    private int age;
    private String university;
    private double averageScore;

    public StudentDTO(String studentName, int age, String university, double averageScore) {
        this.studentName = studentName;
        this.age = age;
        this.university = university;
        this.averageScore = averageScore;
    }

    public StudentDTO() {
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
        return "StudentDTO{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
