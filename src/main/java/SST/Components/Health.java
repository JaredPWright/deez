package SST.Components;

public class Health extends IComponent{
    public String componentName = "Health";

    private int health = 1;
    public int GetHealth(){
        return health;
    }
    public void SetHealth(int adjustedHealth){
        health = adjustedHealth;
    }
}
