package Module6;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {70, 20, 60, 40, 50};
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}

