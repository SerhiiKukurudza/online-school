package homeWork12.enumRole;

public class Person {
    private int courseId;
    private Role role;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "courseId=" + courseId +
                ", role=" + role +
                '}';
    }
}
