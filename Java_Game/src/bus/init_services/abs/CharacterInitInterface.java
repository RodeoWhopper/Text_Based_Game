package bus.entitiy_services.abs;

import content.Entity;
import content.inventory.Inventory;

public interface CharacterInitInterface {
    public Entity init(String NAME,int LEVEL,int experience,String RACE, String CLASS,Inventory INVENTORY) throws Exception;
}
