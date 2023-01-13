package homeWork13;

import java.util.Arrays;

public class Generalization<E> {
    public E[] array;


    public int size() {
        return this.array.length;
    }


    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if ((array.length > 0) && array[i] != null) {
                return true;
            }
        }
        return false;
    }


    public E get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                return array[i];
            }
        }
        return null;
    }


    void add(int index) {
        array = Arrays.copyOf(array, array.length + index);
        for (E e : this.array) {
        }
    }


    void addE(int index, E element) {
        this.array[index] = element;
    }


    void remove(int index) {                          //6+
        this.array[index] = null;
    }

    @Override
    public String toString() {
        return "Generalization{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
