import SST.Player;
import SST.Systems.Damage;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    //deprecated features. We just need to get the very basics down.
//    @Test
//    public void PlayerDocked() {
//        Player player = new Player("SST.Player", 100);
//        player.docked("dock");
//        assertTrue(player.docked("dock"));
//    }
//
//    @Test
//    public void PlayerInOrbit() {
//        Player player = new Player("SST.Player", 100);
//        player.inOrbit("orbit");
//        assertTrue(player.inOrbit("orbit"));
//    }

    @Test
    public void PlayerHealth() {
        Player player = new Player("SST.Player");
        //there's some funny syntax here, but this gets the health object then gets the current health value
        assertEquals(100, player.getHealth().getHealth());
    }

    @Test
    public void PlayerDamaged() {
        Player player = new Player("SST.Player");
        Damage.damage(player.getHealth(), 10);
        //had to rush player update to work on current schema
//        player.setHealth(100);
//        player.setHealth(player.getHealth() - 10);
        assertEquals(90, player.getHealth().getHealth());
    }
}
