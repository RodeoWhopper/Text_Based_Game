package Characters.MainCharacter;
import Characters.Character;
import Characters.Equipments.OneHanded;


public class Main_Character extends Character implements OneHanded {
    private String race;
    private String class_character;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public String getClass_character() {
        return class_character;
    }

    public void setClass_character(String class_character) {
        this.class_character = class_character;
    }
}
