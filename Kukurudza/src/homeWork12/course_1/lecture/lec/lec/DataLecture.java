package homeWork12.course_1.lecture.lec.lec;

import homeWork12.exetend.SuperRepository;

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
