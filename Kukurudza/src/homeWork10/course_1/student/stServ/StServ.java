package homeWork10.course_1.student.stServ;

import homeWork10.course_1.student.student.Student;


public class StServ {


    public static void counter() {
        int stud = 0;
        Student st1 = new Student(1);
        stud++;
        Student st2 = new Student(2);
        stud++;
        System.out.println(stud + " student");
    }

}
