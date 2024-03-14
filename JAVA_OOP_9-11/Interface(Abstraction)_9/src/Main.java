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
        Cat c = new Cat();
        Dog d = new Dog();
        Bird b = new Bird();
        c.makeSound();
        d.makeSound();
        b.makeSound();
        d.walk();
        b.walk();
        c.walk();
        d.fly();
    }

}

//all of the method in this Animal object will be using default abstract each method.
//WHEN USING INTERFACES THE INSTANCES NAME SHOULD NOT BE SAME LIKE WE DOIN IN INHERIT. THE POLYMORPHISM SHOULD NOT BE APPLIED.
interface Animal {

    //by default all of the method that inside of interface is abstract.
    void makeSound();

}
//reminder we can implement many interface we want.

interface airAnimal extends landAnimal {

    void fly();
    
    
};

interface landAnimal {

    void walk();
};

interface waterAnimal {

    void swim();
};

class Cat implements Animal,landAnimal {

    //by default of the interface method is public so if we are going to override the method add the public modifiers too.
    public void makeSound() {
        System.out.println("Meow");
    }
    public void walk(){
        System.out.println("The cat is walking.");
    }

}

//as you can see we implements more than one to this class. this is useful sometimes than using inheritance because we can inherit more than one.
class Dog implements Animal, landAnimal,airAnimal {

    public void makeSound() {
        System.out.println("Arf");
    }

    public void walk() {

        System.out.println("the dog is walking");
    }
   public void fly(){
       System.out.println("The dog is goddamnn flyingg.");
   }

}

//the bird can also work so we implement the landAninal interface but we did not put it because we extend it directly in the intreface airAnimal object.
class Bird implements Animal, airAnimal {

    public void makeSound() {
        System.out.println("tweet");
    }

    public void fly() {
        System.out.println("The first is fyling");
    }

    public void walk() {
        System.out.println("The bird is walking though he got wings.");
    }
}
