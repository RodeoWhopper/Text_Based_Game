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
    String class_character;
    String useable_hand;
    String useable_weapons;

    //Useable informations
    ArrayList<String> Known_Books = new ArrayList<String>();
    ArrayList<String> Abilities = new ArrayList<String>();

    //Dynamic informations
    int level;

    private String race;
    int base_strength;
    int base_dexterity;
    int base_endurance;
    int base_wisdom;
    int base_intelligence;
    int base_luck;
    int base_charisma;
    int base_insight;


    public Main_Character(String name,int age, String race){
        this.race = race;
        if (this.race == "ORC") {
            this.base_strength = 7;
            this.base_dexterity = 3;
            this.base_endurance = 6;
            this.base_wisdom = 1;
            this.base_intelligence = 1;
            this.base_charisma = 1;
            this.base_insight = 0;
        }
        if (this.race == "ELVEN") {
            this.base_strength = 2;
            this.base_dexterity = 7;
            this.base_endurance = 2;
            this.base_wisdom = 2;
            this.base_intelligence = 3;
            this.base_charisma = 4;
            this.base_insight = 0;
        }
        if (this.race == "DWARF") {
            this.base_strength = 5;
            this.base_dexterity = 2;
            this.base_endurance = 7;
            this.base_wisdom = 0;
            this.base_intelligence = 1;
            this.base_charisma = 1;
            this.base_insight = 0;
        }
        if (this.race == "HUMAN") {
            this.base_strength = 4;
            this.base_dexterity = 4;
            this.base_endurance = 3;
            this.base_wisdom = 3;
            this.base_intelligence = 3;
            this.base_charisma = 3;
            this.base_insight = 0;
        }
        if (this.race == "MENTAT") {
            this.base_strength = -3;
            this.base_dexterity = -2;
            this.base_endurance = 1;
            this.base_wisdom = 6;
            this.base_intelligence = 7;
            this.base_charisma = 0;
            this.base_insight = 10;
        }
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


}
