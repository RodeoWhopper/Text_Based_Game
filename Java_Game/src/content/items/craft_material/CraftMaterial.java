package content.items.craft_material;

import content.Entity;
import content.items.Item;

public class CraftMaterial extends Item implements Entity,Entity.ConcreteEntity {
    public CraftMaterial(String name, int maxStack){
        super("Craft Material",4, name, true, maxStack, null);
    }
}
