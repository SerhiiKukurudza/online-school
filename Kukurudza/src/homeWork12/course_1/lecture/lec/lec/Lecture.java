package homeWork12.course_1.lecture.lec.lec;

import homeWork12.enumRole.Person;
import homeWork12.exetend.SuperEntities;

public class Lecture extends SuperEntities {

    private int id;
    private Person personId;
    private String name;
    private String description;

    public Lecture(int id, Person personId, String name, String description) {
        this.id = id;
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

    public Lecture(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

