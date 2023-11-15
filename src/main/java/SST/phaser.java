package SST;

public class Phaser {
    private int energy;
    private String target;

    public Phaser(int initialEnergy) {
        this.energy = initialEnergy;
        this.target = null; // No initial target
    }

    public void setTarget(String target) {
        this.target = target;
        System.out.println("Target set to: " + target);
    }

    public void fire() {
        if (energy > 0 && target != null) {
            int damage = calculateDamage();
            System.out.println("Phaser fired at " + target + "! Damage inflicted: " + damage);
        } else if (target == null) {
            System.out.println("No target set. Unable to fire.");
        } else {
            System.out.println("Phaser out of energy. Unable to fire.");
        }
    }

    private int calculateDamage() {
        // Implement your damage calculation logic here
        // This might depend on various factors such as distance, shield strength, etc.
        // For simplicity, let's assume a basic calculation for demonstration purposes
        return Math.min(energy, 50); // Placeholder value, replace with actual logic
    }

    public void recharge(int amount) {
        energy += amount;
        System.out.println("Phaser recharged. Current energy: " + energy);
    }

    public int getEnergy() {
        return energy;
    }
}
