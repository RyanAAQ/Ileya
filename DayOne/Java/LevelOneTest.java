import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LevelOneTest{

    @Test
    public void testEvenAndOddNumbersAreDisplayed() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] expected = {{1, 3, 5, 7, 9}, {2, 4, 6 ,8, 10}};
        int[][] actual = LevelOne.evenAndOddNumbers(numbers);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testThatTheContentOfTheArrayIsAPalindrome(){
        int [] numbers = {1, 2, 3, 2, 1};
        boolean actual = LevelOne.isPalindrome(numbers);
        boolean expected = true;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatTheContentOfTheArrayIsNotAPalindrome(){ 
        int [] numbers = {1, 2, 3, 2, 1, 1, 2, 3};
        boolean actual = LevelOne.isPalindrome(numbers);
        boolean expected = false;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testThatTheFunctionReturnsAnArrayWithPerfectSquare(){
        int[] numbers = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, 9, 16};
        int[] actual = LevelOne.perfectSquare(numbers);
        assertArrayEquals(expected, actual);
    }
}

