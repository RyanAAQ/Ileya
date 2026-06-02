const books = [];

function addBook(title){
    if (books.includes(title)){
    return false;
    }
    books.push(title);
    return true;
}

function removeBook(title){
    let index = books.indexOf(title);
    if (index !== -1) {
    books.splice(index, 1);
    return true;
    }
    return false;
}

function updateBook(oldTitle, newTitle) {
    let index = books.indexOf(oldTitle);
    if (index !== -1) {
    books[index] = newTitle;
    return true;
    }
    return false;
}

function showBooks() {
    return books;
}
addBook("The Tales of the forbidden negro");
addBook("Stephen hawking rises again :)");

module.exports = {addBook, removeBook, updateBook, showBooks};

