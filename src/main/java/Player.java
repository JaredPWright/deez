public class Player {
    // Attributes
    private String name;
    private int health;
    private Quadrant quadrant;
    private Sector sector;

    // Constructor
    public Player(String name, int health, Quadrant quadrant, Sector sector) {
        this.name = name;
        this.health = health;
        this.quadrant = quadrant;
        this.sector = sector;
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
        displayLocation();
    }

    // Getter and Setter for Quadrant
    public Quadrant getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(Quadrant quadrant) {
        this.quadrant = quadrant;
    }

    // Getter and Setter for Sector
    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    // Method to display player location
    public void displayLocation() {
        System.out.println("Quadrant: " + quadrant.GetGridDesignation());
        System.out.println("Sector: " + sector.GetSectorDesignation());
    }
}

