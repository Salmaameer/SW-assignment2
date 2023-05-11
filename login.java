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
public Customer userlogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to login");

        while (true) {
            System.out.print("Enter your username:");
            username = scanner.nextLine();
            System.out.print("Enter your password:");
            password = scanner.nextLine();

            Customer customer = acountExists(username);
            if (customer != null && customer.getPassword().equals(password)) {
                System.out.print("Successful ,welcome to your page. ");
                return customer;
            } else {
                System.out.print("Oops! Invalid username or password. ");
                System.out.print("Did you forget your password? (Y/N)");
                String reset = scanner.nextLine();
                if (reset.equalsIgnoreCase("Y")) {
                    System.out.print("Enter your email address to reset your password:");
                    String email = scanner.nextLine();
                    // Send password reset link to email
                    System.out.print("A password reset link has been sent to your email.");

                    System.out.print("Enter your new password: ");
                    String newPassword = scanner.nextLine();
                    updatePassword(username, newPassword);
                    System.out.print("Your password has been reset successfully. Please try again to login.");
                }
            }
        }
    }
private void updatePassword(String username, String newPassword) {
    try {
        File file = new File("login.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder fileContents = new StringBuilder();

        // Read the file line by line and update the password for the given username
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith(username + ",")) {
                String[] parts = line.split(",");
                parts[1] = newPassword;
                line = String.join(",", parts);
            }
            fileContents.append(line).append("\n");
        }
        scanner.close();

        // Write the updated file contents back to the file
        FileWriter writer = new FileWriter(file);
        writer.write(fileContents.toString());
        writer.close();
    } catch (IOException e) {
        System.out.println("An error occurred while updating the password: " + e.getMessage());
    }
}

  private Customer acountExists(String username) {
    try {
        File file = new File("login.txt");
        if (!file.exists()) {
            return null;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4 && parts[0].equals(username)) {
                reader.close();
                return new Customer(username, parts[1]); // return customer object with username and password
            }
        }

        reader.close();
    } catch (IOException e) {
        System.out.println("An error occurred while reading the login file.");
        e.printStackTrace();
    }

    return null; // user not found
}

}
