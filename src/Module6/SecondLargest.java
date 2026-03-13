package Module6;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 60, 8, 80, 3};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }

    public static class Linearsearch {
        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};
            int key = 30;
            int position = -1;

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == key) {
                    position = i;
                    break;
                }
            }

            if(position != -1)
                System.out.println("Element found at index: " + position);
            else
                System.out.println("Element not found");
        }
    }
}

