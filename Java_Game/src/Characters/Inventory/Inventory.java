package Characters.Inventory;

import Items.Item;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;

public class Inventory {
    ArrayList<Space> inventory;
    public Inventory(int size){
        ArrayList<Space> inventory = new ArrayList<>(30);
    }
    public void inventorySorter(Inventory inv){
        ArrayList<Space> tempListOfUsable = new ArrayList<>();
        ArrayList<Space> tempListOfCraftM = new ArrayList<>();
        ArrayList<Space> tempListOfWeapon = new ArrayList<>();
        ArrayList<Space> tempListOfArmor = new ArrayList<>();
        ArrayList<Space> tempListOfWearable = new ArrayList<>();
        ArrayList<Space> tempListOfTotal = new ArrayList<>(inv.inventory.size());
        int usableCount = 0;
        int craftMaterialCount = 0;
        int weaponCount = 0;
        int armorCount = 0;
        int wearableCount = 0;
        int totalItemCount = usableCount+craftMaterialCount+weaponCount+armorCount+wearableCount;
        for(Space s : inv.inventory){
            switch(s.item.getType()){
                case "Usable":
                    usableCount++;
                    tempListOfUsable.add(s);
                    break;
                case "Craft Material":
                    craftMaterialCount++;
                    tempListOfCraftM.add(s);
                    break;
                case "Weapon":
                    weaponCount++;
                    tempListOfWeapon.add(s);
                    break;
                case "Armor":
                    armorCount++;
                    tempListOfArmor.add(s);
                    break;
                case "Wearable":
                    wearableCount++;
                    tempListOfWearable.add(s);
                    break;
            }
        }
        for(int i = 0; i < tempListOfUsable.size(); i++){
            tempListOfTotal.add(tempListOfUsable.get(i));
        }
        for(int i = 0; i < tempListOfCraftM.size(); i++){
            tempListOfTotal.add(tempListOfCraftM.get(i));
        }
        for(int i = 0; i < tempListOfWeapon.size(); i++){
            tempListOfTotal.add(tempListOfWeapon.get(i));
        }
        for(int i = 0; i < tempListOfArmor.size(); i++){
            tempListOfTotal.add(tempListOfWeapon.get(i));
        }
        for(int i = 0; i < tempListOfWearable.size(); i++){
            tempListOfTotal.add(tempListOfWearable.get(i));
        }
    }
    public void itemAdder(Item item) throws Exception{
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).item == item){
                Space.increaseQuantity(inventory.get(i));
            }
            else if(inventory.get(i).item == null){
                inventory.get(i).item = item;
            }
            else if(i == inventory.size()-1 && inventory.get(i).item != null){
                throw new Exception("Envanter Dolu. "+ item.getItemName() + " eşyası envantere eklenemedi..." );
            }
        }
    }
    public void getInventory(){
        for(int i = 0; i < inventory.size();i++){
            if(inventory.get(i).item == null){
                System.out.println("Boş                |  ");
            }
            else{
                System.out.println(inventory.get(i).item.getItemName().substring(0,15) + "." + "  |  " + inventory.get(i).quantity );
            }
        }
    }
    public void getItemFromPosition(int x, int y){

    }


    private static class Space{
        Item item;
        int quantity;
        Integer itemNumber;
        boolean holdingStatus;
        public Space(){
            this.item = null;
            this.quantity = 0;
            this.itemNumber = null;
            this.holdingStatus = false;
        }
        public Space(Item item){
            this.item = item;
            this.quantity = 0;
            this.itemNumber = item.getItemNumber();
            this.holdingStatus = false;
        }
        public static void increaseQuantity(Space space){
            space.quantity++;
        }
    }
}
