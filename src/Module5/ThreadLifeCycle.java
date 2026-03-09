package Module5;

class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {

        LifeCycle t1 = new LifeCycle();

        System.out.println("State after creation: " + t1.getState());

        t1.start();

        System.out.println("State after start: " + t1.getState());
    }
}