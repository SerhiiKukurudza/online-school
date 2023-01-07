package homeWork10.course_1.lecture.lec.lec;

import homeWork10.SuperRepository;

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
