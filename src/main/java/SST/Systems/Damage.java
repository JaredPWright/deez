package SST.Systems;

import SST.Components.Health;

public class Damage {

    public static void damage(Health h, int damage){
        h.setHealth(damage);
    }
}
