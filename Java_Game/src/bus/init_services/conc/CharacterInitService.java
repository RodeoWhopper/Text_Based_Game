package bus.init_services.conc;

import bus.init_services.abs.CharacterInitInterface;
import content.Entity;
import content.characters.nonplayerch.Character;
import content.inventory.Inventory;

public class CharacterInit implements CharacterInitInterface {

    @Override
    public Entity init(String NAME, int LEVEL, int EXP, String RACE, String CLASS, Inventory INVENTORY) {
        Character c = new Character(NAME,LEVEL,EXP,RACE,CLASS,INVENTORY);
        try{
            if(RACE == "ORC") {
                c.setBase_strength(10);
                c.setBase_dexterity(3);
                c.setBase_endurance(8);
                c.setBase_wisdom(1);
                c.setBase_intelligence(1);
                c.setBase_charisma(1);
                c.setBase_luck(1);
                c.setBase_insight(-5);
                if(CLASS == "BERSERKER") {
                    c.setStat_strength(c.getBase_strength()*2);
                    c.setStat_dexterity(c.getStat_dexterity()+3);
                    c.setStat_endurance((int)(c.getBase_endurance()*1.8));
                    c.setStat_wisdom(c.getBase_wisdom()+3);
                    c.setStat_intelligence(c.getBase_intelligence()+3);
                    c.setStat_charisma(c.getBase_charisma()+2);
                }else if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*1.5));
                    c.setStat_dexterity((c.getBase_dexterity()*6));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+3);
                    c.setStat_intelligence(c.getBase_intelligence()+3);
                    c.setStat_charisma(c.getBase_charisma()+2);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "HIGH ELVEN") {
                c.setBase_strength(4);
                c.setBase_dexterity(5);
                c.setBase_endurance(2);
                c.setBase_wisdom(4);
                c.setBase_intelligence(4);
                c.setBase_charisma(4);
                c.setBase_luck(1);
                c.setBase_insight(-3);
                if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*1.8));
                    c.setStat_dexterity((int)(c.getBase_dexterity()*1.6));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+2);
                    c.setStat_intelligence(c.getBase_intelligence()+2);
                    c.setStat_charisma(c.getBase_charisma()+5);
                }else if(CLASS == "WARLOCK") {
                    c.setStat_strength((int)(c.getBase_strength()*1.8));
                    c.setStat_dexterity((c.getBase_dexterity()+3));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+4);
                    c.setStat_intelligence((int)(c.getBase_intelligence()*1.5));
                    c.setStat_charisma(c.getBase_charisma()+4);
                }else if(CLASS == "ARCHER") {
                    c.setStat_strength(c.getBase_strength()+2);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.25));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+2);
                    c.setStat_intelligence(c.getBase_intelligence()+2);
                    c.setStat_charisma(c.getBase_charisma()+5);
                }else if(CLASS == "DRUID") {
                    c.setStat_strength(c.getBase_strength()+2);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*1.8));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+3);
                    c.setStat_intelligence((int)(c.getBase_intelligence()*1.8));
                    c.setStat_charisma(c.getBase_charisma()+4);
                }else if(CLASS == "MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom((int)(c.getBase_wisdom()*2.3));
                    c.setStat_intelligence((c.getBase_intelligence()*2));
                    c.setStat_charisma(c.getBase_charisma()+6);
                }else if(CLASS == "WHITE MAGE") {
                    c.setStat_strength((c.getBase_strength()+1));
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom((int)(c.getBase_wisdom()*2.5));
                    c.setStat_intelligence(c.getBase_intelligence()*5);
                    c.setStat_charisma(c.getBase_charisma()+2);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "DARK ELVEN") {
                c.setBase_strength(4);
                c.setBase_dexterity(7);
                c.setBase_endurance(1);
                c.setBase_wisdom(3);
                c.setBase_intelligence(4);
                c.setBase_charisma(1);
                c.setBase_luck(1);
                c.setBase_insight(-2);
                if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*1.8));
                    c.setStat_dexterity((int)(c.getBase_dexterity()*1.8));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+2);
                    c.setStat_intelligence(c.getBase_intelligence()+2);
                    c.setStat_charisma(c.getBase_charisma()+3);
                }else if(CLASS == "WARLOCK") {
                    c.setStat_strength((int) (c.getBase_strength() * 1.8));
                    c.setStat_dexterity((c.getBase_dexterity() + 3));
                    c.setStat_endurance(c.getBase_endurance() + 3);
                    c.setStat_wisdom(c.getBase_wisdom() + 4);
                    c.setStat_intelligence((int) (c.getBase_intelligence() * 1.8));
                    c.setStat_charisma(c.getBase_charisma() + 2);
                }else if(CLASS == "THIEF") {
                    c.setStat_strength(c.getBase_strength()+3);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.25));
                    c.setStat_endurance(c.getBase_endurance()+2);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+5);
                }else if(CLASS == "ARCHER") {
                    c.setStat_strength(c.getBase_strength()+2);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.4));
                    c.setStat_endurance(c.getBase_endurance()+2);
                    c.setStat_wisdom(c.getBase_wisdom()+2);
                    c.setStat_intelligence(c.getBase_intelligence()+2);
                    c.setStat_charisma(c.getBase_charisma()+5);
                }else if(CLASS == "DRUID") {
                    c.setStat_strength(c.getBase_strength()+2);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+3);
                    c.setStat_intelligence(c.getBase_intelligence()*2);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "MAGE") {
                    c.setStat_strength(c.getBase_strength() + 1);
                    c.setStat_dexterity(c.getBase_dexterity() + 1);
                    c.setStat_endurance(c.getBase_endurance() + 1);
                    c.setStat_wisdom((int) (c.getBase_wisdom() * 2.3));
                    c.setStat_intelligence((c.getBase_intelligence() * 2));
                    c.setStat_charisma(c.getBase_charisma() + 1);
                }else if(CLASS == "BLACK MAGE") {
                    c.setStat_strength((c.getBase_strength()+1));
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom((int)(c.getBase_wisdom()*2.7));
                    c.setStat_intelligence(c.getBase_intelligence()*2);
                    c.setStat_charisma(c.getBase_charisma()+2);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "MOUNTAIN DRAWF") {
                c.setBase_strength(7);
                c.setBase_dexterity(-1);
                c.setBase_endurance(10);
                c.setBase_wisdom(5);
                c.setBase_intelligence(5);
                c.setBase_charisma(0);
                c.setBase_luck(1);
                c.setBase_insight(-5);
                if(CLASS == "BERSERKER") {
                    c.setStat_strength((int)(c.getBase_strength()*1.5));
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()*2);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*1.5));
                    c.setStat_dexterity(c.getBase_dexterity()+4);
                    c.setStat_endurance(c.getBase_endurance()*2);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()*2);
                    c.setStat_intelligence(c.getBase_intelligence()+5);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "CAVE DRAWF") {
                c.setBase_strength(5);
                c.setBase_dexterity(2);
                c.setBase_endurance(10);
                c.setBase_wisdom(3);
                c.setBase_intelligence(5);
                c.setBase_charisma(-2);
                c.setBase_luck(1);
                c.setBase_insight(-4);
                if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*1.8));
                    c.setStat_dexterity(c.getBase_dexterity()+3);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "WARLOCK") {
                    c.setStat_strength((int)(c.getBase_strength()*1.5));
                    c.setStat_dexterity(c.getBase_dexterity()+2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+4);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "THIEF") {
                    c.setStat_strength(c.getBase_strength()+3);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "THIEF") {
                    c.setStat_strength(c.getBase_strength()+3);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "BLACK MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+6);
                    c.setStat_intelligence((int)(c.getBase_intelligence()*2.3));
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "HUMAN") {
                c.setBase_strength(4);
                c.setBase_dexterity(4);
                c.setBase_endurance(4);
                c.setBase_wisdom(4);
                c.setBase_intelligence(4);
                c.setBase_charisma(4);
                c.setBase_luck(1);
                c.setBase_insight(-4);
                if(CLASS == "BERSERKER") {
                    c.setStat_strength((int)(c.getBase_strength()*2.5));
                    c.setStat_dexterity(c.getBase_dexterity()+3);
                    c.setStat_endurance((int)(c.getBase_endurance()*2.5));
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "WARRIOR") {
                    c.setStat_strength((int)(c.getBase_strength()*2.5));
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.5));
                    c.setStat_endurance(c.getBase_endurance()+3);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "WARLOCK") {
                    c.setStat_strength(c.getBase_strength()*2);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()*2);
                    c.setStat_intelligence(c.getBase_intelligence()*2);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "THIEF") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.5));
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma((int)(c.getBase_charisma()*2.5));
                }else if(CLASS == "ARCHER") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity((int)(c.getBase_dexterity()*2.5));
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma((int)(c.getBase_charisma()*2.5));
                }else if(CLASS == "DRUID") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()*2);
                    c.setStat_intelligence(c.getBase_intelligence()*2);
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()*2);
                    c.setStat_intelligence(c.getBase_intelligence()*2);
                    c.setStat_charisma(c.getBase_charisma()*2);
                }else if(CLASS == "WHITE MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom((int)(c.getBase_wisdom()*2.5));
                    c.setStat_intelligence((int)(c.getBase_intelligence()*2.5));
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else if(CLASS == "BLACK MAGE") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()*2);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom((int)(c.getBase_wisdom()*2.5));
                    c.setStat_intelligence((int)(c.getBase_intelligence()*2.5));
                    c.setStat_charisma(c.getBase_charisma()+1);
                }else{
                    throw new Exception();
                }
            }else if(RACE == "MENTAT") {
                c.setBase_strength(4);
                c.setBase_dexterity(4);
                c.setBase_endurance(4);
                c.setBase_wisdom(4);
                c.setBase_intelligence(4);
                c.setBase_charisma(4);
                c.setBase_luck(1);
                c.setBase_insight(-4);
                if(CLASS == "SEEKER") {
                    c.setStat_strength(c.getBase_strength()+1);
                    c.setStat_dexterity(c.getBase_dexterity()+1);
                    c.setStat_endurance(c.getBase_endurance()+1);
                    c.setStat_wisdom(c.getBase_wisdom()+1);
                    c.setStat_intelligence(c.getBase_intelligence()+1);
                    c.setStat_charisma(c.getBase_charisma()+1);
                    c.setStat_insight(c.getBase_insight()*3);
                }else{
                    throw new Exception();
                }
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("There is an exception");
        }
        return c;
    }
}
