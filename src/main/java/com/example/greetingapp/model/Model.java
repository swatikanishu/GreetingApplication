package com.example.greetingapp.model;


public class Model {
    private long id;
    private String message;


//	 parameterized constructor

    public Model(long id, String message) {
        this.id = id;
        this.message = message;
    }


//	 generates setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String content) {
        this.message = content;
    }


    @Override
    public String toString() {
        return "Greeting [id=" + id + ", message=" + message + "]";
    }

}