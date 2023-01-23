package homeWork14.course_1.lecture.lec.lec;

import homeWork13.Generalization;

public class DataLecture implements IntLecture{
     static Lecture[] lectures = new Lecture[3];

    public static Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public int size() {
        return IntLecture.super.size();
    }

    @Override
    public boolean isEmpty() {
        return IntLecture.super.isEmpty();
    }

    @Override
    public Lecture get(int index) {
        return IntLecture.super.get(index);
    }

    @Override
    public void add(int index) {
        IntLecture.super.add(index);
    }

    @Override
    public void addE(int index, Lecture element) {
        IntLecture.super.addE(index, element);
    }

    @Override
    public void addE(int index, Object element) {

    }

    @Override
    public void remove(int index) {
        IntLecture.super.remove(index);
    }

    @Override
    public String toString() {
        return "DataLecture{}";
    }
}
