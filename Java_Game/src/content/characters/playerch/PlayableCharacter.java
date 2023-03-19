package content.characters.playerch;
import content.Entity;
import content.characters.nonplayerch.Character;
import content.inventory.Inventory;


public class PlayableCharacter extends Character implements Entity {
    public PlayableCharacter(String NAME, int LEVEL, int EXP, String RACE, String CLASS, Inventory INVENTORY){
        super(NAME,LEVEL,EXP,RACE,CLASS,INVENTORY);
    }
}
