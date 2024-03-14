/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jovdim
 */
public class Exercise_polymorphism {

    public static void main(String[] args) {

        Fruits a = new Apple();
        Fruits b = new Banana();
        Fruits g = new Grapes();
        Fruits w = new Watermelon("Orange");
        Fruits w1 = new Watermelon();
        Fruits w2 = new Watermelon("WAWAMELON", "Pink");
        a.dialog();
        b.dialog();
        g.dialog();
        w.dialog();
        w1.dialog();
        w2.dialog();
    }
}

class Fruits {

    String name, color;

    //defualt value
    Fruits() {
    }

    ;
    void dialog() {
        System.out.println("I am " + name + " and my color is " + color);
    }
}

class Apple extends Fruits {

    Apple() {
      
        name = "Apple";
        color = "Red";
    }

  
}

class Banana extends Fruits {

    Banana() {
        name = "Banana";
        color = "Yellow";
    }

    //this is the way to retain the value of dialog that use in the Apple class
//    void dialog() {
//        super.dialog();
//    }
}

class Grapes extends Fruits {

    Grapes() {
        
        name = "Grapes";
        color = "Violet";
    }

 

}

class Watermelon extends Fruits {

    //thnis is just the default value we can still construct it.
    Watermelon() {

        name = "Watermellon";
        color = "Green";
    } 

    //this is the contructor. it is like overriding the contructors
    Watermelon(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //we can also override it again though we override it already.
    Watermelon(String color) {
        this.color = color;
        name = "melonWater";
        
    }

   
   
}
