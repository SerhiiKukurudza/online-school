package homeWork11.course_1.student.student;

import homeWork11.exetend.SuperRepository;

public class DataStudent extends SuperRepository {
    private static Student[] students = new Student[2];

    public static Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "DataStudent{}";
    }
}
