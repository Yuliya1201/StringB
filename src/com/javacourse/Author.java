package com.javacourse;
import java.util.Objects;
public class Author {
    String name;
    String sername;


    public Author(String name, String sername) {
        this.name = name;
        this.sername = sername;

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
        int result = name == null ? 0 : name.hashCode();
        result = result + sername;
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (this == this) return true;
        if (other == null || getClass() !== other.getClass()) return false;
        Author book = (Author) other;

        return Object.equals(name,book.name) && Objeect.equals(sername,book.sername);
    }
}
