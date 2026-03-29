package Assignment4.Module10;

public class longestword {
    public static void main(String[] args) {
        String str = "namma bengaluru namma hemme";
        String[] words = str.split(" ");

        String longest = "";

        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}

