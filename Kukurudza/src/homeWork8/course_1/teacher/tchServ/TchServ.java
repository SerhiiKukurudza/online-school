package homeWork8.course_1.teacher.tchServ;

import homeWork8.course_1.teacher.teacher.Tch1;
import homeWork8.course_1.teacher.teacher.Tch2;

public class TchServ {
    public static void teacher() {
        final int tch1 = Tch1.NUM;
        final int tch2 = Tch2.NUM;
        System.out.println("Vasyl Ivanovitch - teacher " + tch1);
        System.out.println("Ivan Vasilyevich - teacher " + tch2);
    }

    public static void counter() {
        int tch = 0;
        Tch1 tch1 = new Tch1(1);
        tch++;
        Tch2 tch2 = new Tch2(2);
        tch++;
        System.out.println(tch + " teacher");
    }
}
