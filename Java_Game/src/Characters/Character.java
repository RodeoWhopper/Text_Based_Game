package Characters;

public class Character {
    //Primary
    private String race;
    private String character_class;
    private String character_name;
    private int character_level;
    private int character_experience;
    //Base stats
    private int base_strength;
    private int base_dexterity;
    private int base_endurance;
    private int base_wisdom;
    private int base_intelligence;
    private int base_charisma;
    private int base_luck;
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
    public Character(){
        setRace(null);
        setCharacter_class(null);
        setCharacter_name(null);
        setCharacter_level(1);
        setCharacter_experience(0);
        setBase_strength(0);
        setBase_dexterity(0);
        setBase_endurance(0);
        setBase_wisdom(0);
        setBase_intelligence(0);
        setBase_charisma(0);
        setBase_luck(0);
        setBase_insight(0);
    }
    protected void character_creator(String race) {
        if(race == "ORC") {
            Character ORC = new Character();
            ORC.setRace("ORC");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            ORC.setBase_strength(10);
            ORC.setBase_dexterity(3);
            ORC.setBase_endurance(8);
            ORC.setBase_wisdom(1);
            ORC.setBase_intelligence(1);
            ORC.setBase_charisma(1);
            ORC.setBase_luck(1);
            ORC.setBase_insight(-5);
        }
        else if(race == "HIGH ELVEN") {
            Character HIGH_ELVEN = new Character();
            HIGH_ELVEN.setRace("HIGH ELVEN");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            HIGH_ELVEN.setBase_strength(4);
            HIGH_ELVEN.setBase_dexterity(5);
            HIGH_ELVEN.setBase_endurance(2);
            HIGH_ELVEN.setBase_wisdom(4);
            HIGH_ELVEN.setBase_intelligence(4);
            HIGH_ELVEN.setBase_charisma(4);
            HIGH_ELVEN.setBase_luck(1);
            HIGH_ELVEN.setBase_insight(-3);
        }
        else if(race == "DARK ELVEN") {
            Character DARK_ELVEN = new Character();
            DARK_ELVEN.setRace("DARK ELVEN");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            DARK_ELVEN.setBase_strength(4);
            DARK_ELVEN.setBase_dexterity(7);
            DARK_ELVEN.setBase_endurance(1);
            DARK_ELVEN.setBase_wisdom(3);
            DARK_ELVEN.setBase_intelligence(4);
            DARK_ELVEN.setBase_charisma(1);
            DARK_ELVEN.setBase_luck(1);
            DARK_ELVEN.setBase_insight(-2);
        }
        else if(race == "MOUNTAIN DRAWF") {
            Character MOUNTAIN_DWARF = new Character();
            MOUNTAIN_DWARF.setRace("MOUNTAIN DWARF");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            MOUNTAIN_DWARF.setBase_strength(7);
            MOUNTAIN_DWARF.setBase_dexterity(-1);
            MOUNTAIN_DWARF.setBase_endurance(10);
            MOUNTAIN_DWARF.setBase_wisdom(5);
            MOUNTAIN_DWARF.setBase_intelligence(5);
            MOUNTAIN_DWARF.setBase_charisma(0);
            MOUNTAIN_DWARF.setBase_luck(1);
            MOUNTAIN_DWARF.setBase_insight(-5);
        }
        else if(race == "CAVE DRAWF") {
            Character CAVE_DWARF = new Character();
            CAVE_DWARF.setRace("CAVE DWARF");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            CAVE_DWARF.setBase_strength(5);
            CAVE_DWARF.setBase_dexterity(2);
            CAVE_DWARF.setBase_endurance(10);
            CAVE_DWARF.setBase_wisdom(3);
            CAVE_DWARF.setBase_intelligence(5);
            CAVE_DWARF.setBase_charisma(-2);
            CAVE_DWARF.setBase_luck(1);
            CAVE_DWARF.setBase_insight(-4);
        }
        else if(race == "HUMAN") {
            Character HUMAN = new Character();
            HUMAN.setRace("HUMAN");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            HUMAN.setBase_strength(4);
            HUMAN.setBase_dexterity(4);
            HUMAN.setBase_endurance(4);
            HUMAN.setBase_wisdom(4);
            HUMAN.setBase_intelligence(4);
            HUMAN.setBase_charisma(4);
            HUMAN.setBase_luck(1);
            HUMAN.setBase_insight(-4);
        }
        else if(race == "MENTAT") {
            Character MENTAT = new Character();
            MENTAT.setRace("MENTAT");
            setCharacter_class(null);
            setCharacter_name(null);
            setCharacter_level(1);
            setCharacter_experience(0);
            MENTAT.setBase_strength(4);
            MENTAT.setBase_dexterity(4);
            MENTAT.setBase_endurance(4);
            MENTAT.setBase_wisdom(4);
            MENTAT.setBase_intelligence(4);
            MENTAT.setBase_charisma(4);
            MENTAT.setBase_luck(1);
            MENTAT.setBase_insight(-4);
        }
    }
    protected void classification(String character_class, Character CHARACTER) {
        if(CHARACTER.getRace() == "ORC" && character_class == "BERSERKER") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()*2);
            CHARACTER.setStat_dexterity(CHARACTER.getStat_dexterity()+3);
            CHARACTER.setStat_endurance((int)(CHARACTER.getBase_endurance()*1.8));
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+3);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+3);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+2);
        }
        else if(CHARACTER.getRace() == "ORC" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.5));
            CHARACTER.setStat_dexterity((CHARACTER.getBase_dexterity()*6));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+3);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+3);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+2);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.8));
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*1.6));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+5);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "WARLOCK") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.8));
            CHARACTER.setStat_dexterity((CHARACTER.getBase_dexterity()+3));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+4);
            CHARACTER.setStat_intelligence((int)(CHARACTER.getBase_intelligence()*1.5));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+4);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "ARCHER") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+2);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.25));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+5);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "DRUID") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+2);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*1.8));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+3);
            CHARACTER.setStat_intelligence((int)(CHARACTER.getBase_intelligence()*1.8));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+4);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom((int)(CHARACTER.getBase_wisdom()*2.3));
            CHARACTER.setStat_intelligence((CHARACTER.getBase_intelligence()*2));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+6);
        }
        else if(CHARACTER.getRace() == "HIGH ELVEN" && character_class == "WHITE MAGE") {
            CHARACTER.setStat_strength((CHARACTER.getBase_strength()+1));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom((int)(CHARACTER.getBase_wisdom()*2.5));
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*5);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+2);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.8));
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*1.8));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+3);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "WARLOCK") {
            CHARACTER.setStat_strength((int) (CHARACTER.getBase_strength() * 1.8));
            CHARACTER.setStat_dexterity((CHARACTER.getBase_dexterity() + 3));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance() + 3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom() + 4);
            CHARACTER.setStat_intelligence((int) (CHARACTER.getBase_intelligence() * 1.8));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma() + 2);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "THIEF") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+3);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.25));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+2);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+5);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "ARCHER") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+2);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.4));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+2);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+5);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "DRUID") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+2);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+3);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength() + 1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity() + 1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance() + 1);
            CHARACTER.setStat_wisdom((int) (CHARACTER.getBase_wisdom() * 2.3));
            CHARACTER.setStat_intelligence((CHARACTER.getBase_intelligence() * 2));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma() + 1);
        }
        else if(CHARACTER.getRace() == "DARK ELVEN" && character_class == "BLACK MAGE") {
            CHARACTER.setStat_strength((CHARACTER.getBase_strength()+1));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom((int)(CHARACTER.getBase_wisdom()*2.7));
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+2);
        }
        else if(CHARACTER.getRace() == "MOUNTAIN DWARF" && character_class == "BERSERKER") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.5));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()*2);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "MOUNTAIN DWARF" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.5));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+4);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()*2);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "MOUNTAIN DWARF" && character_class == "MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()*2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+5);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "CAVE DWARF" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.8));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+3);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "CAVE DWARF" && character_class == "WARLOCK") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*1.5));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+4);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "CAVE DWARF" && character_class == "THIEF") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+3);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "CAVE DWARF" && character_class == "THIEF") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+3);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "CAVE DWARF" && character_class == "BLACK MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+6);
            CHARACTER.setStat_intelligence((int)(CHARACTER.getBase_intelligence()*2.3));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "BERSERKER") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*2.5));
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+3);
            CHARACTER.setStat_endurance((int)(CHARACTER.getBase_endurance()*2.5));
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "WARRIOR") {
            CHARACTER.setStat_strength((int)(CHARACTER.getBase_strength()*2.5));
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.5));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+3);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "WARLOCK") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()*2);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()*2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "THIEF") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.5));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma((int)(CHARACTER.getBase_charisma()*2.5));
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "ARCHER") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity((int)(CHARACTER.getBase_dexterity()*2.5));
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma((int)(CHARACTER.getBase_charisma()*2.5));
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "DRUID") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()*2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()*2);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()*2);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()*2);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "WHITE MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom((int)(CHARACTER.getBase_wisdom()*2.5));
            CHARACTER.setStat_intelligence((int)(CHARACTER.getBase_intelligence()*2.5));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "HUMAN" && character_class == "BLACK MAGE") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()*2);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom((int)(CHARACTER.getBase_wisdom()*2.5));
            CHARACTER.setStat_intelligence((int)(CHARACTER.getBase_intelligence()*2.5));
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
        }
        else if(CHARACTER.getRace() == "MENTAT" && character_class == "SEEKER") {
            CHARACTER.setStat_strength(CHARACTER.getBase_strength()+1);
            CHARACTER.setStat_dexterity(CHARACTER.getBase_dexterity()+1);
            CHARACTER.setStat_endurance(CHARACTER.getBase_endurance()+1);
            CHARACTER.setStat_wisdom(CHARACTER.getBase_wisdom()+1);
            CHARACTER.setStat_intelligence(CHARACTER.getBase_intelligence()+1);
            CHARACTER.setStat_charisma(CHARACTER.getBase_charisma()+1);
            CHARACTER.setStat_insight(CHARACTER.getBase_insight()*3);
        }
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

    public String getCharacter_class() {
        return character_class;
    }

    public void setCharacter_class(String character_class) {
        this.character_class = character_class;
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

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public int getCharacter_level() {
        return character_level;
    }

    public void setCharacter_level(int character_level) {
        this.character_level = character_level;
    }

    public int getCharacter_experience() {
        return character_experience;
    }

    public void setCharacter_experience(int character_experience) {
        this.character_experience = character_experience;
    }
}
