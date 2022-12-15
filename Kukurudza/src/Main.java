import course_1.lecture.lec.lec.*;
import course_1.lecture.lec.lecServ.LecSr;

public class Main {
    public static void main(String[] args) {

        Lec1 lec1 = new Lec1(1);
        Lec2 lec2 = new Lec2(2);
        Lec3 lec3 = new Lec3(3);
        Lec4 lec4 = new Lec4(4);
        Lec5 lec5 = new Lec5(5);
        Lec6 lec6 = new Lec6(6);
        System.out.println(lec6.id);
        LecSr lecSr1 = new LecSr();
        lecSr1.counter();
    }
}