package Person;

/**
 * Created by student on 22.03.2018.
 */
public abstract class Human {

    protected int height;
    protected int weight;

    public int getHeight(){return height;}
    public abstract int getWeight();

    public Human(int height, int weight){
        this.height=height;
        this.weight=weight;
    }
}
