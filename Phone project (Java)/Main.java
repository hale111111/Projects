package org.example.javachallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Contact> contacts;
    private static int id = 0;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Hello welcome to Phone ");
        Phone();
    }

    private static void Phone() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose one of the 3 options " +
                "\n1.Manage contacts" +
                "\n2.Messages" +
                "\n3.Quit\n");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Managecontacts();
                break;
            case 2:
                ManageMessages();
                break;
            default:
                break;
        }
    }

    private static void Managecontacts() {
        System.out.println("\n1.Show all contacts" +
                "\n2.Add new contact" +
                "\n3.Search for a contact" +
                "\n4.Delete a contact" +
                "\n5.Go back to the previous menu\n");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Showcontacts();
                break;
            case 2:
                Addcontacts();
                break;
            case 3:
                Searchcontacts();
                break;
            case 4:
                Deletecontacts();
                break;
            default:
                Phone();
                break;


        }
    }

    private static void Showcontacts() {
        if (contacts.size() > 0) {

            for (Contact c : contacts) {
                c.getdetails();
                System.out.println("************************");
            }
        }
        else {
            System.out.println("There are no contacts try adding some ");
        }
        Managecontacts();
    }

    private static void Addcontacts() {
        System.out.println("Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Email: ");
        String email = input.next();
        System.out.println("number: ");
        int number = input.nextInt();
        if (name.equals(" ") || email.equals(" ")) {
            System.out.println("Please enter the required information");
            Addcontacts();
        }
        boolean exist = false;
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                exist = true;
            }
        }
        if (exist) {
            System.out.println("The Contact with " + name + " already exists");
            Managecontacts();
        } else {
            Contact contact = new Contact(name, email, number);
            contacts.add(contact);
            System.out.println("The Contact was added successfully");
        }
        Managecontacts();
    }

    private static void Searchcontacts() {
        System.out.println("Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if (name.equals(" ")) {
            System.out.println("Please enter the required information");
            Searchcontacts();
        }
        boolean exist = false;
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                c.getdetails();
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("There no such user with this name ");
        }

        Managecontacts();
    }

    private static void Deletecontacts() {
        System.out.println("Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Email: ");
        String email = input.next();
        System.out.println("Number: ");
        int number = input.nextInt();
        if (name.equals(" ") || email.equals(" ")) {
            System.out.println("Please enter the required information");
            Deletecontacts();
        }
        boolean exist = false;
        for (Contact c : contacts) {
            if (c.getName().equals(name) || c.getEmail().equals(email)) {
                contacts.remove(c);
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("The user does not exist");
        }
        Managecontacts();
    }

    private static void ManageMessages() {
        System.out.println("1.Show all messages" +
                "\n2.Send a new message" +
                "\n3.Go back to the previous menu\n");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Showmessages();
                break;
            case 2:
                Sendmessage();
                break;
            default:
                Phone();
                break;

        }

    }

    private static void Showmessages() {
        ArrayList<Messages> allMessages = new ArrayList<>();
        for (Contact c : contacts) {
            allMessages.addAll(c.getMessages());
        }
        if (allMessages.size() > 0) {
            for (Messages m : allMessages) {
                m.Getdetails();
                System.out.println("**********************");
            }
        } else {
            System.out.println("You dont have any messages");
        }
        ManageMessages();
    }

    private static void Sendmessage() {
        System.out.println("Enter the name of person you are sending message to : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        if (name.equals(" ")) {
            System.out.println("Please enter a name\n");
            Sendmessage();
        }
        boolean exist = false;
        for (Contact c : contacts) {
            if (c.getName().equals(name)) ;
            exist = true;
        }
        if (!exist) {
            System.out.println("There is no such contact ");
            Sendmessage();
        }
        if (exist) {
            System.out.println("Enter the text ");
            String text = input.next();
            if (text.equals(" ")) {
                System.out.println("Please enter a message ");
                Sendmessage();
            } else {
                id++;
                Messages messages = new Messages(text, id, name);
                for (Contact c : contacts) {
                    c.getName().equals(name);
                    ArrayList<Messages> messages1 = c.getMessages();
                    messages1.add(messages);
                   c.setMessages(messages1);
                }
            }
        }
        ManageMessages();
    }


}














