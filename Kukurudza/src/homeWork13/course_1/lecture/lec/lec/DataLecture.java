package homeWork13.course_1.lecture.lec.lec;

import homeWork13.Generalization;
import homeWork13.exetend.SuperRepository;

public class DataLecture extends SuperRepository {
    Generalization<Lecture> generalization=new Generalization<>();
    private static Lecture[] lectures = new Lecture[3];

    public static Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public String toString() {
        return "DataLecture{}";
    }
}
