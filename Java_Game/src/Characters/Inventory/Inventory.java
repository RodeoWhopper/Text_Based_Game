package Characters.Inventory;

import Items.Item;

public class Inventory {
    String character_name;
    public Inventory(String character_name){
        Space[][] inventory = new Space[5][6];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 6; j++){
                inventory[i][j].position = new int[]{(i + 1), (j + 1)};
            }
        }
        this.character_name = character_name;
    }
    public static void itemAdder(Item item, int[][] position){

    }


    private static class Space{
        Integer item_number;
        boolean holding_status;
        static int[] position = new int[2];
        static Item item = new Item();
    }
}
