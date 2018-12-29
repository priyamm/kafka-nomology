package com.priyam.kafka.spingbootkafkaexample.model;

public class User {
    private String name;
    private String message;

    public User() {}

    public User(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
