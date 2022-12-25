package homeWork8;

import homeWork8.course_1.lecture.lec.lec.Lec1;

public class HomeWork8_4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            String name = "Lecture ";
            Lec1 lec = new Lec1(i);
            System.out.println(name + " " + lec.id);
        }
    }
}

