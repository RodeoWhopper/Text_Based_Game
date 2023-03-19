package content.items.wearable;

import content.Entity;
import content.items.Item;

public class Wearable extends Item implements Entity.ConcreteEntity {
    public Wearable(String name,int level){
        super("Wearable", 1, name, false, 1, level);
    }
}
