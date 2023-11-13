package SST.Components;

import SST.Entity;

public class Health extends IComponent{
    public String componentName = "Health";

    private int maxHealth;
    private int health = 1;

    public Health(int setMaxHealth) {
        super();
        maxHealth = setMaxHealth;
        health = maxHealth;
    }

    public Health(int setMaxHealth, int healthModifer){
        super();
        maxHealth = setMaxHealth * healthModifer;
        health = maxHealth;
    }

    public int GetHealth(){
        return health;
    }
    public void SetHealth(int adjustedHealth){
        health = adjustedHealth;
    }
}
