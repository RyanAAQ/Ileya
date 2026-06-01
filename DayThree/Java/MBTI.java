import java.util.Scanner;

public class MBTI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String[] questionsA = {"expend energy, enjoy groups", "Interpret literally", "logical, thinking, questioning", "organized, orderly", "more outgoing, think out loud", "practical, realistic, experiential", "candid, straight forward, frank", "plan, schedule", "seek many tasks, interact with others", "standard, usual, conventional", "firm, tend to criticize", "regulated, structured", "external, communicative", "focus on here-and-now", "tough-minded, just", "preparation, plan ahead", "active, initiate", "facts, things, what is", "matter of fact, issue-oriented", "control, govern"};
        
    String[] questionsB = {"conserve energy, enjoy one-on-one", "look for meaning and possibilities", "empathetic, feeling, accommodating", "flexible, adaptable", "more reserved, think to yourself", "imaginative, innovative, theoretical", "tactful, kind, encouraging", "unplanned, spontaneous", "seek private, solitary activities", "different, novel, unique", "gentle, tend to appreciate", "easy-going, live and let live", "internal, reticent, keep to yourself", "look to the future, big picture", "tender-hearted, merciful", "go with the flow, adapt as you go", "reflective, deliberate", "ideas, dreams, what could be", "sensitive, people-oriented", "latitude, freedom"};
    
    String[] answers = new String[20];

    System.out.print("What is your name? ");
    String name = input.nextLine();
    System.out.println("Hello " + name + " Answer each question with A or B.\n");

    for (int index = 0; index < 20; index++){
        System.out.println("Qusteion" + (index + 1) + ":");
        System.out.println("  A. " + questionsA[index]);
        System.out.println("  B. " + questionsB[index]);

    while (true){
        System.out.print("  Your answer: ");
        String answer = input.nextLine().toUpperCase();
        if (answer.equals("A") || answer.equals("B")){
        answers[index] = answer;
        break;
    }
        else{
        System.out.println("  Expected A or B as Response, Please try again");
                }
            }
            System.out.println();
        }
        int ei = 0;
        if (answers[0].equals("A"))
        ei++;
        if (answers[4].equals("A"))
        ei++;
        if (answers[8].equals("A"))
        ei++;
        if (answers[12].equals("A"))
        ei++;
        if (answers[16].equals("A"))
        ei++;

        int sn = 0;
        if(answers[1].equals("A"))
        sn++;
        if(answers[5].equals("A"))
        sn++;
        if(answers[9].equals("A"))
        sn++;
        if(answers[13].equals("A"))
        sn++;
        if(answers[17].equals("A"))
        sn++;

        int tf = 0;
        if(answers[2].equals("A"))
        tf++;
        if(answers[6].equals("A"))
        tf++;
        if(answers[10].equals("A"))
        tf++;
        if(answers[14].equals("A"))
        tf++;
        if(answers[18].equals("A"))
        tf++;

        int jp = 0;
        if (answers[3].equals("A"))
        jp++;
        if (answers[7].equals("A"))
        jp++;
        if (answers[11].equals("A"))
        jp++;
        if (answers[15].equals("A"))
        jp++;
        if (answers[19].equals("A"))
        jp++;

        String letter1 = "";
        String letter2 = "";
        String letter3 = "";
        String letter4 = "";

        if(ei >= 3){
        letter1 = "E"; 
        }
        else{ 
        letter1 = "I";
        }
        if(sn >= 3){
        letter2 = "S"; 
        }
        else{
        letter2 = "N";
        }
        if(tf >= 3){
        letter3 = "T";
        }
        else{
        letter3 = "F";
        }
        if(jp >= 3){
        letter4 = "J";
        }
        else{
        letter4 = "P";
        }

        String result = letter1 + letter2 + letter3 + letter4;

        System.out.println("========== YOUR RESPONSES ==========");
        for (int index = 0; index < 20; index++) {
            if (answers[index].equals("A")) {
                System.out.println("Question " + (index + 1) + ": A -> " + questionsA[index]);
            } else {
                System.out.println("Question " + (index + 1) + ": B -> " + questionsB[index]);
            }
        }

        System.out.println("\n" + name + ", your MBTI type is: " + result);
    }
}
