public class Player {
    // Attributes
    private String name;
    private int health;

    // Constructor
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to display player information
    public void displayInfo() {
        System.out.println("Player: " + name);
        System.out.println("Health: " + health);
    }

    // Method to simulate the player taking damage
    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health < 0) {
            health = 0; // Ensure health doesn't go below zero
        }
        System.out.println(name + " took " + damageAmount + " damage.");
    }

    // Method to simulate the player healing
    public void heal(int healAmount) {
        health += healAmount;
        System.out.println(name + " healed for " + healAmount + " points.");
    }

    public static void main(String[] args) {
        // Example usage of the Player class
        Player player1 = new Player("John", 100);
        player1.displayInfo();

        player1.takeDamage(20);
        player1.displayInfo();

        player1.heal(10);
        player1.displayInfo();
    }
}

