package homeWork14.course_1.teacher.teacher;

public class DataTeacher implements IntTeacher {
    private static Teacher[] teachers = new Teacher[2];

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public int size() {
        return IntTeacher.super.size();
    }

    @Override
    public boolean isEmpty() {
        return IntTeacher.super.isEmpty();
    }

    @Override
    public Teacher get(int index) {
        return IntTeacher.super.get(index);
    }

    @Override
    public void add(int index) {
        IntTeacher.super.add(index);
    }

    @Override
    public void addE(int index, Teacher element) {
        IntTeacher.super.addE(index, element);
    }

    @Override
    public void addE(int index, Object element) {

    }

    @Override
    public void remove(int index) {
        IntTeacher.super.remove(index);
    }

    @Override
    public String toString() {
        return "DataTeacher{}";
    }
}
