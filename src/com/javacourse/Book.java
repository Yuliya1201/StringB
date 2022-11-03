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
        return "nameBook = '" + nameBook + '\''+
               ", nameAuthor = '" + nameAuthor.toString() + '\'' +
               ", publicYear" + publicYear;
    }

    public int hashCode() {
        int result = nameBook == null ? 0 : nameBook.hashCode();
        result = result + nameAuthor;
        result = result + publicYear;

        return result;
    }

    public boolean equals(Object other) {

        if( this == this) return true;
        if (other == null || getClass() != other.getClass())  return false;
        Book menedgment = (Book) other;
        return Object.equals (nameBook,menedgment.nameBook) && Object.equals (nameAuthor,menedgment.nameAuthor) && Object.equals (publicYear, manadgment.publicYear);
    }
}




