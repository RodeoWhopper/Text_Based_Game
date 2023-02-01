package Items;

public class Item {
    private static String type;
    /*
    Usable
    Craft Material
    Weapon
    Armor
    Wearable
    */
    private static String name;
    private static int max_stack;
    private int level;
    public void itemPackage(){
        Usable.usableItemPackage();
        CraftMaterial.craftMaterialItemPackage();
        Weapon.weaponItemPackage();
        Armor.armorItemPackage();
        Wearable.wearableItemPackage();
    }


    private static class Usable extends Item{

        private static final String type = "Usable";
        private final String name;
        private static final boolean stacking_capability = true;
        private final int max_stack;
        private static final Integer level = null;
        private int item_number = 0;

        public Usable(String name, int max_stack){
            super();
            this.name = name;
            this.max_stack = max_stack;
            setItem_number(getItem_number() + 1);
        }

        public static void usableItemPackage(){
            //TODO
            Usable potion = new Usable( "mustafa",64);
        }

        public static String getType() {
            return type;
        }

        public static boolean isStacking_capability() {
            return stacking_capability;
        }

        public static Integer getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public int getMax_stack() {
            return max_stack;
        }

        public int getItem_number() {
            return item_number;
        }

        public void setItem_number(int item_number) {
            this.item_number = item_number;
        }
    }

    private static class CraftMaterial extends Item{
        private static final String type = "Craft Material";
        private final String name;
        private static final boolean stacking_capability = true;
        private final int max_stack;
        private static final Integer level = null;
        private int item_number = 0;

        public CraftMaterial(String name, int max_stack){
            super();
            this.name = name;
            this.max_stack = max_stack;
            setItem_number(getItem_number() + 1);
        }

        public static void craftMaterialItemPackage(){
            //TODO
        }

        public static String getType() {
            return type;
        }

        public static boolean isStacking_capability() {
            return stacking_capability;
        }

        public static Integer getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public int getMax_stack() {
            return max_stack;
        }

        public int getItem_number() {
            return item_number;
        }

        public void setItem_number(int item_number) {
            this.item_number = item_number;
        }
    }

    private static class Weapon extends Item{
        private static final String type = "Weapon";
        private final String name;
        private static final boolean stacking_capability = false;
        private static final int max_stack = 1;
        private int level;
        private int item_number = 0;

        public Weapon(String name,int level){
            super();
            this.name = name;
            this.setLevel(level);
            setItem_number(getItem_number() + 1);
        }

        public static void weaponItemPackage(){
            //TODO
        }

        public static String getType() {
            return type;
        }

        public static boolean isStacking_capability() {
            return stacking_capability;
        }

        public static int getMax_stack() {
            return max_stack;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getItem_number() {
            return item_number;
        }

        public void setItem_number(int item_number) {
            this.item_number = item_number;
        }
    }

    private static class Armor extends Item{
        private static final String type = "Armor";
        private final String name;
        private static final boolean stacking_capability = false;
        private static final int max_stack = 1;
        private int level;
        private int item_number = 0;

        public Armor(String name, int level){
            super();
            this.name = name;
            this.setLevel(level);
            setItem_number(getItem_number() + 1);
        }

        public static void armorItemPackage(){
            //TODO
        }

        public static String getType() {
            return type;
        }

        public static boolean isStacking_capability() {
            return stacking_capability;
        }

        public static int getMax_stack() {
            return max_stack;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getItem_number() {
            return item_number;
        }

        public void setItem_number(int item_number) {
            this.item_number = item_number;
        }
    }

    private static class Wearable extends Item{
        private static final String type = "Wearable";
        private final String name;
        private static final boolean stacking_capability = false;
        private static final int max_stack = 1;
        private final int level;
        private int item_number = 0;

        public Wearable(String name,int level){
            super();
            this.name = name;
            this.level = level;
            setItem_number(getItem_number() + 1);
        }

        public static void wearableItemPackage(){
            //TODO
        }

        public static String getType() {
            return type;
        }

        public static boolean isStacking_capability() {
            return stacking_capability;
        }

        public static int getMax_stack() {
            return max_stack;
        }

        public String getName() {
            return name;
        }

        public int getLevel() {
            return level;
        }

        public int getItem_number() {
            return item_number;
        }

        public void setItem_number(int item_number) {
            this.item_number = item_number;
        }
    }
}

