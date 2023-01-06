package homeWork9.course_1.teacher.tchServ;

import homeWork9.course_1.teacher.teacher.Teacher;
import homeWork9.course_1.teacher.teacher.Tch2;

public class TchServ {
    public static void teacher() {
        final int tch1 = Teacher.NUM;
        final int tch2 = Tch2.NUM;
        System.out.println("Vasyl Ivanovitch - teacher " + tch1);
        System.out.println("Ivan Vasilyevich - teacher " + tch2);
    }

    public static void counter() {
        int tch = 0;
        Teacher tch1 = new Teacher(1);
        tch++;
        Tch2 tch2 = new Tch2(2);
        tch++;
        System.out.println(tch + " teacher");
    }
}
