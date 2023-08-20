import java.util.LinkedList;
import java.util.Scanner;
public class CO4P8 {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            System.out.print("Element: ");
            stack.addFirst(sc.nextInt());
            System.out.println("Current Stack: "+stack);
            System.out.print("Do you want to insert more (y/n):");
            if (sc.next().equalsIgnoreCase("n"))
                flag = false;
        }
        while (!stack.isEmpty()){
            try {
                System.out.println("Current Stack: "+stack);
                stack.removeFirst();
                Thread.sleep(200);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
