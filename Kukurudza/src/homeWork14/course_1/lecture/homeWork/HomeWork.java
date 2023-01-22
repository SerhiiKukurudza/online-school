package homeWork14.course_1.lecture.homeWork;

import homeWork14.course_1.lecture.lec.lec.Lecture;

public class HomeWork {
    private int id;
    private Lecture lectureId;
    private String task;

    public HomeWork(int id, Lecture lectureId, String task) {
        this.id = id;
        this.lectureId = lectureId;
        this.task = task;
    }

    public HomeWork(int id, int i, String java_1) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lecture getLectureId() {
        return lectureId;
    }

    public void setLectureId(Lecture lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", task='" + task + '\'' +
                '}';
    }
}
