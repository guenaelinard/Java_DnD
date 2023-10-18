public class Truck {


    public static void main(String[] args) {
        int oldBuilding = 34;
        int capacityCartons;
        int newBuilding = 0;
        while(oldBuilding >= 9){
            capacityCartons = 9;
            oldBuilding = oldBuilding - capacityCartons;
            System.out.println("cartons restants à bouger : " + oldBuilding);
            newBuilding = newBuilding + capacityCartons;
            System.out.println("cartons déplacés : " + newBuilding);
        }
        System.out.println("Dernier voyage de " + oldBuilding + " cartons.");
        newBuilding = newBuilding + oldBuilding;
        oldBuilding = oldBuilding - oldBuilding;
        System.out.println("Les " + newBuilding + " cartons ont été déplacés !");
    }
}
