import java.util.Arrays;

public class LevelOne{
 
 public static int [][] evenAndOddNumbers(int [] numbers){
    int oddCount = 0;
    int evenCount = 0;
    
    for(int number : numbers){
        if(number % 2 == 0){
            evenCount++;
        }
        else{
            oddCount++;
        }
        
        int [] even = new int[evenCount];
        int [] odd = new int[oddCount];
    }
 }   
}   
