package org.example.MiniProject311;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {
    private List<User> users;

    public Project(){
        users = new ArrayList<>();
    }

    public boolean checkUserName(String userName) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                return true;
            }
        }
        System.out.println("Username is not correct");
        return false;
    }

    public boolean checkPassword(String password) {
        for (User user : users) {
            if (user.getPassword().equals(password)) {
                System.out.println("Password is correct!");
                return true;
            }
        }
        System.out.println("Password is not correct");
        return false;
    }
    public boolean registerUser(String userName, String password, Role role){
        if (!checkUserName(userName)) {
            User newUser = new User(userName, password, role);
            users.add(newUser);
            System.out.println("User was registered successfully");
            return true;
        } else {
            System.out.println("Username is already taken.");
            return false;
        }

    }
    public User login(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Login failed. Username or password is incorrect.");
        return null;
    }
    public void displayUsers() {
        System.out.println("List of registered users:");
        for (User user : users) {
            System.out.println("Username: " + user.getUserName());
            System.out.println("Role: " + user.getRole());
            System.out.println("--------------");
        }
    }

    public static void main(String[] args){

        Project project = new Project();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Are you NEW and would like to register - type '1'");
            System.out.println("  if you already have an account - type '2'");
            System.out.println( " if you want to see list of users and go out - type '3'");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Type your username ");
                String userName = scanner.nextLine();

                System.out.print("give your password: ");
                String password = scanner.nextLine();

                System.out.print("Enter role (STUDENT/TEACHER/ADMIN): ");
                String roleStr = scanner.nextLine();
                Role role = Role.valueOf(roleStr);

                project.registerUser(userName, password, role);
            } else if (choice == 2) {
                System.out.println("Username: ");
                String userName = scanner.nextLine();

                System.out.println("Password: ");
                String password = scanner.nextLine();

                User user = project.login(userName, password);
                if (user != null) {
                    System.out.println(user.getUserName() + " logged in");
                } else {
                    System.out.println("Invalid username or password. Try again.");
                }
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                project.displayUsers();
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }


        }

    }
}


