package content.items.armor;

import content.Entity;
import content.items.Item;

public class Armor extends Item implements Entity.ConcreteEntity {
    public Armor(String name, int level){
        super("Armor", 2, name, false, 1, level);
    }

}
