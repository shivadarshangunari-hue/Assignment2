package Module5;

// Implement Runnable interface
class MyRunnable implements Runnable {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();   // object of class
        Thread t = new Thread(r);          // create thread

        t.start();   // start thread
    }
}