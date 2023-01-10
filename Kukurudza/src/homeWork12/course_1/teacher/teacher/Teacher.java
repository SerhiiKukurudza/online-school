package homeWork12.course_1.teacher.teacher;

import homeWork12.exetend.SuperEntities;

public class Teacher extends SuperEntities {

    private int id;

    public Teacher(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }
}
