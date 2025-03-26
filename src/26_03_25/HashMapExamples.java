
import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {
        Examples.exercise1();
        Examples.exercise2();
        Examples.exercise3();
        Examples.exercise4();
        Examples.exercise5();
        Examples.exercise6();
        Examples.exercise7();
        Examples.exercise8();
        Examples.exercise9();
        Examples.exercise10();
        Examples.exercise11();
        Examples.exercise12();
    }
}

class Examples {

    public static HashMap<String, String> udobno() {
        HashMap<String, String> colorMap = new HashMap<>();
        colorMap.put("Red", "#FF0000");
        colorMap.put("Green", "#00FF00");
        colorMap.put("Blue", "#0000FF");
        colorMap.put("Yellow", "#FFFF00");
        colorMap.put("Orange", "#FFA500");
        System.out.println("Color Map: " + colorMap);
        return colorMap;
    }

    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void exercise1() {
        HashMap<String, String> colorMap = udobno();
        colorMap.put("Purple", "#800080");
        System.out.println("After adding new color: " + colorMap);
    }

    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void exercise2() {
        HashMap<String, String> colorMap = udobno();
        int size = colorMap.size();
        System.out.println("Size of the HashMap: " + size);
    }

    //3. Write a Java program to copy all mappings from the specified map to another map.
    public static void exercise3() {
        HashMap<String, String> colorMap = udobno();
        HashMap<String, String> newColorMap = new HashMap<>();
        newColorMap.put("Black", "#000000");
        newColorMap.put("White", "#FFFFFF");
        System.out.println("Original new map: " + newColorMap);
        newColorMap.putAll(colorMap);
        System.out.println("After copying all mappings: " + newColorMap);
    }

    //4. Write a Java program to remove all mappings from a map.
    public static void exercise4() {
        HashMap<String, String> colorMap = udobno();
        System.out.println("Before clearing: " + colorMap);
        colorMap.clear();
        System.out.println("After clearing: " + colorMap);
    }

    //5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void exercise5() {
        HashMap<String, String> colorMap = udobno();
        System.out.println("Is map empty? " + colorMap.isEmpty());
        colorMap.clear();
        System.out.println("After clearing, is map empty? " + colorMap.isEmpty());
    }

    //6. Write a Java program to get a shallow copy of a HashMap instance.
    public static void exercise6() {
        HashMap<String, String> colorMap = udobno();
        HashMap<String, String> clonedMap = (HashMap<String, String>) colorMap.clone();
        System.out.println("Original map: " + colorMap);
        System.out.println("Cloned map: " + clonedMap);
        colorMap.put("Pink", "#FFC0CB");
        System.out.println("Original map after modification: " + colorMap);
        System.out.println("Cloned map after original was modified: " + clonedMap);
    }

    //7. Write a Java program to test if a map contains a mapping for the specified key.
    public static void exercise7() {
        HashMap<String, String> colorMap = udobno();
        String keyToCheck = "Green";
        String nonExistentKey = "Brown";
        System.out.println("Map contains key '" + keyToCheck + "': " + colorMap.containsKey(keyToCheck));
        System.out.println("Map contains key '" + nonExistentKey + "': " + colorMap.containsKey(nonExistentKey));
    }

    //8. Write a Java program to test if a map contains a mapping for the specified value.
    public static void exercise8() {
        HashMap<String, String> colorMap = udobno();
        String valueToCheck = "#00FF00";
        String nonExistentValue = "#123456";
        System.out.println("Map contains value '" + valueToCheck + "': " + colorMap.containsValue(valueToCheck));
        System.out.println("Map contains value '" + nonExistentValue + "': " + colorMap.containsValue(nonExistentValue));
    }

    //9. Write a Java program to create a set view of the mappings contained in a map.
    public static void exercise9() {
        HashMap<String, String> colorMap = udobno();
        System.out.println("Set view of mappings:");
        colorMap.entrySet().forEach(entry
                -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }

    //10. Write a Java program to get the value of a specified key in a map.
    public static void exercise10() {
        HashMap<String, String> colorMap = udobno();
        String keyToGet = "Blue";
        String nonExistentKey = "Purple";
        System.out.println("Value for key '" + keyToGet + "': " + colorMap.get(keyToGet));
        System.out.println("Value for non-existent key '" + nonExistentKey + "': " + colorMap.get(nonExistentKey));
        System.out.println("Value for non-existent key using getOrDefault: "
                + colorMap.getOrDefault(nonExistentKey, "Key not found"));
    }

    //11. Write a Java program to get a set view of the keys contained in this map.
    public static void exercise11() {
        HashMap<String, String> colorMap = udobno();
        System.out.println("Set view of keys in the map: " + colorMap.keySet());
        System.out.println("Iterating through keys:");
        for (String key : colorMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }

    //12. Write a Java program to get a collection view of the values contained in this map.
    public static void exercise12() {
        HashMap<String, String> colorMap = udobno();
        System.out.println("Collection view of values in the map: " + colorMap.values());
        System.out.println("Iterating through values:");
        for (String value : colorMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
