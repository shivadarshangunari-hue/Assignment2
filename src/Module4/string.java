package Module4;

public class string {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println("Original String: " + str);

        // Trying to modify the string
        str.concat(" World");

        System.out.println("After concat: " + str);

        // Creating a new string object
        str = str.concat(" World");

        System.out.println("New String after reassignment: " + str);
    }
}

