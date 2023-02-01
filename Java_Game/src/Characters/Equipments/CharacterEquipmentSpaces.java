package Characters.Equipments;

public class CharacterEquipmentSpaces {
    public CharacterEquipmentSpaces(){
        Space first_hand = new Space("First Hand", true);
        Space second_hand = new Space("Second Hand", true);
        Space helmet = new Space("Helmet", true);
        Space chestplate = new Space("Chestplate", true);
        Space pant = new Space("Pant", true);
        Space boot = new Space("Boot", true);
        Space power_item_1 = new Space("Power Item 1", true);
        Space power_item_2 = new Space("Power Item 2", true);
    }
    public static void itemEquipper(String item, Space name) {
        name.setItem(item);
        name.setAvailability(false);
    }
    public static void itemUnequipper(Space name){
        name.setItem(null);
        name.setAvailability(true);
    }
}


class Space {
    private String item;
    private String type;
    private boolean availability;
    public Space(String type, boolean availability){
        this.type = type;
        this.availability = availability;
        this.item = null;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
