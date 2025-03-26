
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {
        // Examples.exercise1("Purple");
        // Examples.exercise2();
        // Examples.exercise3(3);
        // Examples.exercise4();
        // Examples.exercise5(3);
        // Examples.exercise6("Purple", "Yellow");
        // Examples.exercise21();
        // Examples.exercise22("Blue");
        // Examples.exercise23();
        // Examples.exercise24();
        // Examples.exercise25();
        // Examples.exercise26(2, "Pink");
    }
}

class Examples {
    //1. Write a Java program to append the specified element to the end of a linked list.

    public static LinkedList<String> udobno() {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors: " + colors);
        return colors;
    }

    public static void exercise1(String color) {
        LinkedList<String> colors = udobno();
        colors.addLast(color);
        System.out.println("Colors: " + colors);
    }

    //2. Write a Java program to iterate through all elements in a linked list.
    public static void exercise2() {
        LinkedList<String> colors = udobno();
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void exercise3(int specifiedPosition) {
        LinkedList<String> colors = udobno();
        for (int i = specifiedPosition; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }

    //4. Write a Java program to iterate a linked list in reverse order.
    public static void exercise4() {
        LinkedList<String> colors = udobno();
        for (int i = colors.size() - 1; i >= 0; i--) {
            System.out.println(colors.get(i));
        }
    }

    //5. Write a Java program to insert the specified element at the specified position in the linked list
    public static void exercise5(int specifiedPosition) {
        LinkedList<String> colors = udobno();
        colors.add(specifiedPosition, "Purple");
        System.out.println("Colors: " + colors);
    }

    //6. Write a Java program to insert elements into the linked list at the first and last positions.
    public static void exercise6(String firstElement, String lastElement) {
        LinkedList<String> colors = udobno();
        colors.addFirst(firstElement);
        colors.addLast(lastElement);
        System.out.println("Colors: " + colors);
    }

    //21. Write a Java program to retrieve, but not remove, the last element of a linked list.
    public static void exercise21() {
        LinkedList<String> colors = udobno();
        String lastElement = colors.getLast();
        System.out.println("Last element: " + lastElement);
        System.out.println("List after getting last element: " + colors);
    }

    //22. Write a Java program to check if a particular element exists in a linked list.
    public static void exercise22(String element) {
        LinkedList<String> colors = udobno();
        boolean exists = colors.contains(element);
        System.out.println("Does the list contain '" + element + "'? " + exists);
    }

    //23. Write a Java program to convert a linked list to an array list.
    public static void exercise23() {
        LinkedList<String> colors = udobno();
        ArrayList<String> colorArrayList = new ArrayList<>(colors);
        System.out.println("LinkedList: " + colors);
        System.out.println("ArrayList: " + colorArrayList);
    }

    //24. Write a Java program to compare two linked lists.
    public static void exercise24() {
        LinkedList<String> list1 = udobno();
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");
        list2.add("Yellow");
        list2.add("Orange");

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Purple");
        list3.add("Pink");
        list3.add("Black");

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);
        System.out.println("List1 equals List2? " + list1.equals(list2));
        System.out.println("List1 equals List3? " + list1.equals(list3));
    }

    //25. Write a Java program to check if a linked list is empty or not.
    public static void exercise25() {
        LinkedList<String> colors = udobno();
        System.out.println("Is the list empty? " + colors.isEmpty());

        LinkedList<String> emptyList = new LinkedList<>();
        System.out.println("Is the empty list empty? " + emptyList.isEmpty());
    }

    //26. Write a Java program to replace an element in a linked list.
    public static void exercise26(int index, String newElement) {
        LinkedList<String> colors = udobno();
        System.out.println("Before replacing: " + colors);
        colors.set(index, newElement);
        System.out.println("After replacing element at index " + index + ": " + colors);
    }
}
