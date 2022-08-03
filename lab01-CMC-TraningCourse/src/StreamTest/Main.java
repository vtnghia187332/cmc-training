package StreamTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList
                (
                        new Student("student1", "vtnghia1", 22, "bachkhoa", 2.6),
                        new Student("student1", "hai1", 22, "bachkhoa", 2.6),
                        new Student("student2", "quoc1", 23, "bachkhoa", 2.7),
                        new Student("student3", "hanoi1", 24, "congnghiep", 2.8),
                        new Student("student4", "huy23", 25, "cokhi", 2.9),
                        new Student("student5", "Alex1", 26, "quocgia", 2.5)
                );

        //filter
        List<Student> filterStudentByAge = students.stream()
                .filter(p -> p.getStudentId().equals("student5") && p.getAge() > 22)
                .collect(Collectors.toList());
        filterStudentByAge.forEach(System.out::println);

        //map: convert list of objects to list of other objects
        List<StudentDTO> mapToStudentDTO = students.stream()
                .map(student -> {
                    StudentDTO studentDTO = new StudentDTO();
                    studentDTO.setStudentName(student.getStudentName().toUpperCase());
                    studentDTO.setAge(student.getAge());
                    studentDTO.setUniversity(student.getUniversity());
                    studentDTO.setAverageScore(student.getAverageScore());
                    return studentDTO;
                })
                .sorted(Comparator.comparing(StudentDTO::getStudentName)
                        .reversed())
                .collect(Collectors.toList());
        mapToStudentDTO.forEach(System.out::println);

        List<Student> calAverageScore = students.stream()
                .filter(p -> p.getAverageScore() > 0)
                .collect(Collectors.toList());

        double sumOfScore = calAverageScore.stream()
                .mapToDouble(Student::getAverageScore)
                .reduce(0, (value1, value2) -> value1 + value2);

        System.out.println(sumOfScore);
    }


}
