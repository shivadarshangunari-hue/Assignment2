package Module4;

public class StaticBlockExample {
    static int number;

    // Static block
    static {
        System.out.println("Static block executed");
        number = 50;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Value of number: " + number);
    }
}

