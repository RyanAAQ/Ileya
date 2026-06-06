import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest{

    @Test
    public void testThatTheScoresOfEachStudentIsCalculated(){
        int studentIndex = 0;
        int subjects = 2;
        int[][] score = {{40, 38}};

        int actual = StudentGrade.totalScore(score, studentIndex, subjects);
        int expected = 78;

        assertEquals(expected, actual);
    }

    @Test
    public void testThatTheAverageOfEachStudentIsCalculated(){
        int studentIndex = 0;
        int subjects = 2;
        int[][] score = {{40, 38}};

        double actual = StudentGrade.totalAverage(score, studentIndex, subjects);
        double expected = 78 / 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testThatThePositionOfOneStudentIsAccurate(){
        int studentIndex = 0;
        int students = 1;
        int subjects = 2;
        int[][] score = {{40, 38}};

        int actual = StudentGrade.studentPosition(score, studentIndex, students, subjects);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testThatThePositionOfTwoStudentIsAccurate(){
        int studentIndex = 0;
        int students = 2;
        int subjects = 2;
        int[][] score = {{40, 38}, {10, 20}};

        int actual = StudentGrade.studentPosition(score, studentIndex, students, subjects);
        int expected = 1;

        assertEquals(expected, actual);
    }
}
