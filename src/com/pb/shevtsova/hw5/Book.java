package com.pb.shevtsova.hw5;

public class Book {
    String BookName;
    String BookAuthor;
    String BookYearPublish;

    public Book(String BookName, String BookAuthor, String BookYearPublish) {
        this.BookName=BookName;
        this.BookAuthor=BookAuthor;
        this.BookYearPublish=BookYearPublish;
    }

    public Book() {

    }


    public static void Printbooks(String... BookNames) {
            for (String BookName : BookNames) {
                System.out.print(BookName+"; ");
            }
        }

    public Object getInfo() {
        return String.format("Книга: %s, Автор: %s, Год издания: %s", BookName, BookAuthor, BookYearPublish);
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public void setBookYearPublish(String bookYearPublish) {
        this.BookYearPublish = bookYearPublish;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookYearPublish() {
        return BookYearPublish;
    }
}


