package com.javacourse;
import java.util.Objects;
public class Author {
    String name;
    String sername;


    public Author(String name, String sername) {
        this.name = name;
        this.sername = sername;
        System.out.println("Author.this.name = " + Author.this.getName());
        System.out.println("Author.this.sername = " + Author.this.getSername());
    }

    public Author() {

    }
    public String getName() {
        return this.name;
    }
    public String getSername() {
        return this.sername;
    }
    //   Домашнее задание по теме Методы объектов

    public String toString() {
        return "Имя " + this.name + "Фамилия " + this.sername;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        Author book = new Author("Sergei","Ivanov");
        Author book1 = book;
        if (this.getClass() == other.getClass()) {

        }

        return true;
    }
}
