package com.example.greetingapp.model;

public class Model {


    private long id;
    private String content;


//	 parameterized constructor

    public Model(long id, String message) {
        this.id = id;
        this.content = message;
    }


//	 generates setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
