package Module5;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: Cannot divide by zero");
        }

        System.out.println("Program continues after exception handling.");
    }
}


