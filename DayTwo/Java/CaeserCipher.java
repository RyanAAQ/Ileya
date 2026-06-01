public class CaeserCipher{
    public static String cipher(String word, int shift){
    
    String letters = "abcdefghijklmnopqrstuvwxyz";
    String result = "";

    for (int index = 0; index < word.length(); index++) {
    char letter = word.charAt(index);
            
    int position = letters.indexOf(letter);
            
    int newPosition = position + shift;
    result += letters.charAt(newPosition);
        }
        return result;
    }
}

