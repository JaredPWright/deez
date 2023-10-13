import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void PlayerDocked() {
        Player player = new Player("Player", 100);
        player.docked("dock");
        assertTrue(player.docked("dock"));
    }

    @Test
    public void PlayerInOrbit() {
        Player player = new Player("Player", 100);
        player.inOrbit("orbit");
        assertTrue(player.inOrbit("orbit"));
    }

    @Test
    public void PlayerHealth() {
        Player player = new Player("Player", 100);
        player.setHealth(100);
        assertEquals(100, player.getHealth());
    }
}
