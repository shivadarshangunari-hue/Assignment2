package Module4;

public class StaticBlockDemo {
    // Static variable
    static int number;

    // Static block
    static {
        System.out.println("Static block is executed.");
        number = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        System.out.println("Value of number: " + number);
    }
}

