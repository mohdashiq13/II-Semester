import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class CO4P18 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 5);
        hashMap.put("Grape", 4);
        System.out.println("HashMap: " + hashMap);
        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}
