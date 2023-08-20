import java.util.ArrayList;

public class CO4P10 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("ArrayList insertion:-");
        strings.add("Muhamed Ashiq");
        strings.add("Ashin Stephen");
        strings.add("Jeevarag NP");
        strings.add("Kiran Chacko");
        strings.add("Godwin");
        strings.add("Toms C Jose");
        strings.add("Soughand");
        System.out.println(strings);
        System.out.println("Item in Index no: 3:- "+strings.get(2));
        strings.set(0, "Hashim");
        System.out.println("Updated ArrayList:- ");
        System.out.println(strings);
        strings.remove(1);
        System.out.println("After Removing item in index 1:-");
        System.out.println(strings);
        strings.clear();
        System.out.println("Cleared the ArrayList:-");
        System.out.println(strings);
    }
}
