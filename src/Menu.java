import java.util.Scanner;

public class Menu {

    private boolean exit = false;

    private final Scanner scanner;

    public Menu(Scanner scanner) {// constructeur de la classe Menu
        this.scanner = scanner;
    }

    public void exitGame() { // methode de sortie du jeu (in development)
        System.out.println("Valeur d'exit avant : " + exit);
        exit = true;
        System.out.println("Valeur d'exit après : " + exit);
    }

    public void getMenu() {
                Character player = new Character();
        while (!exit) {
            System.out.println("\n ----------------------------- PROJECT : D I C E  -----------------------------");
            System.out.println("Select : ");
            System.out.println("1 - Create new Player\n2 - Exit game");
            int choice = scanner.nextInt();
            if (choice == 1) {
                String playerName = "";
                String playerClass = "";
                player = player.createPlayer(playerName, playerClass, scanner);
            } else if (choice == 2) {
                exitGame();
                System.out.println("et bah non");
            }
            while (!exit) {
                getMenuWithCharacterCreated(player);
            }
        }
    }


    public void getMenuWithCharacterCreated(Character newPlayer) { //Menu instancing after the character creation
        System.out.println("\n1 - Start new Game\n2 - Show Player info\n3 - Modify Character\n4 - Exit game");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Feature in development");
        } else if (choice == 2) {
            showPlayerInfo(newPlayer);
        } else if (choice == 3) {
            System.out.println("Feature in development");
        } else if (choice == 4) {
            exitGame();
            System.out.println("et bah non");
        }
    }

    public void showPlayerInfo(Character newPlayer) { //Display character stats
        System.out.println("--             Player Info             --");
        System.out.println("\n             Name : " + newPlayer.getCharName());
        System.out.println("\n             Class : " + newPlayer.getCharClass());
        System.out.println("\n             LifePoints : " + newPlayer.getCharLiveLevel());
        System.out.println("\n             Strength : " + newPlayer.getCharStrength());
        System.out.println("\n             Weapon : " + newPlayer.getCharOffensiveItem());
        System.out.println("\n             Defense : " + newPlayer.getCharDefensiveItem());
    }
}

