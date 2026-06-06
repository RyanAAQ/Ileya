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
        System.out.print("Enter the score for Qz" + (index + 1) + ": ");
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

        System.out.println("\n========================================================");
        System.out.println("STUDENT\t\tTOT\tAVE\tPOS");
        System.out.println("========================================================");
        for (int index = 0; index < students; index++) {
            int tot = totalScore(score, index, subjects);
            double ave = totalAverage(score, index, subjects);
            int pos = getStudentPosition(score, index, students, subjects);
            System.out.printf("Student %d\t%d\t%.2f\t%d\n", (index + 1), tot, ave, pos);
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
        return totalScore(score, studentIndex, subjects) / subjects;
    }

    public static int getStudentPosition(int[][] score, int studentIndex, int students, int subjects) {
        int targetTotal = totalScore(score, studentIndex, subjects);
        int rank = 1;

        for (int other = 0; other < students; other++) {
            if (totalScore(score, other, subjects) > targetTotal) {
                rank++;
            }
        }
        return rank;
    }
}
