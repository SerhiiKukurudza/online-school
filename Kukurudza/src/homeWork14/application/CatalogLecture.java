package homeWork14.application;

import homeWork14.course_1.lecture.homeWork.ArrayHomeWork;
import homeWork14.course_1.lecture.lec.lecServ.LecSr;

import java.util.Scanner;

public class CatalogLecture {
    public static void lecture() {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        do {
            System.out.println("1.Enter Lecture");
            System.out.println("2.Enter homework");
            System.out.println("3. Exit");
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    LecSr.massifId();
                    break;
                case 2:
                    ArrayHomeWork.arrayHomework();
                    break;
                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }
        } while (2 != t);
    }
}
