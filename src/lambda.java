
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class lambda {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
    }

    interface MathOperation {

        int operate(int a, int b);
    }

    private static void exercise1() {

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        int a = 7, b = 3;
        System.out.println("Addition: " + addition.operate(a, b));
        System.out.println("Subtraction: " + subtraction.operate(a, b));
        System.out.println("Multiplication: " + multiplication.operate(a, b));
        System.out.println("Division: " + division.operate(a, b));
    }

    private static void exercise2() {

        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);

        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (isOdd.test(number)) {
                oddNumbers.add(number);
            }
        }

        System.out.println("Odd Numbers: " + oddNumbers);
    }

    private static void exercise3() {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted Names: " + names);
    }

    private static void exercise4() {

        List<String> words = Arrays.asList("hello", "java", "lambda");

        Function<String, String> transformer = s -> new StringBuilder(s.toUpperCase()).reverse().toString();

        List<String> transformedWords = new ArrayList<>();
        for (String word : words) {
            transformedWords.add(transformer.apply(word));
        }

        System.out.println("Transformed Strings: " + transformedWords);
    }

    private static void exercise5() {

        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");

        Consumer<String> printer = city -> System.out.println(city);

        cities.forEach(printer);
    }

    private static void exercise6() {
        System.out.println("Exercise 6: Method References");

        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");

        cities.forEach(System.out::println);
    }

    private static void exercise7() {

        int a = 25, b = 40;

        BiFunction<Integer, Integer, Integer> max = Math::max;
        BiFunction<Integer, Integer, Integer> min = Math::min;

        System.out.println("Max: " + max.apply(a, b));
        System.out.println("Min: " + min.apply(a, b));
    }
}
