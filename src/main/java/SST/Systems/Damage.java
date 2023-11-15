package SST.Systems;

import SST.Components.Health;

public class Damage {

    public void damage(Health h, int damage){
        h.setHealth(damage);
    }
}
