/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author jovdim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int choice;
        System.out.print("How many Client to be set an Appoinment?:\nChoice: ");
        choice = s.nextInt();
        s.nextLine();

        client client[] = new client[choice];
        for (int x = 0; client.length > x; x++) {

            String firstName, lastName, sex, Address, day, time;
            int Age;

            System.out.print("First Name: ");
            firstName = s.nextLine();
            System.out.print("last Name: ");
            lastName = s.nextLine();
            System.out.print("Age: ");
            Age = s.nextInt();
            s.nextLine();
            System.out.print("Sex:");
            sex = s.nextLine();
            System.out.print("March," + "Day: ");
            day = s.nextLine();
            System.out.print("Time: ");
            time = s.nextLine();
            System.out.println("Address: ");
            Address = s.nextLine();
            client[x] = new client(firstName, lastName, sex, time, day, Address, Age);
            System.out.println("");

        }
        for (client c : client) {
            c.showUserAppoinment();
            System.out.println("");
        }

    }

}

class client {

    String firstName, lastName, sex;
    String month = "March", day, time;
    String Address;
    int Age;
    int year = 2024;

//    client() {
//        firstName = "Client Firstname";
//        lastName = "Client Surname";
//        sex = "Your Sex";
//        String day = "day";
//        String time = "time";
//        Address = "Your Adress";
//        Age = 0;
//
//    }
    client(String firstName, String lastName, String sex, String day, String time, String Address, int Age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.day = day;
        this.time = time;
        this.Address = Address;
        this.Age = Age;

    }

    void showUserAppoinment() {

        System.out.println("Full Name: " + firstName + " " + lastName + "\nAge: " + Age + "\nSex:" + sex + "\nDate: " + month + "-" + day + "-" + year + "\nTime: " + time + "\nAddress: " + Address);
    }
}
