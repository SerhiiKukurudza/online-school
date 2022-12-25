package homeWork7;

import homeWork7.course_1.Course;
import homeWork7.course_1.lecture.lec.lec.Lec1;
import homeWork7.course_1.lecture.lec.lec.Lec2;

import java.util.Scanner;

public class HomeWork7_2 {
    public static void main(String[] args) {

        System.out.println("Press 1 to select course id");
        System.out.println("Press 2 to create a new object");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                Course course = new Course(1);
                Lec1 lec1 = new Lec1(course.id);
                System.out.println(lec1.id);
                break;
            case 2:
                Lec2 lec2 = new Lec2(2);
                System.out.println(lec2);
                break;
            default:
                System.out.println("Error");


        }
    }
}
