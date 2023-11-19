package HW6;
import java.util.Arrays;

public class StackArray<T> {
    private T[] data;
    private int size = 0;

    public StackArray () {
        this(16);
    };
    public StackArray (int capacity) {
        data = (T[]) new Object[capacity];
    };

    public T peek() {
        return data[(size - 1)];
    };

    public T pop() {
        if (size == 0) {
            return null;
        }
        size--;
        T savedData = data[size];
        data[size] = null;
        return savedData;
    }

    public void push(T newElement) {
        if (size == data.length) {
            data = Arrays.copyOf(data, 2 * data.length);
        }
        data[size] = newElement;
        size++;
    };

    public boolean isEmpty() {
        return size == 0;
    };

    public int getSize() {
        return size;
    };
};
