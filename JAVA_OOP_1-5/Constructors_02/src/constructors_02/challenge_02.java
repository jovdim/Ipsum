/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructors_02;

import java.util.Scanner;

//USER INPUT OBJECT CREATION.
//create a class of your choice then create an object from that class using user input
public class challenge_02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String personName;
        int personAge;

        System.out.print("input any name: ");
        personName = s.nextLine();
        System.out.print("Input the their age: ");
        personAge = s.nextInt();

        constructs_02 p1 = new constructs_02(personName, personAge);
        System.out.println("Name: " + p1.name + " Age: " + p1.age);
    }
}

class constructs_02 {

    String name;
    int age;

    constructs_02(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Hello " + name);

    }
}
