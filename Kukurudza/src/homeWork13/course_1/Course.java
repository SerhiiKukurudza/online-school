package homeWork13.course_1;

import homeWork13.exetend.SuperEntities;

public class Course extends SuperEntities {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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


