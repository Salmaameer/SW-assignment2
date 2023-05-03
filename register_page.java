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
  

    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration");

        // Prompt user for username
        while (true) {
            System.out.print("Enter your username (must be at least 4 characters long): ");
            username = scanner.nextLine();

            if (username.length() < 4) {
                System.out.println("Username must be at least 4 characters long. Please try again.");
            } else if (usernameExists(username)) {
                System.out.println("Username already exists. Please try again with a different username.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.print("Enter your password (must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit): ");
            password = scanner.nextLine();

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters long. Please try again.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain at least one uppercase letter. Please try again.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain at least one lowercase letter. Please try again.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("Password must contain at least one digit. Please try again.");
            } else {
                break;
            }
        }

   
        while (true) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
            if (name.length() < 3) {
                System.out.println("name must be at least 3 characters long. Please try again.");
            } 
            else {
                break;
            }
        }
        while (true) {
            System.out.print("Enter your id : ");
            ID = scanner.nextLine();
            if (ID.length() < 8) {
                System.out.println("id must be at least 8 characters long. Please try again.");
            } else if (!ID.matches("\\d+")) {
                System.out.println("id must contain digits only. Please try again.");
            }else if (idExists(ID)) {
                System.out.println("id already exists. Please try again with a different username.");
            } 
            else {
                break;
            }
        }
        while (true) {
            System.out.print("Enter your phonenumber  : ");
            phonenumber = scanner.nextLine();
            if (phonenumber .length() == 11) {
                System.out.println("id must be at least 11 characters long. Please try again.");
            } else if (!phonenumber .matches("\\d+")) {
                System.out.println("phonenumber  must contain digits only. Please try again.");
            }
            else {
                break;
            }
        }
        // Save user credentials to file
        try {
            FileWriter writer = new FileWriter("login.txt", true);
            writer.write(username + "," + password +","+name + "," +ID+","+phonenumber+"\n");
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
                if (parts.length == 2 && parts[0].equals(username)) {
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

   




