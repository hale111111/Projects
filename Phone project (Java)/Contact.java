package org.example.javachallenge;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String email;
    private int number;
private ArrayList<Messages> messages;
    public Contact(String name, String email, int number, ArrayList<Messages> messages) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.messages = messages;
    }

    public Contact(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.messages = new ArrayList<>();
    }

    public ArrayList<Messages> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Messages> messages) {
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void getdetails(){
        System.out.println("Name: " + name +
                "\nEmail: " + email +
                "\nnumber: " + number);

    }
}



