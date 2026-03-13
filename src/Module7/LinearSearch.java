package Module7;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int found = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = i;
                break;
            }
        }

        if(found != -1)
            System.out.println("Element found at index: " + found);
        else
            System.out.println("Element not found");
    }
}

