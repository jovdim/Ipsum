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
        
        Character c1 = new Character("lorem", "How you doin\'", 100, 320, 12);
        Character c2 = new Character("ipsum", "How is it going\'", 80, 300, 9);
        Character c3 = new Character();
        c1.introduce();
        c3.introduce();
        c1.talkTo(c1.name);
       c2.dialog("In the world of normal people, vampires are existed");
        
    }
    
}

class Character {
    
    String name, dialog;
    int hp, mp, lvl;

    //we can hava default attribute value
    Character() {
        name = "Unknown Player";
        dialog = "Hi there";
        hp = 100;
        mp = 234;
        lvl = 1;
    }
    
    Character(String name, String dialog, int hp, int mp, int lvl) {
        
        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;
        
    }
    
    //this is method(purpose)
    void introduce() {
        System.out.println(name + " : " + dialog);
    }
    
    void talkTo(String firstName) {
        System.out.println(name + " : Helllo," + firstName);
    }
    void dialog(String dialog){
        System.out.println(name +": " + dialog );
    }
}
