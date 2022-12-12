package course_1.lecture.lec.lecServ;

import course_1.lecture.lec.lec.Lec1;
import course_1.lecture.lec.lec.Lec2;
import course_1.lecture.lec.lec.Lec3;


public class LecSr {
    public void lecture() {
        Lec1 lec1 = new Lec1();
        int lc1 = lec1.LEC;
        Lec2 lec2 = new Lec2();
        int lc2 = lec2.LEC;
        Lec3 lec3 = new Lec3();
        int lc3 = lec3.LEC;
        System.out.println("lecture №" + lc1);
        System.out.println("lecture №" + lc2);
        System.out.println("lecture №" + lc2);
    }

    public void counter() {
        int lect = 0;
        Lec1 lec1 = new Lec1();
        lect++;
        Lec2 lec2 = new Lec2();
        lect++;
        Lec3 lec3 = new Lec3();
        System.out.println(lect + " lectures");
    }

}
