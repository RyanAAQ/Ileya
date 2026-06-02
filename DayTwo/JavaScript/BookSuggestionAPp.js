const { addBook, removeBook, updateBook, showBooks } = require('./BookSuggestionSystemBackend.js');

while (true) {
    console.log("\n ================================ Welcome to the Ryan's Book Suggestion System ================================ ");
    console.log("1. Get Suggestions");
    console.log("2. Add Book");
    console.log("3. Remove Book");
    console.log("4. Update book");
    console.log("5. Show books");
    
    const choice = prompt("Choose between 1-5: ");

    if (choice === '1') {
        const allBooks = showBooks();
        if (allBooks.length === 0) {
            console.log("No books available to suggest. Please add books first.");
        } else {
            let loopChoice = "yes";
            while (loopChoice.toLowerCase() === "yes") {
                console.log("Book for the Day:");
                
                const randomIndex = Math.floor(Math.random() * allBooks.length);
                const randomPage = Math.floor(Math.random() * 100) + 1;

                console.log("  Book Title: " + allBooks[randomIndex]);
                console.log("  Page: " + randomPage);

                loopChoice = prompt("Would you like another suggestion? yes or no: ");
            }
        }
    } 
    else if (choice === '2') {
        const title = prompt("Enter the book title: ");
        if (addBook(title)) {
            console.log("Book added successfully!");
        } else {
            console.log("This book already exists in your system.");
        }
    } 
    else if (choice === '3') {
        const title = prompt("Enter the book title to remove: ");
        if (removeBook(title)) {
            console.log("Book removed successfully!");
        } else {
            console.log("Book is not found.");
        }
    } 
    else if (choice === '4') {
        const oldTitle = prompt("Enter the old title: ");
        const newTitle = prompt("Enter the new title: ");
        if (updateBook(oldTitle, newTitle)) {
            console.log("Book changed successfully!");
        } else {
            console.log("Book is not found.");
        }
    } 
    else if (choice === '5') {
        const allBooks = showBooks();
        console.log("All Books");
        
        if (allBooks.length === 0) {
            console.log("There are no books");
        } else {
            for (let index = 0; index < allBooks.length; index++) {
                console.log((index + 1) + ". " + allBooks[index]);
            }
        }
    } 
    else {
        console.log("Invalid choice. Please select an option between 1 and 5.");
    }
}

