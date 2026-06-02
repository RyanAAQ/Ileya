public class CaeserCipher {
    public static String cipher(String word, int shift) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        word = word.toLowerCase();

    for (int index = 0; index < word.length(); index++) {
        char letter = word.charAt(index);
            
        int position = letters.indexOf(letter);
            
        if (position == -1){
        result += letter;
        }
        else{
        int newPosition = (position + shift) % 26;
        result += letters.charAt(newPosition);
            }
        }
        return result;
    }   
    public static void main(String... args) {
        System.out.print(cipher("hello world", 3)); 
    }
}

