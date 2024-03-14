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
        //this is how you call enum object.
        AILevel level = AILevel.MEDIUM;

        //i use switch  than this kind of conditional for betterment
//        if (level == AILevel.EASY) {
//            System.out.println("For Babies");
//
//        } else if (level == AILevel.MEDIUM) {
//             System.out.println("For Kids");
//
//        } else if (level == AILevel.HARD) {
//             System.out.println("For Men");
//
//        }
        switch (level) {
            case EASY:
                System.out.println("For Babies");
                break;
            case MEDIUM:
                System.out.println("For Kids");
                break;
            case HARD:
                System.out.println("For Men");
                break;

        }
    }

}

//to declare enum.use this keyword to declare it.
//It is commonly use for conditional statement.
enum AILevel {
    EASY,
    MEDIUM,
    HARD;
}

enum USCurrency {

    PENNY(0.01f), NICKLE(0.05f), DIME(0.1f), QUARTER(0.25f);
    
    float val;

    USCurrency(float val){
    this.val = val;
    }
}
