package homeWork7;

import homeWork7.course_1.lecture.lec.lec.Lec1;

import java.util.Scanner;

public class HomeWork7_3 {
    public static void main(String[] args) {

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            Lec1 lec1 = new Lec1(1);
            System.out.println(lec1);

        }
    }
}
