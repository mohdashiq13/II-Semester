package Arithmetic;
public class Multiplication implements Operations{
    int num1, num2;
    public Multiplication(int a, int b){
        num1 = a;
        num2 = b;
    }
    public double performOperation() {
        return num1*num2;
    }
}
