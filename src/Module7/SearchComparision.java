package Module7;

public class SearchComparision {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // element found
            }
        }
        return -1; // element not found
    }

    // Binary Search Method
    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid; // element found
            }
            else if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        int key = 23;

        // Linear Search
        int linearResult = linearSearch(arr, key);
        if (linearResult != -1)
            System.out.println("Linear Search: Element found at index " + linearResult);
        else
            System.out.println("Linear Search: Element not found");

        // Binary Search
        int binaryResult = binarySearch(arr, key);
        if (binaryResult != -1)
            System.out.println("Binary Search: Element found at index " + binaryResult);
        else
            System.out.println("Binary Search: Element not found");
    }
}


