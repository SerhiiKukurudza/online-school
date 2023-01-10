package homeWork12.course_1.student.student;

import homeWork12.exetend.SuperEntities;

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
