package homeWork14.course_1.lecture.lec.lec;

import java.util.Arrays;

public interface IntLecture {
    Lecture[] lecture = new Lecture[3];


    default int size() {
        return this.lecture.length;
    }


    default boolean isEmpty() {
        for (int i = 0; i < lecture.length; i++) {
            if ((lecture.length > 0) && lecture[i] != null) {
                return true;
            }
        }
        return false;
    }

    default Lecture get(int index) {
        for (int i = 0; i < lecture.length; i++) {
            if (index == i) {
                return lecture[i];
            }
        }
        return null;
    }


    default void add(int index) {
        Lecture[] lecture2;
        for (Lecture lecture1 : lecture2 = Arrays.copyOf(lecture, lecture.length + index)) {

        }

        for (Lecture lecture : this.lecture) {
        }
    }


    default void addE(int index, Lecture element) {
        this.lecture[index] = element;
    }


    void addE(int index, Object element);

    default void remove(int index) {
        this.lecture[index] = null;
    }

    @Override
    public String toString();

}

