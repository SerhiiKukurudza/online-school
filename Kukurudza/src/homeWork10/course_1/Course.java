package homeWork10.course_1;

import homeWork10.SuperEntities;

public class Course extends SuperEntities {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course(int id) {
        this.id = id;
    }
}


