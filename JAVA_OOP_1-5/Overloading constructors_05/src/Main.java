/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jovdim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee p = new Employee("Lorem", "Ipsum", "Programmer", "nomad", "Male", 19);
        
        //we just need to get 3 value. and yeah it is overloading constructors same constructors name but different parameters.
        Employee p1 = new Employee("Lorem", "Ipsum", "nomad");
        
        //as you can see there is no error because we put like default for constructors once user did not input anything
        Employee p2 = new Employee();
    }

}

class Employee {

    private String firstName, lastName;
    private String title, address, sex;
    private int age;

    //we can use multiple constructors. or default constructors.
    Employee(String firstName,
            String lastName,
            String title,
            String adress,
            String sex,
            int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;

    }

    //so it is like if we just want to get the firstName, lastName and address we can use thing technique called constructors overloading.
    Employee(String firstname, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //so this is like the default. when user don't put any information we will put the default constructors instead.
    Employee() {
        
        //we did not use "this" keyword because it does not have same parameter. it don't have parameter either
        firstName = "jdim";
        lastName = "leos";
        title = "Programmer";
        address = "Mars";
        sex = "Male";
        age = 19;

    }

}
