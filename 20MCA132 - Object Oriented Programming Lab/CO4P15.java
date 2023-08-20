import java.util.LinkedHashSet;
import java.util.Set;
public class CO4P15 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of strings
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grape");
        System.out.println("LinkedHashSet elements: " + linkedHashSet);
        // Add a duplicate element
        linkedHashSet.add("Apple");
        System.out.println("LinkedHashSet elements after adding a duplicate: " + linkedHashSet);
    }
}
