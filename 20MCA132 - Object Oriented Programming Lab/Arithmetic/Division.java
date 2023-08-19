package Arithmetic;
public class Division implements Operations{
    int num1, num2;
    public Division(int a, int b){
        num1 = a;
        num2 = b;
    }
    public double performOperation() {
        return ((double) num1 /num2);
    }
}
