
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamples {

    public static void main(String[] args) {
        // Examples.exercise1();
        // Examples.exercise2();
        // Examples.exercise3("Green");
        // Examples.exercise4("#FF0000");
        // Examples.exercise5();
        // Examples.exercise6();
        // Examples.exercise20();
        // Examples.exercise21("Blue", "Orange");
        // Examples.exercise22("Blue", "Orange");
        // Examples.exercise23("Green");
        // Examples.exercise24("Green");
        Examples.exercise25("Green");
        // Examples.exercise26("Green");
    }
}

class Examples {

    public static TreeMap<String, String> udobno() {
        TreeMap<String, String> colorMap = new TreeMap<>();
        colorMap.put("Red", "#FF0000");
        colorMap.put("Green", "#00FF00");
        colorMap.put("Blue", "#0000FF");
        colorMap.put("Yellow", "#FFFF00");
        colorMap.put("Orange", "#FFA500");
        System.out.println("Color Map: " + colorMap);
        return colorMap;
    }

    //1. Write a Java program to associate the specified value with the specified key in a Tree Map.
    public static void exercise1() {
        TreeMap<String, String> colorMap = udobno();
        colorMap.put("Purple", "#800080");
        System.out.println("After adding new color: " + colorMap);
    }

    //2. Write a Java program to copy Tree Map's content to another Tree Map.
    public static void exercise2() {
        TreeMap<String, String> colorMap = udobno();
        TreeMap<String, String> newColorMap = new TreeMap<>();
        newColorMap.put("Black", "#000000");
        newColorMap.put("White", "#FFFFFF");
        System.out.println("Original new map: " + newColorMap);
        newColorMap.putAll(colorMap);
        System.out.println("After copying all mappings: " + newColorMap);
    }

    //3. Write a Java program to search for a key in a Tree Map.
    public static void exercise3(String keyToSearch) {
        TreeMap<String, String> colorMap = udobno();
        if (colorMap.containsKey(keyToSearch)) {
            System.out.println("Key '" + keyToSearch + "' found with value: " + colorMap.get(keyToSearch));
        } else {
            System.out.println("Key '" + keyToSearch + "' not found in the TreeMap");
        }
    }

    //4. Write a Java program to search for a value in a Tree Map.
    public static void exercise4(String valueToSearch) {
        TreeMap<String, String> colorMap = udobno();
        boolean found = false;
        for (Map.Entry<String, String> entry : colorMap.entrySet()) {
            if (entry.getValue().equals(valueToSearch)) {
                System.out.println("Value '" + valueToSearch + "' found with key: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Value '" + valueToSearch + "' not found in the TreeMap");
        }
    }

    //5. Write a Java program to get all keys from a Tree Map.
    public static void exercise5() {
        TreeMap<String, String> colorMap = udobno();
        Set<String> keys = colorMap.keySet();
        System.out.println("All keys from the TreeMap: " + keys);
        System.out.println("Iterating through each key:");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    //6. Write a Java program to delete all elements from a Tree Map.
    public static void exercise6() {
        TreeMap<String, String> colorMap = udobno();
        System.out.println("TreeMap before clearing: " + colorMap);
        colorMap.clear();
        System.out.println("TreeMap after clearing: " + colorMap);
        System.out.println("Is TreeMap empty? " + colorMap.isEmpty());
    }

    //20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
    public static void exercise20() {
        TreeMap<String, String> colorMap = udobno();
        Map.Entry<String, String> lastEntry = colorMap.pollLastEntry();
        System.out.println("Removed last entry: " + lastEntry.getKey() + " -> " + lastEntry.getValue());
        System.out.println("Map after removing last entry: " + colorMap);
    }

    //21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
    public static void exercise21(String fromKey, String toKey) {
        TreeMap<String, String> colorMap = udobno();
        Map<String, String> subMap = colorMap.subMap(fromKey, toKey);
        System.out.println("SubMap from '" + fromKey + "' (inclusive) to '" + toKey + "' (exclusive): " + subMap);
    }

    //22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
    public static void exercise22(String fromKey, String toKey) {
        TreeMap<String, String> colorMap = udobno();
        Map<String, String> subMap = colorMap.subMap(fromKey, true, toKey, true);
        System.out.println("SubMap from '" + fromKey + "' to '" + toKey + "' (both inclusive): " + subMap);
    }

    //23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
    public static void exercise23(String fromKey) {
        TreeMap<String, String> colorMap = udobno();
        Map<String, String> tailMap = colorMap.tailMap(fromKey);
        System.out.println("TailMap from '" + fromKey + "' (inclusive): " + tailMap);
    }

    //24. Write a Java program to get a portion of a map whose keys are greater than a given key.
    public static void exercise24(String fromKey) {
        TreeMap<String, String> colorMap = udobno();
        Map<String, String> tailMap = colorMap.tailMap(fromKey, false);
        System.out.println("TailMap from '" + fromKey + "' (exclusive): " + tailMap);
    }

    //25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
    public static void exercise25(String key) {
        TreeMap<String, String> colorMap = udobno();
        Map.Entry<String, String> ceilingEntry = colorMap.ceilingEntry(key);
        if (ceilingEntry != null) {
            System.out.println("Ceiling entry for key '" + key + "': " + ceilingEntry.getKey() + " -> " + ceilingEntry.getValue());
        } else {
            System.out.println("No ceiling entry found for key '" + key + "'");
        }
    }

    //26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    public static void exercise26(String key) {
        TreeMap<String, String> colorMap = udobno();
        String ceilingKey = colorMap.ceilingKey(key);
        if (ceilingKey != null) {
            System.out.println("Ceiling key for '" + key + "': " + ceilingKey);
        } else {
            System.out.println("No ceiling key found for '" + key + "'");
        }
    }
}
