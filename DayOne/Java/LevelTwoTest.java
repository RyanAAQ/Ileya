import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LevelTwoTest{

    @Test
    public void testThatTheZerosAreMovedTheEndOfTheArray(){
        int[] numbers = {4, 5, 0, 4, 0, 2, 0, 0, 1};
        int[] expected = {4, 5, 4, 2, 1, 0, 0, 0, 0};
        int[] actual = LevelOne.zeroToEnd(numbers);
        assertArrayEquals(expected, actual);
    }
}
