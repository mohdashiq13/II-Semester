class Multiplication extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println("Multiplication: "+i+"x"+5+"="+(i*5));
        }
    }
}
class PrimeNumber extends Thread {
    private int n;

    public PrimeNumber(int num) {
        n = num;
    }
    private boolean isPrime(int nu) {
        if (nu <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nu); i++) {
            if (nu % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void run() {
        System.out.println("First " + n + " prime numbers:");
        int foundPrimes = 0;
        int num = 2;
        while (foundPrimes < n) {
            if (isPrime(num)) {
                System.out.println(num);
                foundPrimes++;
            }
            num++;
        }
        System.out.println();
    }
}

public class CO4P5 {
    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        PrimeNumber prim = new PrimeNumber(10);

        mul.start();
        prim.start();
    }
}
