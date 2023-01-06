package homeWork9;

import homeWork9.course_1.lecture.lec.lec.Lecture;

public class Item2 {
    public static void main(String[] args) {

        Lecture[] lectures = new Lecture[8];

        for (int i = 0; i < lectures.length; i++) {
            String name = "Lecture";
            lectures[i] = new Lecture(i);
            System.out.println(name + " " + lectures[i].id);
        }
    }
}

