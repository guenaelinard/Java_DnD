import java.util.Scanner; //permet d'utiliser la classe Scanner via un import (Java Collections Framework

public class Menu {

    private boolean exit = false;

    private final Scanner scanner;


    //-------------------------------- CONSTRUCTORS ------------------------------------

    public Menu(Scanner scanner) {// constructeur de la classe Menu
        this.scanner = scanner;
    }

    //----------------------------------------- METHODS --------------------------------------

    public void exitGame() { // Used when the option "Exit game" is chosen
//        System.out.println("Valeur d'exit avant : " + exit);
        exit = true;
//        System.out.println("Valeur d'exit après : " + exit);
    }


    public void displayMenu() { // Shows the Main Menu where you create your player
        Character player = new Character();
        while (!exit) {
            System.out.println("\n ----------------------------- PROJECT : D I C E  -----------------------------");
            System.out.println("Select : ");
            System.out.println("1 - Create new Player\n2 - Exit game");
            int choice = scanner.nextInt();
            if (choice == 1) {
                createPlayer(player, scanner);
            } else if (choice == 2) {
                exitGame();
                System.out.println("et bah non");
            }
            while (!exit) {
                displayMenuWithCharacterCreated(player);
            }
        }
    }


    public void displayMenuWithCharacterCreated(Character player) { //Menu instancing after the character creation
        System.out.println("\n1 - Start new Game\n2 - Show Player info\n3 - Modify Character\n4 - Exit game");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Feature in development");
        } else if (choice == 2) {
            showPlayerInfo(player);
        } else if (choice == 3) {
            createPlayer(player, scanner);
        } else if (choice == 4) {
            exitGame();
            System.out.println("et bah non");
        }
    }

    // Method to create your character or modify it (by modifying the attributes)
    public void createPlayer(Character player, Scanner scanner) {
        System.out.println("Player's name:");
        String playerName = scanner.next();
        System.out.println("Choose your class, " + playerName + ":");
        String playerClass = scanner.next();
        if (playerClass.equalsIgnoreCase("Warrior")) {
            player.setCharName(playerName);
            player.setCharClass(playerClass);
            player.setCharLifeLevel(10);
            player.setCharStrength(10);
            player.setCharOffensiveItem("Sword");
            player.setCharDefensiveItem("Shield");
            System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
        } else if (playerClass.equalsIgnoreCase("Wizard")) {
            player.setCharName(playerName);
            player.setCharClass(playerClass);
            player.setCharLifeLevel(6);
            player.setCharStrength(15);
            player.setCharOffensiveItem("Ember Staff");
            player.setCharDefensiveItem("Spell : Protect");
            System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
        } else {
            System.out.println("This class does not exist.");
            createPlayer(player, scanner);
        }
    }

    public void showPlayerInfo(Character player) { //Display character stats
        System.out.println(player);
    }
}

