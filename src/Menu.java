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
        while (!exit) {
            System.out.println(" ----------------------------- PROJECT : D I C E  -----------------------------");
            System.out.println("Select : ");
            System.out.println("1 - Create new Player\n2 - Exit game");
            int choice = scanner.nextInt();
            if (choice == 1) {
                String playerName = "";
                String playerClass = "";
                Character newPlayer = new Character();
                newPlayer.createPlayer(playerName, playerClass, scanner);
            } else if (choice == 2) {
                exitGame();
                System.out.println("et bah non");
            }
            while (!exit){
                getMenuWithCharacterCreated();
            }
        }
    }


    public void getMenuWithCharacterCreated() { //Menu instancing after the character creation
        System.out.println("1 - Start new Game\n2 - Show Character info\n3 - Modify Character\n4 - Exit game");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Feature in development");
        } else if (choice == 2) {
            System.out.println("Feature in development");
        } else if (choice == 3) {
            System.out.println("Feature in development");
        } else if (choice == 4) {
            exitGame();
            System.out.println("et bah non");
        }
    }
}
