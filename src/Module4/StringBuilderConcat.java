package Module4;

public class StringBuilderConcat {
    public static void main(String[] args) {

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings
        sb.append("Hello ");
        sb.append("World ");
        sb.append("from ");
        sb.append("Java");

        // Print concatenated string
        System.out.println("Concatenated String: " + sb.toString());
    }
}

