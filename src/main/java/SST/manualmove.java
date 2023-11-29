import java.util.Scanner;

public class ManualMove {
    public void move(Entity entity) {
        // Implement logic for manual movement
        // For simplicity, let's take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter direction (UP, DOWN, LEFT, RIGHT): ");
        String direction = scanner.nextLine().toUpperCase();

        // Update the entity's position based on user input
        switch (direction) {
            case "UP":
                entity.moveUp();
                break;
            case "DOWN":
                entity.moveDown();
                break;
            case "LEFT":
                entity.moveLeft();
                break;
            case "RIGHT":
                entity.moveRight();
                break;
            default:
                System.out.println("Invalid direction. No movement.");
        }
    }
}
