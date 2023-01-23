package homeWork14.course_1.student.student;

public class DataStudent implements IntStudent{
    private static Student[] students = new Student[2];

    public static Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "DataStudent{}";
    }

    @Override
    public int size() {
        return IntStudent.super.size();
    }

    @Override
    public boolean isEmpty() {
        return IntStudent.super.isEmpty();
    }

    @Override
    public Student get(int index) {
        return IntStudent.super.get(index);
    }

    @Override
    public void addE(int index, Student element) {
        IntStudent.super.addE(index, element);
    }

    @Override
    public void addE(int index, Object element) {

    }

    @Override
    public void remove(int index) {
        IntStudent.super.remove(index);
    }
}
