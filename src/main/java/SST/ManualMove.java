package SST;
import java.util.Scanner;
import SST.Entity;

public class ManualMove {
    public static void move(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter direction (UP, DOWN, LEFT, RIGHT): ");
        String direction = scanner.nextLine().toUpperCase();

        // Update the entity's position based on user input
        switch (direction) {
            case "UP":
                player.moveUp();
                break;
            case "DOWN":
                player.moveDown();
                break;
            case "LEFT":
                player.moveLeft();
                break;
            case "RIGHT":
                player.moveRight();
                break;
            default:
                System.out.println("Invalid direction. No movement.");
        }
    }
}
