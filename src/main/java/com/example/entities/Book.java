package com.example.entities;

public class Book {
         private int id;
         private  String title;
         private String author;

    public Book(int id) {
        this.id = id;
    }

    public Book(int par, String title2, String author2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
