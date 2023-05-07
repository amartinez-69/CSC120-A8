import java.util.ArrayList;

public class Bird implements Contract{
    
    private int size;
    private String name;
    private int health;
    private ArrayList<String> canEat;
    private boolean isFlying;
    private boolean isWalking;
    private boolean isHolding;
    
    public Bird() {
        this.name = "Birb";
        this.size = 0;
        this.isFlying = false;
        this.isWalking = false;
        this.isHolding = false;
        this.health = 10;
        this.canEat = new ArrayList<String>();
            this.canEat.add("Fruit");
            this.canEat.add("Worms");
            this.canEat.add("French Fries");
            this.canEat.add("Bird seed");
    }

    public void grab(String item){
        System.out.println("Birb has grabbed the item!");
    }

    public void drop(String item){
        System.out.println("Birb has dropped the item!");
    }

    public void examine(String item){
        System.out.println("Birb is examining the item!");
    }

    public void use(String item){
        System.out.println("Birb is using the item");
    }
    public boolean walk(String direction){
        System.out.println("");
    }
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();
}
