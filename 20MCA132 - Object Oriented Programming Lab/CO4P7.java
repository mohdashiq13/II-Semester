// Producer/Consumer using ITC

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
    BlockingQueue<Integer> product;
    public Producer(BlockingQueue<Integer> obj){
        product = obj;
    }
    @Override
    public void run() {
    }
}

class Consumer implements Runnable{
    @Override
    public void run() {
    }
}
public class CO4P7 {
    public static void main(String[] args) {
        Producer p = new Producer(10);
        Consumer c = new Consumer();

        Thread pt = new Thread(p);
        Thread ct = new Thread(c);

        pt.start();
        ct.start();
    }
}
