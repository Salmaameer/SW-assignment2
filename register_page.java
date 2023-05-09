/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toffee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Original
 */

public class Register {

    private String username;
    private String password;
    private String name;
    private String ID;
    private String phonenumber;
    //Customer customer =new Customer();
    public void register() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to User Registration");

    Customer customer = new Customer();

    // Prompt user for username
    while (true) {
       System.out.print("Enter your username (must be at least 4 characters long): ");
        String username = scanner.nextLine();

        if (username.length() < 4) {
            System.out.println("Username must be at least 4 characters long. Please try again.");
        }  else if (usernameExists(username)) {
            System.out.println("Username already exists. Please try again with a different username.");
        } else {
            customer.setEmail(username);
            break;
        }
    }

    while (true) {
        System.out.print("Enter your password (must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit): ");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long. Please try again.");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter. Please try again.");
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase letter. Please try again.");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one digit. Please try again.");
        } else {
            customer.setPassword(password);
            break;
        }
    }

    while (true) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.length() < 3) {
            System.out.println("Name must be at least 3 characters long. Please try again.");
        } else {
            customer.setName(name);
            break;
        }
    }

    while (true) {
        System.out.print("Enter your id: ");
        String id =scanner.nextLine();
        if (id.length() < 8) {
            System.out.println("ID must be at least 8 characters long. Please try again.");
        } else if (!id.matches("\\d+")) {
            System.out.println("ID must contain digits only. Please try again.");
        } else if (idExists(id)) {
            System.out.println("ID already exists. Please try again with a different ID.");
        } else {
            customer.setId(id);
            break;
        }
    }

    while (true) {
        System.out.print("Enter your phone number: ");
        String phoneNo = scanner.nextLine();
        if (phoneNo.length() != 11) {
            System.out.println("Phone number must be exactly 11 digits long. Please try again.");
        } else if (!phoneNo.matches("\\d+")) {
            System.out.println("Phone number must contain digits only. Please try again.");
        } else {
            customer.setPhoneNo(phoneNo);
            break;
        }
    }

    // Save user credentials to file
    try {
        FileWriter writer = new FileWriter("login.txt", true);
        writer.write(customer.getEmail()+ "," + customer.getPassword() + "," +customer.getName()+","+ customer.getId() + "," + customer.getPhoneNo() + "\n");
        writer.close();
        System.out.println("User registered successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred while registering user.");
        e.printStackTrace();
    }
}
    private boolean usernameExists(String username) {
        try {
            File file = new File("login.txt");
            if (!file.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5 && parts[0].equals(username)) {
                    reader.close();
                    return true;
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the login file.");
            e.printStackTrace();
        }

        return false;
    }
     private boolean idExists(String id) {
        try { 
            File file = new File("login.txt");
            if (!file.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5 && parts[3].equals(id)) {
                    reader.close();
                    return true;
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the login file.");
            e.printStackTrace();
        }

        return false;
    }
}

   




