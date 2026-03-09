package Module5;

public class Synchronization {

    public static void main(String[] args) {

        Counter c = new Counter();

        c.increment();
        c.increment();

        System.out.println("Count: " + c.count);

    }

}
