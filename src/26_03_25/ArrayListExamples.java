
import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        // Examples.exercise1();
        // Examples.exercise2();
        // Examples.exercise3();
        // Examples.exercise4(2);
        // Examples.exercise5(2, "Purple");
        // Examples.exercise6();
        // Examples.exercise17();
        // Examples.exercise18();
        Examples.exercise19();
        Examples.exercise20();
        // Examples.exercise21("Pink");
        // Examples.exercise22();
    }
}

class Examples {

    //1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
    public static ArrayList<String> exercise1() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors: " + colors);
        return colors;
    }

    //2. Write a Java program to iterate through all elements in an array list.
    public static void exercise2() {
        ArrayList<String> colors = exercise1();
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //3. Write a Java program to insert an element into the array list at the first position.
    public static void exercise3() {
        ArrayList<String> colors = exercise1();
        colors.add(0, "Purple");
        System.out.println("Colors: " + colors);
    }

    //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void exercise4(int index) {
        ArrayList<String> colors = exercise1();
        String element = colors.get(index);
        System.out.println("Element at index " + index + ": " + element);
    }

    //5. Write a Java program to update an array element by the given element.
    public static void exercise5(int oldIndex, String newColor) {
        ArrayList<String> colors = exercise1();
        colors.set(oldIndex, newColor);
        System.out.println("Colors: " + colors);
    }

    //6. Write a Java program to remove the third element from an array list.
    public static void exercise6() {
        ArrayList<String> colors = exercise1();
        colors.remove(2);
        System.out.println("Colors: " + colors);
    }

    //17. Write a Java program to empty an array list.
    public static void exercise17() {
        ArrayList<String> colors = exercise1();
        System.out.println("Before clearing: " + colors);
        colors.clear();
        System.out.println("After clearing: " + colors);
    }

    //18. Write a Java program to test whether an array list is empty or not.
    public static void exercise18() {
        ArrayList<String> colors = exercise1();
        System.out.println("Is the ArrayList empty? " + colors.isEmpty());
        colors.clear();
        System.out.println("After clearing, is the ArrayList empty? " + colors.isEmpty());
    }

    //19. Write a Java program for trimming the capacity of an array list.
    public static void exercise19() {
        ArrayList<String> colors = exercise1();
        System.out.println("Before trimming: " + colors);
        colors.trimToSize();
        System.out.println("After trimming capacity: " + colors);
    }

    //20. Write a Java program to increase an array list size.
    public static void exercise20() {
        ArrayList<String> colors = exercise1();
        System.out.println("Current size: " + colors.size());
        colors.ensureCapacity(10);
        for (int i = 0; i < 5; i++) {
            colors.add("Color" + (i + 1));
        }
        System.out.println("After increasing size: " + colors);
        System.out.println("New size: " + colors.size());
    }

    //21. Write a Java program to replace the second element of an ArrayList with the specified element.
    public static void exercise21(String newColor) {
        ArrayList<String> colors = exercise1();
        System.out.println("Before replacement: " + colors);
        colors.set(1, newColor);
        System.out.println("After replacing second element: " + colors);
    }

    //22. Write a Java program to print all the elements of an ArrayList using the elements' position.
    public static void exercise22() {
        ArrayList<String> colors = exercise1();
        System.out.println("Elements by position:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
