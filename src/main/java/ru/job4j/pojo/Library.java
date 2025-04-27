package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 5);
        Book mentor = new Book("Mentor", 15);
        Book intern = new Book("Intern", 20);
        Book midl = new Book("Midl", 25);
        Book[] books = new Book[4];
        books[0] = mentor;
        books[1] = intern;
        books[2] = midl;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountPages());
        }
        System.out.println("Change mentor to midl");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCountPages());
        }
        System.out.println("Search and display book with name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCountPages());
            }
        }
    }
}