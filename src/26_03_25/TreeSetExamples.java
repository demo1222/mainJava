
import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {
        // Examples.exercise1();
        // Examples.exercise2();
        // Examples.exercise3();
        // Examples.exercise4();
        // Examples.exercise5();
        // Examples.exercise6();
        // Examples.exercise11("Green");
        // Examples.exercise12("Green");
        // Examples.exercise13("Green");
        // Examples.exercise14();
        // Examples.exercise15();
        // Examples.exercise16("Green");
    }
}

class Examples {

    public static TreeSet<String> udobno() {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors: " + colors);
        return colors;
    }

    //1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
    public static void exercise1() {
        TreeSet<String> colors = udobno();
        System.out.println("Colors: " + colors);
    }

    //2. Write a Java program to iterate through all elements in a tree set.
    public static void exercise2() {
        TreeSet<String> colors = udobno();
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //3. Write a Java program to add all the elements of a specified tree set to another tree set.
    public static void exercise3() {
        TreeSet<String> colors = udobno();
        TreeSet<String> colors2 = new TreeSet<>();
        colors2.addAll(colors);
        System.out.println("Colors2: " + colors2);
        // TreeSet<String> colors3 = new TreeSet<>();
        // for (String color: colors) {
        //     colors3.add(color);
        // }
    }

    //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
    public static void exercise4() {
        TreeSet<String> colors = udobno();
        TreeSet<String> reverseColors = (TreeSet<String>) colors.descendingSet();
        System.out.println("Reverse colors: " + reverseColors);
    }

    //5. Write a Java program to get the first and last elements in a tree set.
    public static void exercise5() {
        TreeSet<String> colors = udobno();
        System.out.println("First color: " + colors.first());
        System.out.println("Last color: " + colors.last());
    }

    //6. Write a Java program to clone a tree set list to another tree set.
    public static void exercise6() {
        TreeSet<String> colors = udobno();
        TreeSet<String> colors2 = (TreeSet<String>) colors.clone();
        System.out.println("Colors2: " + colors2);
    }

    //11. Write a Java program to get the element in a tree set less than or equal to the given element.
    public static void exercise11(String element) {
        TreeSet<String> colors = udobno();
        System.out.println("Element less than or equal to " + element + ": " + colors.floor(element));
    }

    //12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
    public static void exercise12(String element) {
        TreeSet<String> colors = udobno();
        System.out.println("Element greater than or equal to " + element + ": " + colors.ceiling(element));
    }

    //13. Write a Java program to get an element in a tree set that has a lower value than the given element.
    public static void exercise13(String element) {
        TreeSet<String> colors = udobno();
        System.out.println("Element lower than " + element + ": " + colors.lower(element));
    }

    //14. Write a Java program to retrieve and remove the first element of a tree set.
    public static void exercise14() {
        TreeSet<String> colors = udobno();
        System.out.println("First element (will be removed): " + colors.pollFirst());
        System.out.println("TreeSet after removing first element: " + colors);
    }

    //15. Write a Java program to retrieve and remove the last element of a tree set.
    public static void exercise15() {
        TreeSet<String> colors = udobno();
        System.out.println("Last element (will be removed): " + colors.pollLast());
        System.out.println("TreeSet after removing last element: " + colors);
    }

    //16. Write a Java program to remove a given element from a tree set.
    public static void exercise16(String elementToRemove) {
        TreeSet<String> colors = udobno();
        boolean removed = colors.remove(elementToRemove);
        System.out.println("Element '" + elementToRemove + "' removed: " + removed);
        System.out.println("TreeSet after removal: " + colors);
    }
}
