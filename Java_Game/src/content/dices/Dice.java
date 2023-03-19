package content.dices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Dice {
    private int side;
    private Set<Integer> numbers;
    public Dice(int side){
        this.side = side;
        this.numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i = 1; i <= side; i++){
            this.numbers.add(i);
        }
    }
    public int getSide(){
        return this.side;
    }
    public void setSide(int side){
        this.side = side;
    }
    public Set<Integer> getNumbers(){
        return this.numbers;
    }
}
