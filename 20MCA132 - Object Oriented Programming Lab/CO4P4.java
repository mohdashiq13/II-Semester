import java.util.Scanner;
class NegetiveNumberException extends Exception{
    public NegetiveNumberException(String message){
        super(message);
    }
}
public class CO4P4 {
    public static void checkNumber(int a) throws NegetiveNumberException{
        if (a < 0)
            throw new NegetiveNumberException("Negative Number Not Allowed !");
    }
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] arrNum = new int[10];
        System.out.println("Numbers:-");
        for (int i=0; i<10; i++){
            try {
                arrNum[i] = sc.nextInt();
                checkNumber(arrNum[i]);
                sum += arrNum[i];
            }catch (NegetiveNumberException e){
                System.out.println(e.getMessage());
                i--;
            }
        }
        System.out.println("Average: "+(sum/10));
    }
}
