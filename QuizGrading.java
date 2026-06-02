import java.util.Scanner;

public class RyanQuizgrading {
    public static void main(String... args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students enrolled: ");
        int students = input.nextInt();
        
        System.out.print("Enter the amount of Quizzes taken: ");
        int quiz = input.nextInt();
        
        int[][] score = new int[students][quiz];
        
        int count = 0;
        
        do{
            System.out.println("\nStudent " + (count + 1));
            for (int index = 0; index < quiz; index++) {
                System.out.print("Enter the score for Qz" + (index + 1) + ": ");
                int currentScore = input.nextInt();
                
                if ((currentScore < 0) || (currentScore > 100)){
                    System.out.println("Invalid Score, Try again");
                    index--;
                }
                else{
                    score[count][index] = currentScore;
                }
            }
            count++;
        }
        while (count < students);
        
        System.out.println("\n===== Quiz Grade Report =====");

        for (int index = 0; index < score.length; index++) {
            int sum = 0;
            System.out.print("Student " + (index + 1) + ":    ");
            
            for (int counter = 0; counter < score[index].length; counter++) {
                int quizScore = score[index][counter];
                System.out.print(quizScore + "\t");
                sum += quizScore;
            }
            
            double average = (double)sum / quiz;
            System.out.printf("%.2f\n", average);
        }
        
        System.out.print("Quiz Average: ");
        for (int counts = 0; counts < quiz; counts++) {
            int quizSum = 0;
            for (int counter = 0; counter < students; counter++) {
                quizSum += score[counts][counter];
            }
            double quizAverage = (double)quizSum / students;
            System.out.printf("%8.2f", quizAverage);
        }
        System.out.println();
    }
}

