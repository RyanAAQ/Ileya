import java.util.ArrayList;
import java.util.Random;

public class BookSuggestionSystemBackEnd{
    public ArrayList<String> books = new ArrayList<>();

    public boolean addBook(String title){
        if (books.contains(title)){
            return false;
        }
        books.add(title);
        return true;
    }
    
    public boolean removeBook(String title){
        if (books.contains(title)){
            books.remove(title);
            return true;
        }
        return false;
    }

    public boolean updateBook(String oldTitle, String newTitle){
        int index = books.indexOf(oldTitle);
        if (index != -1) {
            books.set(index, newTitle);
            return true;
        }
        return false;
    }

    public ArrayList<String> showBooks(){
        
            return books;
        }
    }

