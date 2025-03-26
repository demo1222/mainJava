
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExamples {

    public static void main(String[] args) {
        Examples.exercise1();
        // Examples.exercise2();
        // Examples.exercise3();
        // Examples.exercise4("Purple");
        // Examples.exercise5();
        // Examples.exercise6();
        // Examples.exercise7();
        // Examples.exercise8();
        // Examples.exercise9();
        // Examples.exercise10();
        // Examples.exercise11();
        // Examples.exercise12();
    }
}

class Examples {

    public static PriorityQueue<String> udobno() {
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors: " + colors);
        return colors;
    }

    //1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue.
    public static void exercise1() {
        PriorityQueue<String> colors = udobno();
        System.out.println("Colors: " + colors);
    }

    //2. Write a Java program to iterate through all elements in the priority queue.
    public static void exercise2() {
        PriorityQueue<String> colors = udobno();
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //3. Write a Java program to add all the elements of a priority queue to another priority queue.
    public static void exercise3() {
        PriorityQueue<String> colors = udobno();
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.addAll(colors);
        System.out.println("Colors2: " + colors2);
    }

    //4. Write a Java program to insert a given element into a priority queue.
    public static void exercise4(String givenElement) {
        PriorityQueue<String> colors = udobno();
        System.out.println("Priority queue before insertion: " + colors);
        colors.add(givenElement);

        System.out.println("After inserting '" + givenElement + "': " + colors);
    }

    //5. Write a Java program to remove all elements from a priority queue.
    public static void exercise5() {
        PriorityQueue<String> colors = udobno();
        colors.clear();
        System.out.println("Priority queue after clearing: " + colors);
    }

    //6. Write a Java program to count the number of elements in a priority queue.
    public static void exercise6() {
        PriorityQueue<String> colors = udobno();
        int count = colors.size();
        System.out.println("Number of elements in the priority queue: " + count);
    }

    //7. Write a Java program to compare two priority queues.
    public static void exercise7() {
        PriorityQueue<String> colors1 = udobno();
        PriorityQueue<String> colors2 = new PriorityQueue<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Yellow");

        System.out.println("First Priority Queue: " + colors1);
        System.out.println("Second Priority Queue: " + colors2);
        for (String element : colors1) {
            //я это от джаваскрипта знаю :З
            System.out.println(colors2.contains(element) ? element + " exists in both queues" : element + " exists only in first queue");
        }

        for (String element : colors2) {
            if (!colors1.contains(element)) {
                System.out.println(element + " exists only in second queue");
            }
        }
    }

    //8. Write a Java program to retrieve the first element of the priority queue.
    public static void exercise8() {
        PriorityQueue<String> colors = udobno();
        String firstElement = colors.peek();
        System.out.println("First element of the priority queue: " + firstElement);
    }

    //9. Write a Java program to retrieve and remove the first element.
    public static void exercise9() {
        PriorityQueue<String> colors = udobno();
        System.out.println("Priority queue before removal: " + colors);
        String firstElement = colors.poll();
        System.out.println("Removed element: " + firstElement);
        System.out.println("Priority queue after removal: " + colors);
    }

    //10. Write a Java program to convert a priority queue to an array containing all its elements.
    public static void exercise10() {
        PriorityQueue<String> colors = udobno();
        String[] array = colors.toArray(new String[0]);
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    //11. Write a Java program to convert a Priority Queue element to string representations.
    public static void exercise11() {
        PriorityQueue<String> colors = udobno();
        String str = colors.toString();
        System.out.println("String representation of the Priority Queue: " + str);
    }

    //12. Write a Java program to change priorityQueue to maximum priority queue.
    public static void exercise12() {
        PriorityQueue<String> colors = new PriorityQueue<>(Collections.reverseOrder());
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Maximum Priority Queue: " + colors);
        System.out.println("Elements in descending order:");
        while (!colors.isEmpty()) {
            System.out.println(colors.poll());
        }
    }
}
