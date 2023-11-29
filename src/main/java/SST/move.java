public class AutoMove {
    public void move(Entity entity) {
        // Implement logic for automatic movement
        // This could include random movements, AI-driven decisions, etc.
        // For simplicity, let's assume random movement within the current quadrant
        Quadrant currentQuadrant = entity.getQuadrant();
        int newX = entity.getPosition().getX() + getRandomMovement();
        int newY = entity.getPosition().getY() + getRandomMovement();

        // Ensure new coordinates are within the quadrant bounds
        newX = Math.max(0, Math.min(9, newX));
        newY = Math.max(0, Math.min(9, newY));

        // Update the entity's position
        entity.setPosition(new Position2D(newX, newY));
    }

    private int getRandomMovement() {
        // Implement logic to get a random movement value
        // For simplicity, let's assume a random value between -1 and 1
        return (int) (Math.random() * 3) - 1;
    }
}
