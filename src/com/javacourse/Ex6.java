package com.javacourse;




public class Ex6 {
    private String nameBook1;
    private   String author1;
    private String nameBook2;
    private String author2;
    private String year;


    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public void main(String[] args) {


        Ex6 princess = new Ex6();
        this.nameBook1 = "Princess";
        this.author1 = "Petr Marchenko";
        System.out.println("princess.nameBook1 = " + princess.nameBook1);
        System.out.println("princess.author1 = " + princess.author1);

       //7/ В том же методе main изменить год публикации одной из книг с помощью сеттера.




        Ex6 sara = new Ex6();
        this.year = "1890";
        this.nameBook2 = "Sara";
        this.author2 = "Valeriy Marchenko";
        System.out.println("sara.year = " + sara.getYear());
        sara.setYear("2020");
        System.out.println("sara.getYear() = " + sara.getYear());
        System.out.println("sara.getYear() = " + sara.getYear());
        System.out.println("sara.nameBook2 = " + sara.nameBook2);
        System.out.println("sara.author2 = " + sara.author2);

    }
}

