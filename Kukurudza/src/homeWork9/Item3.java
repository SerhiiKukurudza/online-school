package homeWork9;

import homeWork9.course_1.lecture.lec.lec.Lecture;

import java.util.Arrays;

public class Item3 {
    public static void main(String[] args) {
        Lecture[] lectures = new Lecture[8];
        Lecture[] copes = Arrays.copyOf(lectures, (lectures.length * 3) / 2 + 1);
        System.out.println(Arrays.toString(copes));

    }
}
