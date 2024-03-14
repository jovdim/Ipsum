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
        Person p = new Person("Lorem", "Female", 19);
        Toddler t = new Toddler("Ipsum", "Male", 2, "Sleeping");
        Kid k = new Kid("Dolor", "Male", 12, "Coding", 7);

        //this is called Polymorephism
        Toddler k1 = new Kid("Amet", "Male", 19, "Coding", 1);
        
        //we do this when we do not use constructors in the class objects. 
//        p.name = "Lorem";
//        p.sex = "Female";
//        p.age = 19;
//        p.checkStatus();
//        System.out.println("");
//        t.name = "Ipsum";
//        t.sex = "Male";
//        t.age = 2;
//        t.checkStatus();
//        t.drink();

        p.checkStatus();
        System.out.println("");
        t.checkStatus();
        t.drink();
        System.out.println("");
        k.checkStatus();
        k.drink();
        System.out.println("");
        k1.checkStatus();

    }

}

class Person {

    String name, sex;
    int age;

    Person() {
    }

    ; 
    
    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);

    }

}

class Toddler extends Person {

    String favoriteGame;

    //we still need to create the subclass an constructors if the superclass is using constructors
    Toddler(String name, String sex, int age, String favoriteGame) {
        //super is like that we're pointing the superclass which is the person.
        super(name, sex, age);
        this.favoriteGame = favoriteGame;

    }

    void drink() {
        System.out.println(name + " is drinking Milk");
    }

    //this is called overriding because we something like overwritting the existing checkStatus from parent class.
    void checkStatus() {
        //we call the superclass again to retain what inside in the checkStatus method. so we can add another functionality we want. if we did not called the super keyword it will just overwrite to what want we want to put inside.
        super.checkStatus();
        System.out.println(name + " favorite game is " + favoriteGame);
    }
}

//inherit to the subclass that also inherit the superclass. it is possible which this how this code created below.
class Kid extends Toddler {

    int gradeLevel;

    Kid(String name, String sex, int age, String favoriteGame, int gradeLevel) {
        super(name, sex, age, favoriteGame);
        this.gradeLevel = gradeLevel;
    }

    void checkStatus() {
//again, this is to retain the value what inside the checkStatus method.
        super.checkStatus();
        System.out.println("Grade level: " + gradeLevel);
    }
}
