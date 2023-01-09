package homeWork11.course_1.lecture.lec.lec;

import homeWork11.exetend.SuperRepository;

public class DataLecture extends SuperRepository {
    private static Lecture[] lectures = new Lecture[8];

    public static Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public String toString() {
        return "DataLecture{}";
    }
}
