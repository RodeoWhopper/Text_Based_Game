package Characters;
import java.util.ArrayList;


public class Main_Character {
    //Base information
    String name;
    int age;

    //Attributes information
    int strength;
    int dexterity;
    int endurance;
    int wisdom;
    int intelligence;
    int luck;
    int charisma;
    int insight;

    //Class informations
    private String class_character;
    String useable_hand;
    String useable_weapons;
    /*
            Which races are available?
    -ORC
    -HIGH ELVEN
    -DARK ELVEN
    -MOUNTAIN DWARF
    -CAVE DWARF
    -HUMAN
    -MENTAT
            Which classes are available?
        -- Great Sword, Short Sword, Dagger, Magic --
    -BERSERKER
    -WARRIOR
    -WARLOCK
        -- Short Sword, Dagger, Long Bow, Short Bow, Magic --
    -THIEF
    -ARCHER
    -DRUID
        -- Low Stuff, High Stuff, Book --
    -MAGE
    -WHITE MAGE
    -BLACK MAGE
    -SEEKER
            Which classes available for which race?
        -- ORC --
    -BERSERKER
    -WARRIOR
        -- HIGH ELVEN --
    -WARRIOR
    -WARLOCK
    -ARCHER
    -DRUID
    -MAGE
    -WHITE MAGE
        -- DARK ELVEN --
    -WARRIOR
    -WARLOCK
    -THIEF
    -ARCHER
    -DRUID
    -MAGE
    -BLACK MAGE
        -- MOUNTAIN DWARF --
    -BERSERKER
    -WARRIOR
    -MAGE
        -- CAVE DWARF --
    -WARRIOR
    -WARLOCK
    -THIEF
    -BLACK MAGE
        -- HUMAN --
    -BERSERKER
    -WARRIOR
    -WARLOCK
    -THIEF
    -ARCHER
    -DRUID
    -MAGE
    -WHITE MAGE
    -BLACK MAGE
        -- MENTAT --
    -SEEKER
    */

    //Useable informations
    ArrayList<String> Known_Books = new ArrayList<String>();
    ArrayList<String> Abilities = new ArrayList<String>();

    //Dynamic informations
    int level;
    int character_experience;

    //Character initializer informations
    private String race;
    int base_strength;
    int base_dexterity;
    int base_endurance;
    int base_wisdom;
    int base_intelligence;
    int base_luck;
    int base_charisma;
    int base_insight;




    public String getRace() {
        return race;
    }

    public void setRace(String race) {
    }


    public String getClass_character() {
        return class_character;
    }

    public void setClass_character(String class_character) {
        this.class_character = class_character;
    }
}
