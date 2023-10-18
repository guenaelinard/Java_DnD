import java.util.Scanner;

public class Menu {
    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) { //Get/Set du boolean exit
        this.exit = exit;
    }
    private boolean exit = false;

    public Menu() {
    }

    public void exitGame() {
         exit = true;
    }

    public void getMenu() {
        System.out.println(" ----------------------------- PROJECT : D I C E  -----------------------------");
        System.out.println("Select : ");
        Scanner myChoice = new Scanner(System.in);
        System.out.println("1 - Create new Player\n2 - Exit game");
        int choice = myChoice.nextInt();
        if (choice == 1) {
            getPlayer();
        } else if (choice == 2) {
            exitGame();
            System.out.println("et bah non");
        }
    }

    public void getPlayer() {   //character creation using createPlayer method
        Scanner myMenu = new Scanner(System.in);
        System.out.println("Player's name:");
        String playerName = myMenu.nextLine();
        System.out.println("Choose your class, " + playerName + ":");
        String playerClass = myMenu.nextLine();
        Character newPlayer = new Character();
        newPlayer.createPlayer(playerName, playerClass);
    }
}
