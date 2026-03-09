package Module5;
class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();  // create object
        t1.start();   // start thread
    }
}