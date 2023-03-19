package content.items.weapon;

import content.Entity;
import content.items.Item;

public class Weapon extends Item implements Entity.ConcreteEntity {
    public Weapon(String name,int level){
        super("Weapon",3, name, false,1, level);
    }
}
