/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jovdim
 */
//imported this to display the real value of array. 
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//make it static to access this stances globaly

    static productItem p = new productItem();
    //just imported the Scaner
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //get the method for ProductItem class objects to display it
        p.showItem();
        //for user option
        selectAction();

    }

    static void selectAction() {

        int userChoice;
        System.out.println("Select action: [1]Add to cart [2]Buy [3]Cancel");

        userChoice = s.nextInt();
        switch (userChoice) {
            case 1:
                //to perform the add to cart for user.
                addTocart();
                break;

            case 2:
                //show to user cart
                buyshi();
                break;
            case 3:
                //ipsum©
                break;

        }
    }

    static void addTocart() {

        int addToCartloop = 5;
        int userPick;
        //loop this to display it five times.
        for (int x = 0; addToCartloop > x; x++) {

            System.out.print("Enter Item: ");
            userPick = s.nextInt();
            //save it to the new array. which is userCart and userCartPrice.
            productItem.userCart[x] = productItem.productName[userPick - 1];
            productItem.userCartPrice[x] = productItem.productPrice[userPick - 1];

        }
        //use the static method instead of the its instance.
        productItem.showItem();
        selectAction();
    }

    //this where computing happens.
    static void buyshi() {
        int total = 0;
        int userPay = 0;
        //to make the real array value shows. if there is no toString method it will just give you hash code/gerbish.
        System.out.println(Arrays.toString(productItem.userCart));
        for (int price : productItem.userCartPrice) {
            total += price;
        }
        System.out.println("Your total for this items is:\n " + total);
        System.out.println("pay: ");
        userPay = s.nextInt();
        if ((userPay - total) <= 0) {
            System.out.println("Your current balance is insufficient to complete the purchase of this item.");
        } else {
            System.out.println("Your purchase has been successfully completed!");
            System.out.println("Your change: " + (userPay - total));
        }

    }

}
//for display item.

class productItem {
//to restore the add item of user. and it is fixed by 5.

    static String[] userCart = new String[5];
    static int[] userCartPrice = new int[5];
    //ikaw na bahala kung anong uri ng item mo.
    static String[] productName = {"item1", "item2", "item3", "item4", "item5"};
    //dapat same lng ng count yung productName mo tsaka yung productPrice else youll encounter error.;
    //change the prices as well
    static int[] productPrice = {1, 2, 3, 4, 5};

    //show the item in the console. once it is called/executed
    static void showItem() {
        System.out.println("******************************************************");
        for (int x = 0; productName.length > x; x++) {
            System.out.println("[" + (x + 1) + "] " + productName[x] + "\t\tP" + productPrice[x]);
        }
        System.out.println("******************************************************");
    }
}