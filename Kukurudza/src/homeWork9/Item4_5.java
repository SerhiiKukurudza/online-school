package homeWork9;

import homeWork9.course_1.lecture.lec.lecServ.LecSr;

import java.util.Scanner;

public class Item4_5 {
    public static void main(String[] args) {

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
                    CategoryTch.teacher();
                    break;
                case 2:
                    System.out.println("Category Student");
                    break;
                case 3:
                    System.out.println("Category Lecture");
                    LecSr.massifId();
                    break;
                case 4:
                    System.out.println("New course");
                    LecSr.massifId();
                    break;
                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }
        } while (true);
    }
}