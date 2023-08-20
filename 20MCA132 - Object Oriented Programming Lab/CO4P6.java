class Fibonacci implements Runnable{
    private int num, old=0, current=1, next;
    public Fibonacci(int n){num = n;}
    public void run() {
        System.out.println(0);
        for (int i=0; i<num; i++){
            System.out.println("Fibonacci: "+current);
            next = current + old;
            old = current;
            current = next;
        }
    }
}

class EvenNumbers implements Runnable{
    private int NUM;
    EvenNumbers(int a){NUM=a;}
    public void run() {
        for (int i=0; i<NUM; i++){
            if (i%2 == 0)
                System.out.println("Even Numbers: "+i);
        }
    }
}
public class CO4P6 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(10);
        EvenNumbers evnum = new EvenNumbers(10);
        Thread evThread = new Thread(evnum);
        Thread fibThread = new Thread(fib);

        fibThread.start();
        evThread.start();
    }
}
