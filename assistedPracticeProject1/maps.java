package assistedPracticeProject1;
import java.util.*;
public class maps {
    public static void main(String[] args) {
        testHashMap();
        testTreeMap();
    }
    public static void testHashMap() {
        System.out.println("HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("sandy", 22);
        hashMap.put("virat", 35);
        System.out.println("Key-Value pairs in HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        boolean containsKey = hashMap.containsKey("virat");
        System.out.println("HashMap contains key 'virat': " + containsKey);
        hashMap.remove("virat");
        System.out.println("Removed key 'virat' from HashMap");
        System.out.println("Key-Value pairs in HashMap after removal:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
    public static void testTreeMap() {
        System.out.println("TreeMap:");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("tiger", 26);
        treeMap.put("Lion", 12);
        System.out.println("Key-Value pairs in TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        boolean containsKey = treeMap.containsKey("Lion");
        System.out.println("TreeMap contains key 'Lion': " + containsKey);
        treeMap.remove("Lion");
        System.out.println("Removed key 'Lion' from TreeMap");
        System.out.println("Key-Value pairs in TreeMap after removal:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}

