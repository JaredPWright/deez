package SST;
import SST.MapCoordinates3D;
import SST.Entity;

public class move {
    public void move(Entity entity) {

        MapCoordinates3D currentCoordinates = entity.getCoordinates();
        int newX = currentCoordinates.getQDes() + getRandomMovement();
        int newY = currentCoordinates.getYDes() + getRandomMovement();
        int newZ = currentCoordinates.getZDes() + getRandomMovement();

        newX = Math.max(0, Math.min(9, newX));
        newY = Math.max(0, Math.min(9, newY));
        newZ = Math.max(0, Math.min(9, newZ));

        MapCoordinates3D.setQDes(newX);
        MapCoordinates3D.setYDes(newY);
        MapCoordinates3D.setZDes(newZ);
    }

    private int getRandomMovement() {
        // Implement logic to get a random movement value
        // For simplicity, let's assume a random value between -1 and 1
        return (int) (Math.random() * 3) - 1;
    }
}
