package SST;

public class Planet {
    int x, y;
    enum planetClass {M, N, O1, O2, O3};
    boolean crystals;
    boolean known;

    // Constructor
    public Planet(int x, int y, planetClass planetClass, boolean crystals, boolean known) {
        this.x = x;
        this.y = y;
        this.crystals = crystals;
        this.known = known;
    }

    // Getter and Setter for X
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and Setter for Y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getter and Setter for Crystals
    public boolean hasCrystals() {
        //TODO: how do we generate crystals?
        return crystals;
    }
}
