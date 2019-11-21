import drink.Drink;
import java.util.Random;

public class Bottle {

    static int maxLevel = 10;
    private int capacity;
    Drink content;


    public Bottle(){

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        Random random = new Random();
        this.capacity = random.nextInt(maxLevel);
    }

    public void setContent(Drink content){
        this.content = content;
    }
}
