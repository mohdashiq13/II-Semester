package Arithmetic;
public class Addition implements Operations{
    int num1, num2;
    public Addition(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    public double performOperation() {
        return num1+num2;
    }
}
