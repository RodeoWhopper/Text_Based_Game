package content.items.usable;

import content.Entity;
import content.items.Item;

public class Usable extends Item implements Entity.ConcreteEntity {
    public Usable(String name, int maxStack){
        super("Usable",5, name, true, maxStack, null);
    }
}
