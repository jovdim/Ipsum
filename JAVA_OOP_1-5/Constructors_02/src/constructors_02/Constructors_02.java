/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors_02;

/**
 *
 * @author jovdim
 */
public class Constructors_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// This is called instantiation.
        Person p1 = new Person("Lorem", "Ipsum", 'M', 19);
        Person p2 = new Person("Dolor", "Amet", 'F', 19);
        
        
        System.out.println("Hello, this is " + p2.firstName + " and her age is " + p2.age + " as well as this is " + p1.firstName + " his age is " + p1.age + " too");

    }

}

class Person {

    String firstName, lastName;
    char sex;
    int age;

    //this is called constructors. this is best pratices because it looks more clean.
    Person(String firstName, String lastName, char sex, int age) {

        //we use "this" keyword to point that we want to access the variable not the parameter.
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

        //we can also do this without using this keyword.
        //firstName = personFirstName.
        // the paramter should be personfirstName but it is awaful best practices is to use this keyword.
    }
}
