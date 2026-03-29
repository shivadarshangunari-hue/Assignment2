package Assignment4.Module10;

public class reverse {
    public static void main(String[] args) {
        String str = "CHITRADURGA";
        String[] words = str.split(" ");

        for(String word : words){
            String rev = "";
            for(int i = word.length()-1; i >= 0; i--){
                rev += word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}

