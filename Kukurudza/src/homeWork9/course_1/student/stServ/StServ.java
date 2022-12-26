package homeWork9.course_1.student.stServ;

import homeWork9.course_1.student.student.St1;
import homeWork9.course_1.student.student.St2;


public class StServ {

    public static void student() {
        final int st1 = St1.ST1;
        final int st2 = St2.ST2;
        System.out.println("Andriy - student " + st1);
        System.out.println("Serhii- student " + st2);
    }

    public static void counter() {
        int stud = 0;
        St1 st1 = new St1();
        stud++;
        St2 st2 = new St2(2);
        stud++;
        System.out.println(stud + " student");
    }

}
