public class CaeserCipher {
    public static String cipher(String word, int shift) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String letterss = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        boolean upperCase = letters.toUpperCase();
      
      if(upperCase){      
        if (position == -1){
        result += letter;
        }
}
        else{
        int newPosition = (position + shift) % 26;

        result += letters.charAt(newPosition);
        return result;
    }
    }   
    public static void main(String... args) {
        System.out.print(cipher("hello world", 3)); 
    }
}


