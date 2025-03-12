import java.util.Arrays;
import java.util.List;

public class Storage<T> {

    private Object[] elements;
    private int size;
    private int defaultSize = 10;

    public Storage() {
        elements = new Object[defaultSize];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = element;
    }

    public T get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position " + position + " is out of bounds for size " + size);
        }
        return (T) elements[position];
    }

    public T remove(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position " + position + " is out of bounds for size " + size);
        }

        T removedElement = (T) elements[position];

        for (int i = position; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[--size] = null;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] " + elements[i]);
        }
    }
}

class Main {

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        System.out.println("Testing Integer Storage:");
        intStorage.add(10);
        intStorage.add(20);
        intStorage.add(30);
        intStorage.displayAll();

        System.out.println("\nGetting element at position 1: " + intStorage.get(1));

        System.out.println("\nRemoving element at position 0: " + intStorage.remove(0));
        intStorage.displayAll();

        Storage<String> stringStorage = new Storage<>();
        System.out.println("\n\nTesting String Storage:");
        stringStorage.add("Hello");
        stringStorage.add("World");
        stringStorage.add("Java");
        stringStorage.displayAll();

        System.out.println("\nGetting element at position 2: " + stringStorage.get(2));

        System.out.println("\nRemoving element at position 1: " + stringStorage.remove(1));
        System.out.println("After removal:");
        stringStorage.displayAll();

        Storage<Double> doubleStorage = new Storage<>();
        doubleStorage.add(1.5);
        doubleStorage.add(2.7);
        doubleStorage.add(3.14);
        doubleStorage.displayAll();

        System.out.println("\nGetting element at position 0: " + doubleStorage.get(0));

        doubleStorage.remove(2);
        doubleStorage.displayAll();

        System.out.println("\n\nTesting utility method with a list:");
        List<String> stringList = Arrays.asList("A", "B", "G");
    }
}
