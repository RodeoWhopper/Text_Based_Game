package Characters;
import java.util.ArrayList;
public interface Character_Stats {
    //Base informations about character
    String race = null;
    String name = null;
    String surname = null;
    int age = 0;
    String class_character = null;
    //Useable informations about character
    ArrayList<String> known_language = new ArrayList<String>();
    ArrayList<String> abilities = new ArrayList<String>();

    //Attributes of character
    int strength = 0;
    int dexterity = 0;
    int endurance = 0;
    int wisdom = 0;
    int intelligence = 0;
    int luck = 0;
    int charisma = 0;
}
