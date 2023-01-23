package homeWork14.course_1.lecture.homeWork;

public interface IntHomework {
    HomeWork[] homeworks = new HomeWork[3];
    default int size() {
        return this.homeworks.length;
    }


    default boolean isEmpty() {
        for (int i = 0; i < homeworks.length; i++) {
            if ((homeworks.length > 0) && homeworks[i] != null) {
                return true;
            }
        }
        return false;
    }

    default HomeWork get(int index) {
        for (int i = 0; i < homeworks.length; i++) {
            if (index == i) {
                return homeworks[i];
            }
        }
        return null;
    }


    default void addE(int index, HomeWork element) {
        this.homeworks[index] = element;
    }


    void addE(int index, Object element);

    default void remove(int index) {
        this.homeworks[index] = null;
    }

    @Override
    String toString();
}
