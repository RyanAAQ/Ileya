from book_suggestion_system import *

print("=" * 50)
print("      WELCOME TO RYAN'S BOOK SUGGESTION APP")
print("=" * 50)

while True: 
    print("1. Add book")
    print("2. Remove books ")
    print("3. Update books ")
    print("4. Show books")
    print("5. Close App")
    
    choice = input("Choose from 1-5: ")
    
    if choice == "1":
        title = input("Title: ")
        add_book(title)
        print("\nBook added sucessfully")
        
    elif choice == "2":
        title = input("Title: ")
        remove_book(title)
        print("\nBook removed sucessfully")
        
    elif choice == "3":
        old = input("Old title: ")
        new = input("New title: ")
        update_book(old, new)
        
    elif choice == "4":
        print(show_books())
        
    elif choice == "5":
        break

