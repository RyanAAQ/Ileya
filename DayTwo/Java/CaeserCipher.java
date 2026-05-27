public class CaeserCipher{
    public static String cipher(String word, int shift) {
        String result = "";

        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);
            
            char shiftedLetter = (char)(letter + shift);
            result += shiftedLetter;
        }
        return result;
    }
}

