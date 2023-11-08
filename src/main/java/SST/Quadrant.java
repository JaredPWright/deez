package SST;

import SST.Components.Position2D;

public class Quadrant extends Entity{

    private final Sector[][] sectorGrid = new Sector[10][10];

    public Quadrant(String name, int quadrantIndex) {
        super(name);
        addComponent(new Position2D(0,quadrantIndex));
        for (int x = 0; x < 10; x++)
            for(int y = 0; y < 10; y++)
                this.sectorGrid[x][y] = new Sector(("SST.Sector " + x + y), quadrantIndex, x, y);
    }

    public Sector[][] GetSectorGrid(){
        return sectorGrid;
    }
}
