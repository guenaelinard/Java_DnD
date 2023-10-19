import java.util.Scanner;

public class Character { //création de ma classe avec ses keys
    private String charClass;
    private String charName;
    private int charLiveLevel;
    private int charStrength;
    private String charOffensiveItem;
    private String charDefensiveItem;

    public Character() { //constructeur par défaut (sans paramètres)
        charName = "Zob";
        charClass = "Monk";
        charLiveLevel = 15 ;
        charStrength = 15;
        charOffensiveItem = "Mandale de Forain";
        charDefensiveItem = "";
    }

    public Character(String name) { //constructeur avec deux paramètres
        charName = name;
        charClass = "Monk";
        charLiveLevel = 15 ;
        charStrength = 15;
        charOffensiveItem = "Mandale de Forain";
        charDefensiveItem = "";
    }

    public Character(String name, String jobClass, int lifeLevel, int Strength, String offensiveItem, String defensiveItem) { //constructeur complet
        charName = name;
        charClass = jobClass;
        charLiveLevel = lifeLevel;
        charStrength = Strength;
        charOffensiveItem = offensiveItem;
        charDefensiveItem = defensiveItem;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getCharLiveLevel() {
        return charLiveLevel;
    }

    public void setCharLiveLevel(int charLiveLevel) {
        this.charLiveLevel = charLiveLevel;
    }

    public int getCharStrength() {
        return charStrength;
    }

    public void setCharStrength(int charStrength) {
        this.charStrength = charStrength;
    }

    public String getCharOffensiveItem() {
        return charOffensiveItem;
    }

    public void setCharOffensiveItem(String charOffensiveItem) {
        this.charOffensiveItem = charOffensiveItem;
    }

    public String getCharDefensiveItem() {
        return charDefensiveItem;
    }

    public void setCharDefensiveItem(String charDefensiveItem) {
        this.charDefensiveItem = charDefensiveItem;
    }

    public Character createPlayer(String playerName, String playerClass, Scanner scanner) {
        Character player;
        System.out.println("Player's name:");
        playerName = scanner.next();
        System.out.println("Choose your class, " + playerName + ":");
        playerClass = scanner.next();
        if (playerClass.equalsIgnoreCase("Warrior")) {
             player = new Character(playerName, playerClass, 10, 10, "Sword", "Shield");
            System.out.println(player);
            System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
        } else if (playerClass.equalsIgnoreCase("Wizard")) {
             player = new Character(playerName, playerClass, 6, 15, "Ember Staff", "Spell : Protect");
            System.out.println(player);
            System.out.println("Welcome, " + playerName + " the " + playerClass + ".");
        } else {
            System.out.println("This class does not exist.");
            player = new Character(playerName);
        }
        return player;
    }

    @Override
    public String toString() {
        return "Character{" +
                "charClass='" + charClass + '\'' +
                ", charName='" + charName + '\'' +
                ", charLiveLevel=" + charLiveLevel +
                ", charStrength=" + charStrength +
                ", charOffensiveItem='" + charOffensiveItem + '\'' +
                ", charDefensiveItem='" + charDefensiveItem + '\'' +
                '}';
    }
}
