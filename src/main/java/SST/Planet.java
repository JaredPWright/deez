package SST;

public class Planet extends Entity{
//    int x, y;

    public Planet(String name) {
        super(name);
    }

    enum planetClass {M, N, O1, O2, O3};
    boolean crystals;
    boolean known;
}
