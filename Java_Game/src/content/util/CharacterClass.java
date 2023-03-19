package content.util;

import content.Content;
import content.items.armor.Armor;
import content.items.weapon.Weapon;
import content.spells.Spell;

import java.util.List;
//TODO CLASS OLUŞTURUCU VE LİSTELEYİCİ OLUŞTURULACAK.
public class CharacterClass implements Content {
    private String name;
    private List<Weapon> availableWeapons;
    private List<Armor> availableArmors;
    private List<String> availableRaces;
    private List<Spell> availableSpells;
    public CharacterClass(String name, List<Weapon> weapons, List<Armor> armors, List<String> races, List<Spell> spells){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weapon> getAvailableWeapons() {
        return availableWeapons;
    }

    public void setAvailableWeapons(List<Weapon> availableWeapons) {
        this.availableWeapons = availableWeapons;
    }

    public List<Armor> getAvailableArmors() {
        return availableArmors;
    }

    public void setAvailableArmors(List<Armor> availableArmors) {
        this.availableArmors = availableArmors;
    }

    public List<String> getAvailableRaces() {
        return availableRaces;
    }

    public void setAvailableRaces(List<String> availableRaces) {
        this.availableRaces = availableRaces;
    }

    public List<Spell> getAvailableSpells() {
        return availableSpells;
    }

    public void setAvailableSpells(List<Spell> availableSpells) {
        this.availableSpells = availableSpells;
    }
}
