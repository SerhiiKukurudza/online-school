package homeWork14.course_1.lecture.homeWork;

public class ArrayHomeWork implements IntHomework {
    public static void arrayHomework() {
        HomeWork[] homeworks = new HomeWork[2];
        homeworks[0] = new HomeWork(1, 1, "Java_1");
        homeworks[1] = new HomeWork(1, 2, "Java_2");
        for (int i = 0; i < homeworks.length; i++) {
            System.out.println(homeworks[i]);
        }
    }

    @Override
    public int size() {
        return IntHomework.super.size();
    }

    @Override
    public boolean isEmpty() {
        return IntHomework.super.isEmpty();
    }

    @Override
    public HomeWork get(int index) {
        return IntHomework.super.get(index);
    }

    @Override
    public void addE(int index, HomeWork element) {
        IntHomework.super.addE(index, element);
    }

    @Override
    public void addE(int index, Object element) {

    }

    @Override
    public void remove(int index) {
        IntHomework.super.remove(index);
    }

}
