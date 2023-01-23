package homeWork14.course_1.lecture.lec.lec;

import homeWork14.enumRole.Person;

public class Lecture {

    private int id;
    private int courseId;
    private Person personId;
    private String name;
    private String description;

    public Lecture(int id) {
        this.id = id;
    }

    public Lecture(int id, int courseId, Person personId, String name, String description) {
        this.id = id;
        this.courseId = courseId;
        this.personId = personId;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

