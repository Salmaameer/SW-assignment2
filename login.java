/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
public class login {
    private String username;
    private String password;
    public Customer userlogin(){
    Customer customer=new Customer();
       Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to login");

        while (true) {
            System.out.print("Enter your username:");
            username = scanner.nextLine();
            System.out.print("Enter your password:");
            password = scanner.nextLine();
          

                     
            if(acountExists(username,password)){
             System.out.print("successful ,welcome to your page: ");
             Customer loginCustomer=new Customer(username,password);
             return loginCustomer;
             
            }
            else{
             System.out.print("ooooops! this account doesn't exist,please try again: \n");
               Customer NoCustomer=new Customer("No name","No password");
             return NoCustomer;
             
            }
        }
    }
    private boolean acountExists(String username,String password) {
        try {
            File file = new File("login.txt");
            if (!file.exists()) {
                return false;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4 && parts[0].equals(username)&&parts[1].equals(password)) {
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

