import java.util.Arrays;

public class LevelOne{
//LevelOne
    public static int[][] evenAndOddNumbers(int[] numbers){
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
}
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int odds = 0;
        int evens = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even[evens++] = number;
            } else {
                odd[odds++] = number;
            }
        }
        return new int[][]{odd, even}; 
    }
    
    public static boolean isPalindrome(int[] numbers){
        int left  = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] != numbers[right])
            return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static int[] perfectSquare(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            int squareRoot = (int)Math.sqrt(number);
            if (squareRoot * squareRoot == number){
            count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int number : numbers) {
            int squareRoot = (int)Math.sqrt(number);
            if (squareRoot * squareRoot == number){
            result[index++] = number;
        }
        }
        return result;
    }
}


