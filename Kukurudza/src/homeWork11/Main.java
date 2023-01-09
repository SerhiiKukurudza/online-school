package homeWork11;

import homeWork11.course_1.lecture.lec.lec.Lecture;

public class Main {
    public static void main(String[] args) {

        Person teacher = new Person();
        teacher.setRole(Role.TEACHER);
        Lecture lecture = new Lecture(1, teacher);

        System.out.println(lecture);
    }
}
