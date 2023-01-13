package homeWork13.application;

import homeWork13.course_1.Course;
import homeWork13.course_1.lecture.lec.lec.Lecture;
import homeWork13.course_1.student.student.Student;
import homeWork13.course_1.teacher.teacher.Teacher;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Course course = new Course(1);
        Teacher teacher = new Teacher(2);
        Student student = new Student(2);
        Lecture lecture = new Lecture(2);

        if (course.getId() <= teacher.getId()) {
            if (course.getId() <= student.getId()) {
                if (course.getId() <= lecture.getId()) {
                    Scanner scanner = new Scanner(System.in);
                    int category = 0;

                    do {
                        System.out.println("Enter a category name:");
                        System.out.println("1. Teacher"); //This menu has subdirectories
                        System.out.println("2. Student");
                        System.out.println("3. Lecture");
                        System.out.println("4. Create a new course");
                        System.out.println("5. Exit");
                        category = scanner.nextInt();

                        switch (category) {
                            case 1:
                                System.out.println("Category Teacher");
                                break;
                            case 2:
                                System.out.println("Category Student");
                                break;
                            case 3:
                                System.out.println("Category Lecture");
                                CatalogLecture.lecture();
                                break;
                            case 4:
                                System.out.println("New course");
                                break;
                            case 5:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("please input correct");
                        }
                    } while (true);
                }
            }
        }
    }
}
