package content.characters.nonplayerch;

import content.Entity;
import content.equipments.Equipments;
import content.inventory.Inventory;
import content.util.CharacterClass;
import content.util.Status;

public class Character implements Entity, Entity.ConcreteEntity {
    //Primary
    private String race;
    private CharacterClass characterClass;
    private Status status;
    private String name;
    private int level;
    private int exp;
    private Inventory inventory;
    private Equipments equipments;
    //Secondary
    private int money;
    //Base stats
    private int base_strength;
    private int base_dexterity;
    private int base_endurance;
    private int base_wisdom;
    private int base_intelligence;
    private int base_charisma;                      //Those are the old codes.
    private int base_luck;                          //There was a lot of work so I skip fixing these.
    private int base_insight;
    //In-game stats
    private int stat_strength;
    private int stat_dexterity;
    private int stat_endurance;
    private int stat_wisdom;
    private int stat_intelligence;
    private int stat_charisma;
    private int stat_luck;
    private int stat_insight;
    public Character(String NAME, int LEVEL, int EXP, String RACE, CharacterClass CLASS, Inventory INVENTORY){
        this.name = NAME;
        this.level = LEVEL;
        this.exp = EXP;
        this.race = RACE;
        this.characterClass = CLASS;
        this.inventory = INVENTORY;
        setBase_strength(0);
        setBase_dexterity(0);
        setBase_endurance(0);
        setBase_wisdom(0);
        setBase_intelligence(0);
        setBase_charisma(0);
        setBase_luck(0);
        setBase_insight(0);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getBase_strength() {
        return base_strength;
    }

    public void setBase_strength(int base_strength) {
        this.base_strength = base_strength;
    }

    public int getBase_dexterity() {
        return base_dexterity;
    }

    public void setBase_dexterity(int base_dexterity) {
        this.base_dexterity = base_dexterity;
    }

    public int getBase_endurance() {
        return base_endurance;
    }

    public void setBase_endurance(int base_endurance) {
        this.base_endurance = base_endurance;
    }

    public int getBase_wisdom() {
        return base_wisdom;
    }

    public void setBase_wisdom(int base_wisdom) {
        this.base_wisdom = base_wisdom;
    }

    public int getBase_intelligence() {
        return base_intelligence;
    }

    public void setBase_intelligence(int base_intelligence) {
        this.base_intelligence = base_intelligence;
    }

    public int getBase_charisma() {
        return base_charisma;
    }

    public void setBase_charisma(int base_charisma) {
        this.base_charisma = base_charisma;
    }

    public int getBase_luck() {
        return base_luck;
    }

    public void setBase_luck(int base_luck) {
        this.base_luck = base_luck;
    }

    public int getBase_insight() {
        return base_insight;
    }

    public void setBase_insight(int base_insight) {
        this.base_insight = base_insight;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass character_class) {
        this.characterClass = character_class;
    }

    public int getStat_strength() {
        return stat_strength;
    }

    public void setStat_strength(int stat_strength) {
        this.stat_strength = stat_strength;
    }

    public int getStat_dexterity() {
        return stat_dexterity;
    }

    public void setStat_dexterity(int stat_dexterity) {
        this.stat_dexterity = stat_dexterity;
    }

    public int getStat_endurance() {
        return stat_endurance;
    }

    public void setStat_endurance(int stat_endurance) {
        this.stat_endurance = stat_endurance;
    }

    public int getStat_wisdom() {
        return stat_wisdom;
    }

    public void setStat_wisdom(int stat_wisdom) {
        this.stat_wisdom = stat_wisdom;
    }

    public int getStat_intelligence() {
        return stat_intelligence;
    }

    public void setStat_intelligence(int stat_intelligence) {
        this.stat_intelligence = stat_intelligence;
    }

    public int getStat_charisma() {
        return stat_charisma;
    }

    public void setStat_charisma(int stat_charisma) {
        this.stat_charisma = stat_charisma;
    }

    public int getStat_luck() {
        return stat_luck;
    }

    public void setStat_luck(int stat_luck) {
        this.stat_luck = stat_luck;
    }

    public int getStat_insight() {
        return stat_insight;
    }

    public void setStat_insight(int stat_insight) {
        this.stat_insight = stat_insight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String character_name) {
        this.name = character_name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int character_level) {
        this.level = character_level;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int character_experience) {
        this.exp = character_experience;
    }
}
