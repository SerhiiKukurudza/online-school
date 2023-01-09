package homeWork11.course_1.student.student;

import homeWork11.exetend.SuperEntities;

public class Student extends SuperEntities {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
