package collection_example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;


    
public class Collection_example {public static void main(String[] args) {
    // ArrayList Example
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    arrayList.add("Date");

    System.out.println("ArrayList Example:");
    for (String fruit : arrayList) {
        System.out.println(fruit);
    }

    // HashSet Example
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Red");
    hashSet.add("Green");
    hashSet.add("Blue");
    hashSet.add("Red"); // Duplicate value, will be ignored

    System.out.println("\nHashSet Example:");
    for (String color : hashSet) {
        System.out.println(color);
    }

    // HashMap Example
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Alice", 25);
    hashMap.put("Bob", 30);
    hashMap.put("Charlie", 28);
    hashMap.put("Alice", 27); // Overwrites the previous value for "Alice"

    System.out.println("\nHashMap Example:");
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
    }
}
}

