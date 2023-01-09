package homeWork11.course_1.lecture.lec.lecServ;

import homeWork11.course_1.lecture.lec.lec.Lecture;


public class LecSr {

    public void counter() {
        int lect = 1;
        Lecture lec1 = new Lecture(1);
        lect++;
        Lecture lec2 = new Lecture(2);
        lect++;
        Lecture lec3 = new Lecture(3);
        lect++;
        Lecture lec4 = new Lecture(4);
        lect++;
        Lecture lec5 = new Lecture(5);
        lect++;
        Lecture lec6 = new Lecture(6);
        System.out.println(lect + " lectures");
    }

    public static void massifId() {

        Lecture[] lectures = new Lecture[3];

        for (int i = 0; i < lectures.length; i++) {
            String name = "Lecture";
            lectures[i] = new Lecture(i);
            System.out.println(name + " " + lectures[i].getId());
        }
    }
}
