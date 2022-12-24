package homeWork7;

import homeWork7.course_1.Course;
import homeWork7.course_1.lecture.lec.lec.Lec2;
import homeWork7.course_1.student.student.St2;
import homeWork7.course_1.teacher.teacher.Tch2;

import java.util.Scanner;

public class HomeWork7_1 {
    public static void main(String[] args) {

        Course course = new Course(1);
        Tch2 tch2 = new Tch2(2);
        St2 st2 = new St2(2);
        Lec2 lec2 = new Lec2(2);

        if (course.id <= tch2.id) {
            if (course.id <= st2.id) {
                if (course.id <= lec2.id) {

                    System.out.println("Enter a category name");

                    Scanner scanner = new Scanner(System.in);
                    String name = scanner.next();

                    switch (name) {
                        case "Course":
                            System.out.println("Course");
                            break;
                        case "Teacher":
                            System.out.println("Teacher");
                            break;
                        case "Student":
                            System.out.println("Student");
                            break;
                        case "Lecture":
                            System.out.println("Lecture");
                            break;
                        default:
                            System.out.println("Error");
                    }
                }
            }
        }
    }
}

