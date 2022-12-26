package homeWork8;

import homeWork8.course_1.teacher.teacher.Tch1;
import homeWork8.course_1.teacher.teacher.Tch2;

import java.util.Scanner;

public class CategoryTch {
    public static void teacher() {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        do {
            System.out.println("Enter a Teacher name:");
            System.out.println("1. Teacher1");
            System.out.println("2. Teacher2");
            System.out.println("3. Return to the previous menu");
            t = scanner.nextInt();

            switch (t) {
                case 1:
                    Tch1 tch1 = new Tch1(1);
                    System.out.println("Vasyl Ivanovitch - teacher " + tch1.id);
                    System.out.println("Teacher1");
                    break;
                case 2:
                    Tch2 tch2 = new Tch2(2);
                    System.out.println("Ivan Vasilyevich - teacher " + tch2.id);
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("please input correct");
            }
        } while (t != 3);
    }
}

