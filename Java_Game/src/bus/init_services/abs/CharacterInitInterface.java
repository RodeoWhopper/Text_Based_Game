package bus.init_services.abs;

import content.Entity;
import content.inventory.Inventory;
import content.util.CharacterClass;

public interface CharacterInitInterface {
    public Entity init(String NAME, int LEVEL, int experience, String RACE, CharacterClass CLASS, Inventory INVENTORY) throws Exception;
}
