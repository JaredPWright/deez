import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPlayerCreation() {
        Player player = new Player("Alice", 100);
        assertNotNull(player);
        assertEquals("Alice", player.getName());
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player("Bob", 100);
        player.takeDamage(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testTakeDamageBelowZero() {
        Player player = new Player("Charlie", 10);
        player.takeDamage(30);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testHeal() {
        Player player = new Player("David", 50);
        player.heal(15);
        assertEquals(65, player.getHealth());
    }

    @Test
    public void testHealAboveMaxHealth() {
        Player player = new Player("Eve", 90);
        player.heal(20);
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testPlayerInfoDisplay() {
        Player player = new Player("Frank", 75);
        assertEquals("Player: Frank\nHealth: 75", getFormattedPlayerInfo(player));
    }

    // Helper method to get formatted player information for comparison
    private String getFormattedPlayerInfo(Player player) {
        return "Player: " + player.getName() + "\nHealth: " + player.getHealth();
    }
}
