package homeWork14.course_1.teacher.teacher;

import java.util.Arrays;

public interface IntTeacher {
    Teacher[] teachers = new Teacher[3];


    default int size() {
        return this.teachers.length;
    }


    default boolean isEmpty() {
        for (int i = 0; i < teachers.length; i++) {
            if ((teachers.length > 0) && teachers[i] != null) {
                return true;
            }
        }
        return false;
    }

    default Teacher get(int index) {
        for (int i = 0; i < teachers.length; i++) {
            if (index == i) {
                return teachers[i];
            }
        }
        return null;
    }


    default void add(int index) {
        Teacher[] teachers2;
        for (Teacher teachers : teachers2 = Arrays.copyOf(teachers, teachers.length + index)) {

        }

        for (Teacher teacher : this.teachers) {
        }
    }


    default void addE(int index, Teacher element) {
        this.teachers[index] = element;
    }


    void addE(int index, Object element);

    default void remove(int index) {
        this.teachers[index] = null;
    }

    @Override
    String toString();
}
