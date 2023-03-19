package content.characters.mainch;
import content.Entity;
import content.characters.npc.Character;
import content.inventory.Inventory;


public class MainCharacter extends Character implements Entity {
    public MainCharacter(String NAME, int LEVEL, int EXP, String RACE, String CLASS, Inventory INVENTORY){
        super(NAME,LEVEL,EXP,RACE,CLASS,INVENTORY);
    }
}
