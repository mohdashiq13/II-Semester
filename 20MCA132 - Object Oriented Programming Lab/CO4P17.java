import java.util.HashMap;
import java.util.Map;
public class CO4P17 {
    public static void main(String[] args) {
        // Create a HashMap to store employee information (ID, Name)
        Map<Integer, String> employeeMap = new HashMap<>();
        // Add elements to the map
        employeeMap.put(101, "John");
        employeeMap.put(102, "Alice");
        employeeMap.put(103, "Bob");
        // Display the map
        System.out.println("Employee Map: " + employeeMap);
        // Change the name of an employee
        employeeMap.put(102, "Eve");
        // Display the updated map
        System.out.println("Updated Employee Map: " + employeeMap);
        // Remove an employee
        employeeMap.remove(101);
        // Display the map after removing an employee
        System.out.println("Employee Map after removing an employee: " + employeeMap);
    }
}
