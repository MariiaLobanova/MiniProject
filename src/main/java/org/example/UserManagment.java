package org.example;

import java.io.FileWriter;
import java.io.IOException;

// What to do: Use arrays and loops to store and manage user data. Implement basic CRUD operations.
//Expected: CRUD operations like add, delete, update, and display users.
// Loops should be used for searching through the array to find specific records.
public class UserManagment {
    private  static UserData[] users = new UserData[10]; // 10 users

    public static void addUsers(String name, int age, String address){
        for (int i = 0; i < users.length; i++) {
            if (users[i]== null){
                users[i]= new UserData(name,age,address);
                return;
            }
        }
    }
    public static void deliteUser(String deliteName){
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null&&users[i].getName().equalsIgnoreCase(deliteName)){
                users[i]= null;
                System.out.println("user"+ deliteName +" is delieted");
                return;
            }
        }
        System.out.println(deliteName + "  user not found");
    }

    public  static void displayUsersData(){
        System.out.println("List of users: ");
        for(UserData userData: users){
            if (userData!=null){
                System.out.println(userData.toString());
            }
        }
    }
    public static void searchUser(String searchName){
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null&&users[i].getName().equalsIgnoreCase(searchName)){
                System.out.println("User is found: "+ users[i].toString());
                return;
            }
        }
        System.out.println(searchName+ "  user not found");
    }
    public static void createFileUserData(String fileName){    // method to save data in txt.file
        try(FileWriter writer = new FileWriter(fileName)){
            for (UserData userData: users){
                if (userData!=null){
                    writer.write(userData.getName() + ", "+userData.getAge()+ ", " + userData.getAddress()+"\n");
                }
            }
            System.out.println("Users data is saved in " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        addUsers("Anna", 13,"Brandenburger str 12");
        addUsers("Anton", 2,"Neuner Tor  1");
        addUsers("Maria", 18,"Georg-Hermann-Alle, 36");
        addUsers("Boris", 28,"Georg-Hermann-Alle, 34");

        displayUsersData();

        deliteUser("Boris");
        deliteUser("Victor");

        displayUsersData();

        searchUser("Anna");

        createFileUserData("UserData.txt");
    }

}
