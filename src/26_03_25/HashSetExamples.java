
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExamples {

    public static void main(String[] args) {
        // Examples.exercise1("Purple");
        // Examples.exercise2();
        // Examples.exercise3();
        // Examples.exercise4();
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

    public static HashSet<String> udobno() {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        System.out.println("Colors: " + colors);
        return colors;
    }

    //1. Write a Java program to append the specified element to the end of a hash set.
    public static void exercise1(String specifiedElement) {
        HashSet<String> colors = udobno();
        colors.add(specifiedElement);
        System.out.println("Colors after adding " + specifiedElement + ": " + colors);
    }

    //2. Write a Java program to iterate through all elements in a hash list.
    public static void exercise2() {
        HashSet<String> colors = udobno();
        for (String color : colors) {
            System.out.println(color);
        }
    }

    //3. Write a Java program to get the number of elements in a hash set.
    public static void exercise3() {
        HashSet<String> colors = udobno();
        System.out.println("Number of colors: " + colors.size());
    }

    //4. Write a Java program to empty an hash set.
    public static void exercise4() {
        HashSet<String> colors = udobno();
        colors.clear();
        System.out.println("Colors after clearing: " + colors);
    }

    //5. Write a Java program to test if a hash set is empty or not.
    public static void exercise5() {
        HashSet<String> colors = udobno();
        System.out.println("Is colors empty? " + colors.isEmpty());
    }

    //6. Write a Java program to clone a hash set to another hash set.
    public static void exercise6() {
        HashSet<String> colors = udobno();
        HashSet<String> clonedColors = new HashSet<>(colors);
        System.out.println("Cloned colors: " + clonedColors);
    }

    //7. Write a Java program to convert a hash set to an array.
    public static void exercise7() {
        HashSet<String> colors = udobno();
        String[] colorArray = new String[colors.size()];
        colors.toArray(colorArray);
        System.out.println("Colors as array: " + Arrays.toString(colorArray));
    }

    //8. Write a Java program to convert a hash set to a tree set.
    public static void exercise8() {
        HashSet<String> colors = udobno();
        TreeSet<String> treeColors = new TreeSet<>(colors);
        System.out.println("Colors as tree set: " + treeColors);
    }

    //9. Write a Java program to find numbers less than 7 in a tree set.
    public static void exercise9() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);
        System.out.println("Tree set: " + numbers);

        System.out.println("Numbers less than 7:");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.println(num);
            }
        }
        System.out.println("Numbers less than 7 (using headSet): " + numbers.headSet(7));
    }

    //10. Write a Java program to compare two hash set.
    public static void exercise10() {
        HashSet<String> colors1 = udobno();
        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Blue");
        colors2.add("Purple");
        System.out.println("Colors1: " + colors1);
        System.out.println("Colors2: " + colors2);
        System.out.println("Are colors1 and colors2 equal? " + colors1.equals(colors2));
        System.out.println("Does colors1 contain all elements of colors2? " + colors1.containsAll(colors2));
        System.out.println("Does colors2 contain all elements of colors1? " + colors2.containsAll(colors1));
    }

    //11. Write a Java program to compare two sets and retain elements that are the same.
    public static void exercise11() {
        HashSet<String> colors1 = udobno();
        HashSet<String> colors2 = new HashSet<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Purple");
        System.out.println("Colors1: " + colors1);
        System.out.println("Colors2: " + colors2);
        HashSet<String> intersection = new HashSet<>(colors1);
        intersection.retainAll(colors2);
        System.out.println("Elements in both colors1 and colors2: " + intersection);
    }

    //12. Write a Java program to remove all elements from a hash set.
    public static void exercise12() {
        HashSet<String> colors = udobno();
        System.out.println("Before clearing: " + colors);
        colors.clear();
        System.out.println("After clearing: " + colors);
    }
}
