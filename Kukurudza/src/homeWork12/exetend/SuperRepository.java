package homeWork12.exetend;

import homeWork12.course_1.lecture.lec.lec.DataLecture;
import homeWork12.course_1.lecture.lec.lec.Lecture;

import java.util.Arrays;

public class SuperRepository {

    public Lecture[] getAll() {
        Lecture[] lectures = new Lecture[3];
        return lectures;
    }

    public void add() {
        Lecture[] lectures = DataLecture.getLectures();
        lectures[0] = new Lecture(1);
        lectures[1] = new Lecture(2);
        lectures[2] = new Lecture(3);
        int n = lectures.length + 1;
        Lecture[] lectures1 = new Lecture[n];
        for (int i = 0; i < n - 1; i++) {
            lectures1[i] = lectures[i];
        }
        lectures1[n - 1] = new Lecture(4);
        System.out.println(Arrays.toString(lectures1));
    }

    public void getByld() {
        Lecture[] lectures = DataLecture.getLectures();
        lectures[0] = new Lecture(1);
        lectures[1] = new Lecture(2);
        lectures[2] = new Lecture(3);
        for (int i = 0; i < lectures.length; i++) {
            Lecture lecture = lectures[i];
            if (lecture.getId() == 3) {
                System.out.println(lecture);
            }
        }
    }

    public void deleteByld() {
        Lecture[] lectures = DataLecture.getLectures();
        lectures[0] = new Lecture(1);
        lectures[1] = new Lecture(2);
        lectures[2] = new Lecture(3);
        int n = lectures.length;
        Lecture[] lectures1 = new Lecture[n];
        for (int i = 0; i < n; i++) {
            Lecture lecture = lectures[i];
            if (lecture.getId() != 2) {
                lectures1[i] = lectures[i];
            }
        }
        System.out.println(Arrays.toString(lectures1));
    }

}
