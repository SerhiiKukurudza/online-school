package homeWork14.course_1.lecture.lec.lecServ;

import homeWork13.Generalization;
import homeWork14.course_1.lecture.lec.lec.Lecture;
import homeWork14.enumRole.Person;
import homeWork14.enumRole.Role;


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
        Person teacher = new Person(1, Role.TEACHER);
        Generalization<Lecture> generalization = new Generalization<>();

        generalization.array = new Lecture[3];
        generalization.array[0] = new Lecture(1, 1, teacher, "Lecture_1", "Java1");
        generalization.array[1] = new Lecture(2, 1, teacher, "Lecture_2", "Java2");
        generalization.array[2] = new Lecture(3, 1, teacher, "Lecture_5", "Java3");
        for (int i = 0; i < generalization.array.length; i++) {
            System.out.println(generalization.array[i]);
        }
    }
}
