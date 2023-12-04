public class AutoMove {
    public void move(Entity entity) {
        // Implement logic for automatic movement
        // This could include random movements, AI-driven decisions, etc.
        // For simplicity, let's assume random movement within the current quadrant

        MapCoordinates3D currentCoordinates = entity.getCoordinates();
        int newX = currentCoordinates.getQDes() + getRandomMovement();
        int newY = currentCoordinates.getYDes() + getRandomMovement();
        int newZ = currentCoordinates.getZDes() + getRandomMovement();

        // Ensure new coordinates are within bounds
        newX = Math.max(0, Math.min(9, newX));
        newY = Math.max(0, Math.min(9, newY));
        newZ = Math.max(0, Math.min(9, newZ));

        // Update the entity's coordinates
        entity.setCoordinates(new MapCoordinates3D(newX, newY, newZ));
    }

    private int getRandomMovement() {
        // Implement logic to get a random movement value
        // For simplicity, let's assume a random value between -1 and 1
        return (int) (Math.random() * 3) - 1;
    }
}
