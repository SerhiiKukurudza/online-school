package homeWork13.application;

import homeWork13.course_1.lecture.lec.lecServ.LecSr;

import java.util.Scanner;

public class CatalogLecture {
    public static void lecture() {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        do {
            System.out.println("Enter Lecture");
            System.out.println("2. Exit");
            String name = scanner.next();

            switch (name) {
                case "Lecture":
                    LecSr.massifId();
                    break;
                case "2":
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }
        } while (2 != t);
    }
}
