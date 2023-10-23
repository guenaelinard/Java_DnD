package Characters;

import Items.protections.ProtectSpell;
import Items.weapons.EmberStaff;



public class Wizard extends Character {

    public Wizard(String charName) {
        super(charName, "Wizard", 5, 16, new EmberStaff("Ember Staff"), new ProtectSpell("Spell : Protect"));
    }
}
