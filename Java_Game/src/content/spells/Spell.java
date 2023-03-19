package content.spells;

import content.Entity;
import content.util.CharacterClass;

import java.util.List;

public class Spell implements Entity.AbstractEntity {
    private String name;
    private int ID;
    private final int DEFAULT_HIT_POINT;
    private final int MIN_LEVEL;
    private final int MIN_INTELLIGENCE;
    private final int MIN_WISDOM;
    private List<CharacterClass> availableClasses;
    private List<String> availableRaces;
    public Spell(String name,int ID, int DHP,int ML, int MI, int MW, List<CharacterClass> classes, List<String> races){
        this.ID = ID;
        this.name = name;
        this.DEFAULT_HIT_POINT = DHP;
        this.MIN_LEVEL = ML;
        this.MIN_INTELLIGENCE = MI;
        this.MIN_WISDOM = MW;
        this.availableClasses = classes;
        this.availableRaces = races;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getDEFAULT_HIT_POINT() {
        return DEFAULT_HIT_POINT;
    }
    public int getMIN_LEVEL() {
        return MIN_LEVEL;
    }
    public int getMIN_INTELLIGENCE() {
        return MIN_INTELLIGENCE;
    }
    public int getMIN_WISDOM() {
        return MIN_WISDOM;
    }
    public List<CharacterClass> getAvailableClasses() {
        return availableClasses;
    }
    public List<String> getAvailableRaces() {
        return availableRaces;
    }
}
