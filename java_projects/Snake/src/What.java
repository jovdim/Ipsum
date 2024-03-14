
import java.util.Random;
import java.util.Scanner;

public class What {

    static Scanner scan = new Scanner(System.in);
    static Random randomize = new Random();
    static int dagger = 15;
    static int weapon = dagger;
    static int bow = 25;
    static int slimeHealth = 100;
    static int playerHealth = 100;
    static int gold;
    static int exp;

    public static void main(String[] args) { //Main
        System.out.println("You've Encountered a wild Slime!\n");
        battleInterface();

        playerDecision();

    }

    static void battleInterface() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Slime lv.1\n Health: " + slimeHealth);
        System.out.println("\n\n\t\t----------V.S----------\n");
        System.out.println("\n\t\t\t\t\tPlayer Lv.1\n\t\t\t\t\t Health: " + playerHealth);
        System.out.println("--------------------------------------------------------");
    }

    static void playerDecision() {
        System.out.println("What will you do?\n");
        System.out.println(" [1] Fight\n [2] Escape\n");

        System.out.print("Player Choice: ");
        int playerChoice = scan.nextInt();

        switch (playerChoice) {
            case 1:
                weaponChoice(playerChoice);
                break;
            case 2:
                System.out.println("Escaped successfully!");
                break;
            default:
                battleInterface();
                break;
        }
    }

    static void weaponChoice(int playerChoice) {
        System.out.println("--------------------------------------------------------");
        System.out.println("What weapon would you like to use?\n");
        System.out.println(" [1] Dagger\n [2] Bow\n");

        System.out.print("Player Choice: ");
        int playerChoice1 = scan.nextInt();

        switch (playerChoice) {
            case 1:
                switch (playerChoice1) {
                    case 1:
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You Picked the Dagger!");
                        battleInterface();
                        playerActions(playerChoice, playerChoice1);
                        break;
                    case 2:
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You Picked the Bow!");
                        battleInterface();
                        playerActions(playerChoice, playerChoice1);
                        break;
                    default:
                        weaponChoice(playerChoice);
                        break;
                }
                break;
        }
    }

    static void playerActions(int playerChoice, int playerChoice1) {
        System.out.println("Player Action:");
        System.out.println(" [1] Attack\n [2] Defend\n [3] Bag\n [4] Run\n");

        System.out.print("Player Choice:");
        int playerChoice2 = scan.nextInt();

        switch (playerChoice2) {
            case 1:
                playerAttack(playerChoice, playerChoice1);
                break;
            default:
                battleInterface();
                playerActions(playerChoice, playerChoice1);
                break;
        }
    }

    static void playerAttack(int playerChoice, int playerChoice1) {
        if (playerChoice >= 3) {
            playerActions(playerChoice, playerChoice1);
        } else {
            if (playerChoice1 == 1) {
                playerMove(playerChoice, playerChoice1 = 1);
            }

            if (playerChoice1 == 2) {
                playerMove(playerChoice, playerChoice1 = 2);
            }
        }
    }

    static void playerMove(int playerChoice, int playerChoice1) {
        switch (playerChoice1) {
            case 1:
                double criticalChance1 = 0.3; //30% chance to crit
                double chanceResult1 = randomize.nextDouble(); //the value if its gonna hit the 50% chance or not

                double missChance1 = 0.1; // 10% chance for your attack to miss
                double chanceResult2 = randomize.nextDouble();

                if (chanceResult2 < missChance1) {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("You attacked the slime!");
                    System.out.println("But your attack missed!");

                    slimeAttack(playerChoice, playerChoice1);
                    battleInterface();
                    playerActions(playerChoice, playerChoice1);
                } else {
                    if (chanceResult1 < criticalChance1) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You attacked the slime!");
                        int damage = (int) ((randomize.nextInt(8) + weapon) * 1.5);
                        System.out.println("And you dealt " + damage + " damage!");
                        System.out.println("A Critical Hit!");

                        slimeHealth -= damage;
                        if (slimeHealth <= 0) {
                            battleInterface();
                            slimeDefeated();
                        }
                        if (slimeHealth >= 1 && playerHealth >= 1) {
                            slimeAttack(playerChoice, playerChoice1);
                            battleInterface();
                            playerActions(playerChoice, playerChoice1);
                        }
                    } else {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You attacked the slime!");
                        int damage = randomize.nextInt(8) + weapon; //damage will be randomized to 15-22
                        System.out.println("And you dealt " + damage + " damage!");

                        slimeHealth -= damage;
                        if (slimeHealth <= 0) {
                            battleInterface();
                            slimeDefeated();
                        }
                        if (slimeHealth >= 1 && playerHealth >= 1) {
                            slimeAttack(playerChoice, playerChoice1);
                            battleInterface();
                            playerActions(playerChoice, playerChoice1);
                        }
                    }
                }
                break;
            case 2:
                double criticalChance2 = 0.55; //55% chance to crit
                double chanceResult3 = randomize.nextDouble();

                double missChance2 = 0.3; // 30% chance for your attack to miss
                double chanceResult4 = randomize.nextDouble();

                if (chanceResult4 < missChance2) {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("You attacked the slime!");
                    System.out.println("But your attack missed!");

                    slimeAttack(playerChoice, playerChoice1);
                    battleInterface();
                    playerActions(playerChoice, playerChoice1);
                } else {
                    if (chanceResult3 < criticalChance2) {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You attacked the slime!");
                        int damage = (int) ((randomize.nextInt(8) + bow) * 1.5);
                        System.out.println("And you dealt " + damage + " damage!");
                        System.out.println("A Critical Hit!");

                        slimeHealth -= damage;
                        slimeHealth -= damage;
                        if (slimeHealth <= 0) {
                            battleInterface();
                            slimeDefeated();
                        }
                        if (slimeHealth >= 1 && playerHealth >= 1) {
                            slimeAttack(playerChoice, playerChoice1);
                            battleInterface();
                            playerActions(playerChoice, playerChoice1);
                        }
                    } else {
                        System.out.println("--------------------------------------------------------");
                        System.out.println("You attacked the slime!");
                        int damage = randomize.nextInt(8) + bow;
                        System.out.println("And you dealt " + damage + " damage!");

                        slimeHealth -= damage;
                        if (slimeHealth <= 0) {
                            battleInterface();
                            slimeDefeated();
                        }
                        if (slimeHealth >= 1 && playerHealth >= 1) {
                            slimeAttack(playerChoice, playerChoice1);
                            battleInterface();
                            playerActions(playerChoice, playerChoice1);
                        }
                    }
                }
                break;
        }
    }

    static void slimeAttack(int playerChoice, int playerChoice1) {
        double criticalChance1 = 0.15; //15% chance to crit
        double chanceResult1 = randomize.nextDouble();

        double missChance1 = 0.20; // 20% chance for your attack to miss
        double chanceResult2 = randomize.nextDouble();

        if (chanceResult2 < missChance1) {
            System.out.println("--------------------------------------------------------");
            System.out.println("The slime Attacks!");
            System.out.println("But its attack missed!");
        } else {
            if (chanceResult1 < criticalChance1) {
                System.out.println("--------------------------------------------------------");
                System.out.println("The slime Attacks!");
                int damage = (int) ((randomize.nextInt(8) + 10) * 1.5);
                System.out.println("And it dealt " + damage + " damage!");
                System.out.println("A Critical Hit!");

                playerHealth -= damage;
                if (playerHealth <= 0) {
                    battleInterface();
                    playerDefeated();
                }
            } else {
                System.out.println("--------------------------------------------------------");
                System.out.println("The slime Attacks!");
                int damage = randomize.nextInt(8) + 10;
                System.out.println("And it dealt " + damage + " damage!");

                playerHealth -= damage;
                if (playerHealth <= 0) {
                    battleInterface();
                    playerDefeated();
                }
            }
        }
    }

    static void slimeDefeated() {
        System.out.println("You've Defeated the Slime!");
        gold = randomize.nextInt(38) + 23;
        exp = randomize.nextInt(48) + 37;
        System.out.println("-You earned " + gold + " Golds!");
        System.out.println("-You earned " + exp + " Experience!");
        System.out.println("\nTHANK YOU FOR PLAYIN BROSKI!");
        System.out.println("--------------------------------------------------------");
    }

    static void playerDefeated() {
        System.out.println("You got bodied by a slime, RIP BOZO LMAO!");
        System.out.println("--------------------------------------------------------");

    }
}
