import java.util.Scanner;

public class StudentGrade{
    public static void main(String... args) {

    Scanner input = new Scanner(System.in);

    System.out.print("How many students do you have: ");
    int students = input.nextInt();

    System.out.print("How many subjects do they offer: ");
    int subjects = input.nextInt();

    int[][] score = new int[students][subjects];

    int count = 0;

    do{
        System.out.println("\nStudent " + (count + 1));
        for (int index = 0; index < subjects; index++) {
        System.out.print("Enter the score for SUB" + (index + 1) + ": ");
        int currentScore = input.nextInt();

        if ((currentScore < 0) || (currentScore > 100)){
        System.out.println("Invalid Score, Try again");
        index--;
        }
        else{
        score[count][index] = currentScore;
            };
        }
        System.out.println("Saving ...................");
        System.out.println("Saved successfully");
        count++;
    }
    while (count < students);
        System.out.println("\n==============================================");
        System.out.print("STUDENT\t\t");
        for (int index = 0; index < subjects; index++) {
        System.out.printf("SUB%d\t", index + 1);
        }
        System.out.println("TOT\tAVG\tPOS");

        for (int index = 0; index < score.length; index++) {
            System.out.print("Student " + (index + 1) + ":\t");

            for (int counter = 0; counter < score[index].length; counter++) {
                System.out.print(score[index][counter] + "\t");
            }

            int total = totalScore(score, index, subjects);
            double average = totalAverage(score, index, subjects);
            int position = studentPosition(score, index, students, subjects);

            System.out.printf("%d\t%.2f\t%d\n", total, average, position);

        }
        }
    public static int totalScore(int[][] score, int studentIndex, int subjects){
        int total = 0;
        for(int index = 0; index < subjects; index++){
            total += score[studentIndex][index];
            }
        return total;
}
    public static double totalAverage(int[][] score, int studentIndex, int subjects){
        if(subjects == 0){
            return 0.0;
        }
        return (double) totalScore(score, studentIndex, subjects) / subjects;
    }
    public static int studentPosition(int[][] score, int studentIndex, int students, int subjects) {
        int target = totalScore(score, studentIndex, subjects);
        int rank = 1;

        for (int index = 0; index < students; index++) {
            if (totalScore(score, index, subjects) > target) {
                rank++;
            }
        }
        return rank;
    }
}
