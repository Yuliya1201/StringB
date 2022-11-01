package com.javacourse;

public class main {
    public static Author createAuther(String name,String sername) {
        Author book = new Author();
        book.name = name;
        book.sername = sername;
        return book;
    }
    public static Book createBook (String nameBook ,String nameAuthor, String publicYear) {
        Book menedgment = new Book();
        menedgment.nameBook = nameBook;
        menedgment.nameAuthor = nameAuthor;
        menedgment.publicYear = publicYear;
        return menedgment;
    }
    public static void main(String[] args) {
       // 1. Необходимо создать класс Book, который содержит в себе данные об имени,
  // авторе и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
Book menedgment= createBook("Menedgment","Sergei Ivanov","1980");
        System.out.println("menedgment.nameBook = " + menedgment.nameBook);
        System.out.println("menedgment.nameAuthor = " + menedgment.nameAuthor);
        System.out.println("menedgment.publicYear = " + menedgment.publicYear);

       //2/ Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        Author book = createAuther("Sergei","Ivanov");
        System.out.println("book.name = " + book.name);
        System.out.println("book.sername = " + book.sername);
        //3/ Написать конструкторы для обоих классов, заполняющие все поля. Выполнила

        //4/ Создать геттеры для всех полей автора и всех полей книги.
       // Создала геттеры

        //5/ Создать сеттер для поля «Год публикации» у книги. Выполнила в классе Book

        //6/ 6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов
        // Автор (достаточно тоже двух) и инициализировать друг друга.
        // Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        // Метод main не должен находиться в классах Book и Author.
        //Требуется создать отдельный класс для запуска приложения и объявить метод main в нем


    }
}
