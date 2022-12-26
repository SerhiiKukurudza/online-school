package homeWork9;

import java.util.Scanner;

public class HomeWork8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int category = 0;

        do {
            System.out.println("Enter a category name:");
            System.out.println("1. Teacher"); //This menu has subdirectories
            System.out.println("2. Student");
            System.out.println("3. Lecture");
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
                default:
                    System.out.println("please input correct");
            }
        } while (true);
    }
}
