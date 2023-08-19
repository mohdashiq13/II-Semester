package Arithmetic;
public class Subtraction implements Operations{
    int num1, num2;
    public Subtraction(int a, int b){
        num1 = a;
        num2 = b;
    }
    @Override
    public double performOperation() {
        return num1-num2;
    }
}
