package homeWork8;

import java.util.Scanner;

public class HomeWork8_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int category = 0;

        do {
            System.out.println("Enter a category name:");
            System.out.println("1. Teacher"); //This menu has subdirectories
            System.out.println("2. Student");
            System.out.println("3. Lecture");
            System.out.println("4. Exit");
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
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("please input correct");
            }
        } while (true);
    }
}

