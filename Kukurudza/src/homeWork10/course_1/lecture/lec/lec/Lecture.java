package homeWork10.course_1.lecture.lec.lec;

import homeWork10.SuperEntities;

public class Lecture extends SuperEntities {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lecture(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                '}';
    }
}
