package homeWork10.course_1.teacher.teacher;

import homeWork10.SuperRepository;

public class DataTeacher extends SuperRepository {
    private static Teacher[] teachers = new Teacher[2];

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "DataTeacher{}";
    }
}
