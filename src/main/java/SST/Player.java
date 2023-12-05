package SST;

import SST.Quadrant;
import SST.Sector;

public class Player {
    // Attributes
    private int energy;
    private String name;
    private int health;
    private Quadrant quadrant;
    private Sector sector;

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
        System.out.println("SST.Player: " + name);
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
        //System.out.println("Quadrant: " + quadrant.GetGridDesignation());
        System.out.println("Sector: " + sector.GetSectorDesignation());
    }

    // Method to indicate player is in orbit
    public boolean inOrbit(String command) {
        if(command.equals("orbit")) {
            return true;
        }
        return false;
    }

    // Method to indicate player is docked
    public boolean docked(String command) {
        if(command.equals("dock")) {
            return true;
        }
        return false;
    }
    public static void moveUp() {
        Integer yDes = MapCoordinates3D.getYDes();
        if (yDes != null) {
            MapCoordinates3D.setYDes(yDes - 1);
        }
    }

    public static void moveLeft() {
        Integer qDes = MapCoordinates3D.getQDes();
        if (qDes != null) {
            MapCoordinates3D.setQDes(qDes - 1);
        }
    }

    public static void moveRight() {
        Integer qDes = MapCoordinates3D.getQDes();
        if (qDes != null) {
            MapCoordinates3D.setQDes(qDes + 1);
        }
    }
    public static void moveDown() {
        Integer yDes = MapCoordinates3D.getYDes();
        if (yDes != null) {
            MapCoordinates3D.setYDes(yDes + 1);
        }
    }
    public void takeDamage(int damage) {
        energy -= damage;
        if (energy <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " takes damage. Remaining energy: " + energy);
        }
    }
}

