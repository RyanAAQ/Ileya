import { addBook, removeBook, updateBook, showBooks } from './BookSuggestionSystem.js';

function suggestions(){
    console.log("\n================ WELCOME TO THE BOOKSHELF APP ================");
    
while (true) {
    console.log("\nChoose an option:");
    console.log("1. Add a Book");
    console.log("2. Remove a Book");
    console.log("3. Update a Book");
    console.log("4. View All Books");
    console.log("5. Exit");
        
    let choice = prompt("Enter option number (1-5):");
        
    if (choice === "5" || choice === null) {
    console.log("Thank you for using the Bookshelf App. Goodbye!");
    break;
}    
    if (choice === "1") {
    let title = prompt("Enter the title of the book to add:");
        if ((title != null) && (title != "")){
        let  added = addBook(title);
    if ((added != null) && (title != "")){
    console.log(`${title} has been added sucessfully.`);
    } else {
    console.log(`${title} is already in the library.`);
        }
    }
}
    else if (choice === "2") {
            let title = prompt("Enter the title of the book to remove:");
            if (title) {
                let  added = removeBook(title);
                if ( added) {
                    console.log(`${title} has been removed.`);
                } else {
                    console.log(`Error: "${title}" was not found in the library.`);
                }
            }
        }
        else if (choice === "3") {
            let oldTitle = prompt("Enter the title of the book you want to change:");
            if (oldTitle) {
                let newTitle = prompt("Enter the new title for this book:");
                if (newTitle) {
                    let  added = updateBook(oldTitle, newTitle);
                    if ( added) {
                        console.log(` added: "${oldTitle}" changed to "${newTitle}".`);
                    } else {
                        console.log(`Error: "${oldTitle}" was not found in the library.`);
                    }
                }
            }
        }
        else if (choice === "4") {
            let currentLibrary = showBooks();
            console.log("\n--- CURRENT BOOKS ---");
            if (currentLibrary.length === 0) {
                console.log("[The library is currently empty]");
            } else {
                for (let i = 0; i < currentLibrary.length; i++) {
                    console.log(`${i + 1}. ${currentLibrary[i]}`);
                }
            }
            console.log("----------------------");
        }
        else {
            console.log("Invalid option. Please enter a number between 1 and 5.");
        }
    }
}

