package Module5;

public class throwskeyword {
    static void divide() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int result = a / b;   // may cause ArithmeticException
        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        try {
            divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero");
        }
    }
}

