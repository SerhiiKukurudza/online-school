package homeWork8.course_1.lecture.lec.lecServ;

import homeWork8.course_1.lecture.lec.lec.*;


public class LecSr {

    public void counter() {
        int lect = 1;
        Lec1 lec1 = new Lec1(1);
        lect++;
        Lec2 lec2 = new Lec2(2);
        lect++;
        Lec3 lec3 = new Lec3(3);
        lect++;
        Lec4 lec4 = new Lec4(4);
        lect++;
        Lec5 lec5 = new Lec5(5);
        lect++;
        Lec6 lec6 = new Lec6(6);
        System.out.println(lect + " lectures");
    }
}
