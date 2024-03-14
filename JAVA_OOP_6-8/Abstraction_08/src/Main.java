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

        //ABSTRACT IDEA
        //Animal a = new Animal();
        //CONTRETE IDEA
        Animal d = new Dog();
        Animal c = new Cat();
        d.dialog();
        c.dialog();

        System.out.println("");
        d.setName("Browny");
        c.setName("kitty");
        d.showName();
        c.showName();
        d.walk();
        c.walk();
       
        
        

    }

}

abstract class Animal {

     String name;

    abstract void dialog();

    abstract void walk();

    void showName() {

        System.out.println("My name is " + name);
    }

    void setName(String name) {
        this.name = name;
    }

}

class Dog extends Animal {


    void dialog() {

        System.out.println("Hello World");
    }

    void walk() {

        System.out.println(name + " is walking");
    }
}

class Cat extends Animal {

    void dialog() {
        System.out.println("Hi There");

    }

    void walk() {

        System.out.println(name + " is walking");
    }

}
