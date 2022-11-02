package com.javacourse;
import java.util.Objects;


public class Book {
    String nameBook;
    String nameAuthor;
    String publicYear;


    public Book(String nameBook, String nameAuthor, String publicYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publicYear = publicYear;
        System.out.println("Book.this.nameBook = " + Book.this.getNameBook());
        System.out.println("Book.this.nameAuthor = " + Book.this.getNameAuthor());
        System.out.println("Book.this.publicYear = " + Book.this.getPublicYear());
        Book.this.setPublicYear("1987");
        System.out.println("Book.this.getPublicYear() = " + Book.this.getPublicYear());
    

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear(String publicYear) {
        this.publicYear = publicYear;
    }


    // Домашнее задание по теме Методы объектов
    public String toString() {
        return "название " + this.nameBook + "автор " + this.nameAuthor + "год " + this.publicYear;
    }

    public int hashCode() {

        return java.util.Objects.hashCode(0);
    }

    public boolean equals(Object other) {

        if( this == other) return true;
        if (o == null || getClass() != other.getClass())  return false;
        Book menedgment = (Book) other;
        return nameBook == menedgment.nameBook;
        return nameAuthor == menedgment.nameAuthor;
        return publicYear == menedgment.publicYear;
    }
}




