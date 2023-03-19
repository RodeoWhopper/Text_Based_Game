package content.items;

import content.Entity;

public class Item implements Entity {
    //TODO ITEM LISTELEYEN CLASS YAZILACAK BİR YERE
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
}