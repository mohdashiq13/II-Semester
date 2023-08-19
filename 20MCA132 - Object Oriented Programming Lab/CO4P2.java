import Arithmetic.Addition;
import Arithmetic.Division;
import Arithmetic.Multiplication;
import Arithmetic.Subtraction;

public class CO4P2 {
    public static void main(String[] args) {
        Addition a = new Addition(100,500);
        Subtraction s = new Subtraction(120,20);
        Multiplication m = new Multiplication(10,20);
        Division d = new Division(30, 2);

        System.out.println("Result of Class Addition: "+a.performOperation());
        System.out.println("Result of Class Subtraction: "+s.performOperation());
        System.out.println("Result of Class Multiplication: "+m.performOperation());
        System.out.println("Result of Class Division: "+d.performOperation());
    }
}
