package LibrarySystem;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Book {
    static int noOfBooks;
    String title;
    String author;
    String ISBN;
    boolean isBorrowed;
    static {
        noOfBooks = 0;
    }
    { // instance initializer block
        noOfBooks++;
    }
    Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    Book(String ISBN){
        this(null, null, ISBN);
    }
    static int getNoOfBooks(){
        return noOfBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed "+ this.title);
        }else {
            isBorrowed = true;
            System.out.println("Book is borrowed Enjoy the BOOK "+ this.title);
        }
    }
    void returnedBook(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("Book is returned, Hope you enjoyed the BOOK");
        }else
            System.out.println("Book is not borrowed");
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Number of books: "+noOfBooks);
    }

    public static void main(String[] args) {
        Book designOfBook = new Book("Design of Book", "Author of Book", "123456789");
        Book myBook = new Book("123456789");
        System.out.println(Book.getNoOfBooks());
        designOfBook.borrowBook();
        myBook.borrowBook();
        //designOfBook.returnedBook();
        designOfBook.borrowBook();
        //designOfBook.display();
        designOfBook.returnedBook();
        designOfBook.returnedBook();
    }
}