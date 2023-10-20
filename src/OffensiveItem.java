public class OffensiveItem {

    String weaponName;
    String weaponType;
    int weaponAttackLevel;

    //----------------------------------- CONSTRUCTORS ------------------------

    public OffensiveItem(String name/*, String type, int attackLevel*/) {
        weaponName = name;
//        weaponType = type;
//        weaponAttackLevel = attackLevel;
    }

    //------------------------------------ GET/SET ----------------------------
    public String getWeaponName() {
        return weaponName;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return this.weaponName;
    }

}
