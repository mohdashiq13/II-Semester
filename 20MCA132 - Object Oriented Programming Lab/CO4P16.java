import java.util.HashSet;
import java.util.Set;

public class CO4P16 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(6);
        set2.add(5);
        set2.add(2);
        set2.add(1);

        Set<Integer> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);
        Set<Integer> diffSet1 = new HashSet<>(set1);
        diffSet1.removeAll(set2);
        Set<Integer> diffSet2 = new HashSet<>(set2);
        diffSet2.removeAll(set1);

        System.out.println("Set 1: "+set1);
        System.out.println("Set 2: "+set2);
        System.out.println("Common Set: "+commonSet);
        System.out.println("Unique in Set 1: "+diffSet1);
        System.out.println("Unique in Set 1: "+diffSet2);
    }
}
