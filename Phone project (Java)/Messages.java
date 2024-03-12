package org.example.javachallenge;

public class Messages {
    private String text;
    private int id;
    private String recipient;

    public Messages(String text, int id, String recipient) {
        this.text = text;
        this.id = id;
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public void Getdetails(){
        System.out.println("Contact Name: " + recipient +
                "\nid: " + id +
                "\ntext: " + text);

    }
            }
