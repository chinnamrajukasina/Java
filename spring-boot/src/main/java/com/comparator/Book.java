package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparable<Book> {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
    }

    // Implementing Comparable interface using compareTo for default sorting based on publication year
    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.publicationYear, otherBook.publicationYear);
    }

    public static void main(String[] args) {
        List<Book> unsortedBooks = new ArrayList<>();
        unsortedBooks.add(new Book("Java Programming", "John Doe", 2018));
        unsortedBooks.add(new Book("Python Basics", "Jane Smith", 2020));
        unsortedBooks.add(new Book("Data Structures in C", "Bob Johnson", 2015));

        System.out.println("Unsorted list is:");
        for (Book book : unsortedBooks)
            System.out.println(book);

        sortAscendYear(unsortedBooks);
        sortDescendYear(unsortedBooks);
    }

    private static void sortDescendYear(List<Book> unsortedBooks) {
        Collections.sort(unsortedBooks, Comparator.comparing(Book::getPublicationYear).reversed());
        System.out.println("\nSorted List of Books (Descending Order):");
        for (Book book : unsortedBooks)
            System.out.println(book);
    }

    private static void sortAscendYear(List<Book> unsortedBooks) {
        Collections.sort(unsortedBooks);
        System.out.println("\nSorted List of Books (Ascending Order using Comparable):");
        for (Book book : unsortedBooks)
            System.out.println(book);
    }
}
