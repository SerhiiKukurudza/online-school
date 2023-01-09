package homeWork11.course_1.lecture.lec.lec;

import homeWork11.Person;
import homeWork11.exetend.SuperEntities;

public class Lecture extends SuperEntities {

    private int id;
    private Person personId;

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

    public Lecture(int id, Person personId) {
        this.id = id;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", personId=" + personId +
                '}';
    }
}
