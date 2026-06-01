import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class BookSuggestionApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        BookSuggestionSystemBackEnd backEnd = new BookSuggestionSystemBackEnd();
        
        backEnd.addBook("The Tales of the forbidden negro");
        backEnd.addBook("Stephen hawking rises again :)");

        while (true){
            System.out.println("\n ================================ Welcome to the Ryan's Book Sugge1stion System ================================ ");
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update book");
            System.out.println("5. Show books");
            System.out.print("Choose between 1-5: ");
            
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                ArrayList<String> allBooks = backEnd.showBooks();
                if (allBooks.isEmpty()){
                    System.out.println("No books available to suggest. Please add books first.");
                } else {
                    String loopChoice = "yes";
                    while (loopChoice.equalsIgnoreCase("yes")) {
                        System.out.println("Book for the Day:");
                        
                        int randomIndex = rand.nextInt(allBooks.size());
                        int randomPage = rand.nextInt(100) + 1;

                        System.out.println("  Book Title: " + allBooks.get(randomIndex));
                        System.out.println("  Page: " + randomPage);

                        System.out.print("Would you like another suggestion? yes or no: ");
                        loopChoice = input.nextLine();
                    }
                }
            }
            else if (choice == 2){
                System.out.print("Enter the book title: ");
                String title = input.nextLine();
                if (backEnd.addBook(title)){
                    System.out.println("Book added successfully!");
                }
                else{
                    System.out.println("This book already exists in your system.");
                }
            } else if (choice == 3) {
                System.out.print("Enter the book title to remove: ");
                String title = input.nextLine();
                if (backEnd.removeBook(title)){
                    System.out.println("Book removed successfully!");
                }
                else{
                    System.out.println("Book is not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter the old title: ");
                String oldTitle = input.nextLine();
                System.out.print("Enter the new title: ");
                String newTitle = input.nextLine();
                if (backEnd.updateBook(oldTitle, newTitle)){
                    System.out.println("Book changed successfully!");
                }
                else{
                    System.out.println("Book is not found.");
                }
                }
                else if (choice == 5){
                ArrayList<String> allBooks = backEnd.showBooks();
                System.out.println("All Books");
                
                if (allBooks.isEmpty()){
                    System.out.println("There are no books");
                    }
                    else{
                        for (int index = 0; index < allBooks.size(); index++){
                        System.out.println((index + 1) + ". " + allBooks.get(index));
                    }
                }
                }
                else{
                System.out.println("Invalid choice. Please select an option between 1 and 5.");
            }
        }
    }
}

