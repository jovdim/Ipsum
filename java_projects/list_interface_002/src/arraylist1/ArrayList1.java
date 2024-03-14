package arraylist1;

import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //while loop to loop this code again and again else if the user going to buy the item it will be going to stop LMAOOOOOO
        while (true) {
            System.out.println("---------------------------------------------------\n");
            System.out.println("Welcome to the grocery!\n");
            System.out.println("[0] Fruit List\n[1] Vegetable List\n[2] Dairy List\n[3] Buy\n[4] View Cart\n[5] Cancel");

            System.out.print("User Choice: ");
            int userChoice = scan.nextInt();

            ArrayList<ArrayList<String>> groceryList = new ArrayList();

            ArrayList<String> fruitList = new ArrayList();

            fruitList.add("Apple");
            fruitList.add("Orange");
            fruitList.add("Grapes");

            ArrayList<String> vegetableList = new ArrayList();

            vegetableList.add("Lettuce");
            vegetableList.add("Egg Plant");
            vegetableList.add("Carrot");

            ArrayList<String> dairyList = new ArrayList();

            dairyList.add("Egg");
            dairyList.add("Milk");

            groceryList.add(fruitList);
            groceryList.add(vegetableList);
            groceryList.add(dairyList);

            switch (userChoice) {
                case 0:
                    if (userChoice == 0) {
                        System.out.println("---------------------------------------------------\n");
                        System.out.println("Fruit Area:\n");
                        int i = 0;
                        for (String productList : groceryList.get(userChoice)) {

                            System.out.println("[" + i + "] " + productList);
                            i++;
                        }
                    }
                    break;
                case 1:
                    if (userChoice == 1) {
                        System.out.println("---------------------------------------------------\n");
                        System.out.println("Vegetable Area:\n");
                        int i = 0;
                        for (String productList : groceryList.get(userChoice)) {

                            System.out.println("[" + i + "] " + productList);
                            i++;
                        }

                    }
                    break;
                case 2:
                    if (userChoice == 2) {
                        System.out.println("---------------------------------------------------\n");
                        System.out.println("Dairy Area:\n");
                        int i = 0;
                        for (String productList : groceryList.get(userChoice)) {

                            System.out.println("[" + i + "] " + productList);
                            i++;
                        }

                    }
                    break;
                case 3:
                    buy(scan);
                    break;
                case 4:
                    System.out.println("\n[Cart:]");
                    cart(scan);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("---------------------------------------------------\n");
                    System.out.println("WRONG INPUT!\n");
                    System.out.println("---------------------------------------------------");
                    System.exit(0);
                    break;
            }

            System.out.println("\nSelect the following Item:\n");

            System.out.print("User Choice: ");
            int userChoice1 = scan.nextInt();
            //

            int userQuantity;
            switch (userChoice1) {
                case 0:
                    System.out.println("---------------------------------------------------\n");
                    System.out.println("Selected Item:\n");

                    //these are some code i added to add the choices of user.
                    //as you can see there are many same code as this code below. That should not have occurred.
                    userCart.add(groceryList.get(userChoice).get(userChoice1));
                    System.out.print("Quantity: ");
                    userQuantity = scan.nextInt();
                    scan.nextLine();
                    userItemQuantiy.add(userQuantity);
                    System.out.println("\nYou've have successfully purchased:\nItem: " + groceryList.get(userChoice).get(userChoice1) + "  \t\tQuantity: " + userQuantity);
                    repeat(scan);
                    break;
                case 1:
                    System.out.println("---------------------------------------------------\n");
                    System.out.println("Selected Item:\n");
                    //
                    userCart.add(groceryList.get(userChoice).get(userChoice1));
                    System.out.print("Quantity: ");
                    userQuantity = scan.nextInt();
                    scan.nextLine();
                    userItemQuantiy.add(userQuantity);
                    System.out.println("\nYou've have successfully purchased:\nItem: " + groceryList.get(userChoice).get(userChoice1) + "  \t\tQuantity: " + userQuantity);
                    repeat(scan);

                    break;
                case 2:
                    if (userChoice == 2) {
                        System.out.println("---------------------------------------------------\n");
                        System.out.println("INVALID INPUT!\n");
                        System.out.println("---------------------------------------------------");
                    } else {
                        System.out.println("---------------------------------------------------\n");
                        System.out.println("Selected Item:\n");
                        //
                        userCart.add(groceryList.get(userChoice).get(userChoice1));
                        System.out.print("Quantity: ");
                        userQuantity = scan.nextInt();
                        scan.nextLine();
                        userItemQuantiy.add(userQuantity);
                        System.out.println("\nYou've have successfully purchased:\nItem: " + groceryList.get(userChoice).get(userChoice1) + "  \t\tQuantity: " + userQuantity);
                        repeat(scan);
                    }
                    break;
                default:
                    System.out.println("---------------------------------------------------\n");
                    System.out.println("INVALID INPUT!\n");
                    System.out.println("---------------------------------------------------");
                    break;
            }
        }

    }

    //this is where the user new add item will be saved
    static List<String> userCart = new ArrayList<>();
    static List<Integer> userItemQuantiy = new ArrayList<>();

    //buy feature shi
    //If the user buys an item already in the cart, it will be duplicated causeee ur code doesn't fix that. If I fix it, over half of your code will need replacing lamo.
    static void buy(Scanner scan) {
        System.out.println("\n[BUY:]");
        for (int x = 0; userCart.size() > x; x++) {

            System.out.println("Item:" + userCart.get(x) + "\t\tQuantity: " + userItemQuantiy.get(x));

        }
        System.out.print("\n[1]Buy\t[0]Cancel\nchoice: ");
        int usChoice = scan.nextInt();
        switch (usChoice) {
            case 1:
                System.out.println("\nYou have successfully completed the purchase of the item!");
                userCart.clear();
                userItemQuantiy.clear();
                System.exit(0);
            case 0:
                System.out.println("The purchase has been cancelled!");
                System.exit(0);

        }

    }

    //this is just to stop the while loop for a moment.
    static void repeat(Scanner scan) {
        System.out.print("\nPress any key to continue...");
        scan.nextLine();

    }
//cart feature

    static void cart(Scanner scan) {
        for (int x = 0; userCart.size() > x; x++) {

            System.out.println("Item:" + userCart.get(x) + "\t\tQuantity: " + userItemQuantiy.get(x));

        }
        System.out.print("\nPress any key to continue...");
        scan.nextLine();
        scan.nextLine();

        System.out.print("\n[1]Buy\t[0]Cancel\nchoice: ");
        int usChoice = scan.nextInt();
        switch (usChoice) {
            case 1:
                System.out.println("\nYou have successfully completed the purchase of the item!");
                userCart.clear();
                userItemQuantiy.clear();
                System.exit(0);
            case 0:
                System.out.println("The purchase has been cancelled!");
                System.exit(0);

        }
    }

}
