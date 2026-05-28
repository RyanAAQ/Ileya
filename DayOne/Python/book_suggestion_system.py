books = []

def add_book(title):
    if title in books:
        return False
    books.append(title)
    return True

def remove_book(title):
    if title in books:
        books.remove(title)
        return True
    return False

def update_book(old, new):
    if old in books:
        index = books.index(old)
        books[index] = new
        return True
    return False

def show_books():
    return books

