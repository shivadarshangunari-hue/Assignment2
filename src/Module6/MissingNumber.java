package Module6;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2,4, 5}; // missing number is 3
        int n = 5;

        int sum = 0;
        int total = n * (n + 1) / 2;

        // Sum of array elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}

