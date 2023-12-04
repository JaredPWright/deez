package SST;

import SST.Components.Position2D;
import java.util.ArrayList;

public class Quadrant extends Entity{

    private final Entity[][] sectorGrid = new Entity[10][10];
    public Quadrant(String name, int quadrantIndex) {
        super(name);
        addComponent(new Position2D(0,quadrantIndex));
        for (int x = 0; x < 10; x++)
            for(int y = 0; y < 10; y++){
                this.sectorGrid[x][y] = new Entity(("SST.Sector " + x + y));
            }
    }

    public Entity[][] GetSectorGrid(){
        return sectorGrid;
    }

    private ArrayList<Star> starList = new ArrayList<Star>() {
    };
    public ArrayList<Star> GetStarList(){ return starList; };

    public Quadrant(String name, int desX, int desY){
          for (int x = 0; x < 10; x++){
              for(int y = 0; y < 10; y++){
                  SplittableRandom tempRand = new SplittableRandom();

                  if(tempRand.nextInt(1, 101) <= 5)
                      this.sectorGrid[x][y] = new Sector(("SST.Sector " + x + y), x, y, true, false, this);
                  else
                    this.sectorGrid[x][y] = new Sector(("SST.Sector " + x + y), x, y);
              }
          }

          this.stringDesignation = name;

          SetGridDesignation(desX, desY);
    }

}
