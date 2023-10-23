package Characters;

import Items.protections.DefensiveItem;
import Items.protections.Shield;
import Items.weapons.OffensiveItem;
import Items.weapons.Sword;


public class Warrior extends Character {

    public Warrior(String charName) {
        super(charName, "Warrior", 10, 10, new Sword("Cutting Weapon"), new Shield("Shield"));
    }
}
