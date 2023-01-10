package homeWork12;

import homeWork12.course_1.lecture.lec.lec.Lecture;
import homeWork12.enumRole.Person;
import homeWork12.enumRole.Role;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a name lecture");
        Person teacher = new Person();
        teacher.setRole(Role.TEACHER);
        Lecture lecture = new Lecture(1, teacher, "Lecture1", "Introduction to Java");
        String name = "Lecture_1";
        String inputString = scanner.nextLine();
        boolean validation = inputString.regionMatches(5, "re_1", 0, 4);

        if (validation && name.equals(inputString)) {
            System.out.println(lecture);
        } else {
            System.out.println("error");
        }
    }
}
