package com.pb.shevtsova.hw5;

public class Library {
    public static void main(String[] args) {
        //Book Book1 = new Book();
        Book Book2 = new Book();
        Book Book3 = new Book();

        Book Book1 = new Book ("Приключения", "Иванов И. И.", "2000");
        //Book2 = new Book ("Словарь", "Сидоров А. В ", "1980");
        //Book1.BookName="Приключения";
        //Book1.BookAuthor="Иванов И. И.";
        //Book1.BookYearPublish="2000";
        Book2.BookName="Словарь";
        Book2.BookAuthor="Сидоров А. В";
        Book2.BookYearPublish="1980";
        Book3.setBookName("Энциклопедия");
        Book3.setBookAuthor("Гусев К. В.");
        Book3.setBookYearPublish("2010");
        Book[] books = {Book1, Book2, Book3};

        System.out.println("__Данные о книгах__");
        System.out.println(Book1.BookName+"  "+Book1.BookAuthor+"  "+Book1.BookYearPublish);
        //System.out.println(Book2.BookName+"  "+Book2.BookAuthor);
        //System.out.println(Book3.BookName+"  "+Book3.BookAuthor);
        System.out.println(Book2.getInfo());
        System.out.println(Book3.getInfo());

        Reader Reader1 = new Reader("Петров И.И.", 321654987, "Math", "10.10.1988");
        System.out.println("__Данные о читателях__");
        System.out.println(Reader1.getReaderInfo());

        Reader1.TakeBook("Петров",3);

        Reader1.TakeBook("Петров ","Приключения", "Словарь", "Энциклопедия");

        Reader1.TakeBook("Petrov", Book1, Book2, Book3);

        Reader1.ReturnBook("Петров ",3);

        Reader1.ReturnBook("Петров ","Приключения", "Словарь", "Энциклопедия");

        Reader1.ReturnBook("Петров ",Book1, Book2, Book3);
    }
}
