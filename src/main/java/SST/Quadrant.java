package SST;

import java.util.*;

public class Quadrant{
    private String stringDesignation = "def";
    public String GetStringDesignation(){
        return  stringDesignation;
    }

    private MapDesignation gridDesignation;
    public void SetGridDesignation(int x, int y){
        gridDesignation = new MapDesignation(x, y);
    }
    public MapDesignation GetGridDesignation(){
        return gridDesignation;
    }

    private final Sector[][] sectorGrid = new Sector[10][10];
    public Sector[][] GetSectorGrid(){
        return sectorGrid;
    }

    private ArrayList<Star> starList = new ArrayList<>() {
    };
    public ArrayList<Star> GetStarList(){ return starList; }

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
