package SST;
public class Moving {
    // Initialize player here for now.
    private Player player = new Player("Player", 100);
    private Quadrant quadrant = new Quadrant();
    private Sector sector = new Sector();
    private int x, y;

    // Method to move player
    public void movePlayer(int x, int y) {
        // Check if player is in orbit
        if (player.Orbit()) {
            // Check if player is docked
            if (player.Docked()) {
                // Check if player is cloaked
                if (player.Cloaked()) {
                    // Player is cloaked, cannot move
                    System.out.println("You cannot move while cloaked.");
                } else {
                    // Player is not cloaked, can move
                    System.out.println("You are no longer docked.");
                    player.Docked(false);
                    player.Orbit(false);
                    player.Cloaked(false);
                    player.setQuadrant(quadrant);
                    player.setSector(sector);
                    System.out.println("You are now in sector " + player.getSector().getX() + ", " + player.getSector().getY() + ".");
                }
            } else {
                // Player is not docked, cannot move
                System.out.println("You cannot move while in orbit.");
            }
        } else {
            // Player is not in orbit, can move
            player.setQuadrant(quadrant);
            player.setSector(sector);
            System.out.println("You are now in sector " + player.getSector().getX() + ", " + player.getSector().getY() + ".");
        }
    }
}
    
    