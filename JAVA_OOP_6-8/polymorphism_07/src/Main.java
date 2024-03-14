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
        Animal d = new Dog();
        Animal c = new Cat();
        Animal a = new Animal();
        Animal d1 = new Dog();
        a.makeSound();
        d.makeSound();
        c.makeSound();
        d1.makeSound();

        System.out.println("________another topic below________________________________");

        //this is called polymoephism
        Enemy w = new weakEnemy("lorem",78);
        Enemy n = new normalEnemy("Ipsum",97);
        Enemy s = new strongEnemy("Dolor",88);
        Enemy b = new bossEnemy("Amet", 99);
        
        w.dialog();
        n.dialog();
        s.dialog();
        b.dialog();
    }

}
//there is no limit POLYMORPHISM

class Animal {

    void makeSound() {
        System.out.println("Please override me.");
    }
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Arf arf!");
    }
}

class Cat extends Animal {

    void makeSound() {
        System.out.println("meow meow!");
    }
}

//another example topic
//base class
class Enemy {

    String name;
    int hp;

    //default value
    Enemy() {
    }

    ;
    
    Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void dialog() {
        System.out.println("Please override me.");
    }
        void showStats(){
        System.out.println("I am : " + name + " and my currents stats is " + hp);
    }


}

class weakEnemy extends Enemy {

    //default value
    weakEnemy() {
    }

    ;
    
    weakEnemy(String name, int hp) {
        super(name, hp);
    }

    void dialog() {
        System.out.println("I am the Weak Enemy.");
    }
    
}

class normalEnemy extends Enemy {

    //default value
    normalEnemy() {
    }

    ;
    
    normalEnemy(String name, int hp) {
        super(name, hp);
    }

    void dialog() {
        System.out.println("I am the Normal Enemy.");
    }
}

class strongEnemy extends Enemy {
    //default value

    strongEnemy() {
    }

    ;

    strongEnemy(String name, int hp) {
        super(name, hp);
    }

    void dialog() {
        System.out.println("I am the Strong Enemy.");
    }
}

class bossEnemy extends Enemy {

    //default value
    bossEnemy() {
    }

    ;
    bossEnemy(String name, int hp) {
        super(name, hp);
    }

    void dialog() {
        System.out.println("I am the Boss Enemy.");
    }
}
