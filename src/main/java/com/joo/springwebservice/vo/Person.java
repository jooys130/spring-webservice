package com.joo.springwebservice.vo;

public class Person {

    private Long id;
    private String author;
    private String title;

    public Person() {
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}