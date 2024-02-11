package Bookstore;

import Bookstore.core.Book;
import Bookstore.inventory.*;

public class Program22_Book {
    public static void main(String[] args) {
        // Creating a sample book
        Book sampleBook = new Book("The Chinmay's Biography", "CKkkk", "123456789", 99.99);

        // Creating an inventory manager and adding the sample book
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addBook(sampleBook);

        // Retrieving and printing book details
        Book retrievedBook = inventoryManager.getBookDetails("123456789");
        if (retrievedBook != null) {
            System.out.println("Book Details:\nTitle: " + retrievedBook.getTitle()
                    + "\nAuthor: " + retrievedBook.getAuthor()
                    + "\nISBN: " + retrievedBook.getIsbn()
                    + "\nPrice: " + retrievedBook.getPrice());
        }

        // Updating stock level
        inventoryManager.updateStockLevel("123456789", 50);
    }
}

