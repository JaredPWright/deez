import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayer() {
        Player player = new Player("Test Player", 100, Quadrant.ALPHA, Sector.A1);
        assertEquals("Test Player", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(Quadrant.ALPHA, player.getQuadrant());
        assertEquals(Sector.A1, player.getSector());
    }
}
