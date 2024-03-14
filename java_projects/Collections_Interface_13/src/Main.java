
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        Random r = new Random(9);
        
        System.out.println(r.toString());
        char pChoice;
        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.println("\n\n ENTER ONLY [r]ROCK, [p]PAPER, [s]SCISSORS");
        System.out.println("\n\nYour choice:  ");
        pChoice = s.nextLine().charAt(0);

    }
}
