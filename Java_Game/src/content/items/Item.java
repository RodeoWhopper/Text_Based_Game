package entities.Items;

public class Item {
    private final String type;
    /*
    Usable
    Craft Material
    Weapon
    Armor
    Wearable
    */
    private final int typeNumber;
    private final String itemName;
    private final boolean stackingCapability;
    private final Integer maxStack;
    private final Integer level;
    private final Integer itemNumber;
    private int counter = 1;

    public void itemPackage(){
        Usable.usableItemPackage();
        CraftMaterial.craftMaterialItemPackage();
        Weapon.weaponItemPackage();
        Armor.armorItemPackage();
        Wearable.wearableItemPackage();
    }
    public Item(String type,int typeNumber, String itemName, boolean stackingCapability, Integer maxStack, Integer level){
        this.type = type;
        this.typeNumber = typeNumber;
        this.itemName = itemName;
        this.stackingCapability = stackingCapability;
        this.maxStack = maxStack;
        this.level = level;
        this.itemNumber = counter;
        counter++;
    }
    public String getType(){
        return this.type;
    }
    public String getItemName(){
        return this.itemName;
    }
    public boolean isItStackable(){
        return this.stackingCapability;
    }
    public Integer getMaxStack(){
        return this.maxStack;
    }
    public Integer getLevel(){
        return this.level;
    }
    public Integer getItemNumber(){
        return this.itemNumber;
    }
    private static class Usable extends Item{
        public Usable(String name, int maxStack){
            super("Usable",5, name, true, maxStack, null);
        }

        public static void usableItemPackage(){
            //TODO
        }
    }

    private class CraftMaterial extends Item{

        public CraftMaterial(String name, int maxStack){
            super("Craft Material",4, name, true, maxStack, null);
        }

        public static void craftMaterialItemPackage(){
            //TODO
        }
    }

    private static class Weapon extends Item{
        public Weapon(String name,int level){
            super("Weapon",3, name, false,1, level);
        }
        public static void weaponItemPackage(){
            //TODO
        }
    }

    private static class Armor extends Item{
        public Armor(String name, int level){
            super("Armor", 2, name, false, 1, level);
        }
        public static void armorItemPackage(){
            //TODO
        }
    }

    private static class Wearable extends Item{
        public Wearable(String name,int level){
            super("Wearable", 1, name, false, 1, level);
        }
        public static void wearableItemPackage(){
            //TODO
        }
}
}