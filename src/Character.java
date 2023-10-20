
public class Character { //création de ma classe avec ses keys
    private String charClass;
    private String charName;
    private int charLifeLevel;
    private int charStrength;
    private String charOffensiveItem;
    private String charDefensiveItem;


    //---------------------------------------- CONSTRUCTORS -----------------------------------
    public Character() { //constructeur par défaut (sans paramètres)
        charName = "Zob";
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        charOffensiveItem = null;
        charDefensiveItem = null;
    }

    public Character(String name) { //constructeur avec deux paramètres
        charName = name;
        charClass = "Monk";
        charLifeLevel = 15;
        charStrength = 15;
        charOffensiveItem = null;
        charDefensiveItem = null;
    }

    public Character(String name, String jobClass, int lifeLevel, int Strength, String offensiveItem, String defensiveItem) { //constructeur complet
        charName = name;
        charClass = jobClass;
        charLifeLevel = lifeLevel;
        charStrength = Strength;
        charOffensiveItem = offensiveItem;
        charDefensiveItem = defensiveItem;
    }

    //-------------------------------- GET/SET --------------------------------

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

    public int getCharLifeLevel() {
        return charLifeLevel;
    }

    public void setCharLifeLevel(int charLifeLevel) {
        this.charLifeLevel = charLifeLevel;
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



    @Override
    public String toString() { //Affichage des attributs du perso
        return "--             Player Info             --" +
                "\n             Name : " + charName +
                "\n             Class : " + charClass +
                "\n             LifePoints : " + charLifeLevel +
                "\n             Strength : " + charStrength +
                "\n             Weapon : " + charOffensiveItem +
                "\n             Defense : " + charDefensiveItem;

    }
}
