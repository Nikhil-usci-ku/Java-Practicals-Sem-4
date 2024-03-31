class Counter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P29_Java_multithreading {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        thread.start();
    }
}