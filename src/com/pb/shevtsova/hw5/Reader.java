package com.pb.shevtsova.hw5;

public class Reader {
    String NameSurname;
    int IDLibraryCard;
    String Faculty;
    String DateOfBirth;
    private String Name;

    public Reader(String s, int i, String math, String s1) {
    };

    public void TakeBook(String NameSurname, int BookHave) {
        NameSurname=NameSurname;
        System.out.println(NameSurname+ " взял домой " +BookHave+ " книги");
    }

    public void TakeBook(String NameSurname, String... BookNames) {
        System.out.print(NameSurname+ " взял книги: " );
        for (String BookName : BookNames){
        System.out.print(BookName+"; ");}
    }

    public String getReaderInfo() {
        return "[читатель: " + NameSurname + ", номер читательского: " + IDLibraryCard + ", факультет: "
                + Faculty + ", дата рождения: " + DateOfBirth + "]";
    }


    public void TakeBook(String NameSurname,Book... books) {
        System.out.println(NameSurname + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getBookName() + "(" + book.getBookAuthor()+"  "+book.getBookYearPublish()+")");
        }
        System.out.println();
    }
    public void ReturnBook(String NameSurname, int number) {
        System.out.println(NameSurname + " вернул " + number + " книги.");
    }

    public void ReturnBook(String NameSurname, String... books) {
        System.out.println(NameSurname + " вернул книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void ReturnBook(String NameSurname, Book... books) {
        System.out.println(NameSurname + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getBookName() + "(" + book.getBookAuthor()+"  "+book.getBookYearPublish()+")");
        }
        System.out.println();
    }

    }


