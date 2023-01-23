package homeWork14.course_1.student.student;

public interface IntStudent {
    Student[] students = new Student[3];

    default int size() {
        return this.students.length;
    }


    default boolean isEmpty() {
        for (int i = 0; i < students.length; i++) {
            if ((students.length > 0) && students[i] != null) {
                return true;
            }
        }
        return false;
    }

    default Student get(int index) {
        for (int i = 0; i < students.length; i++) {
            if (index == i) {
                return students[i];
            }
        }
        return null;
    }


    default void addE(int index, Student element) {
        this.students[index] = element;
    }


    void addE(int index, Object element);

    default void remove(int index) {
        this.students[index] = null;
    }
}
