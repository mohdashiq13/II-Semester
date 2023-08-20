import java.util.LinkedList;
import java.util.Scanner;

public class CO4P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> obj = new LinkedList<>();
        boolean flag = true;

        System.out.println("Inserting elements to LinkedList:-");
        while (flag){
            System.out.print("Element:-");
            obj.add(sc.nextInt());
            System.out.println("LinkedList:- "+obj);
            System.out.print("Do you want to insert more (y/n):-");
            if (sc.next().equalsIgnoreCase("n"))
                flag = false;
        }

        obj.clear();

        System.out.println("After Removing all Elements :-"+obj);
    }
}
