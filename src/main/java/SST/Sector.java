package SST;

public class Sector {
    private String sectorDesignation = "def";
    public String GetSectorDesignation(){
        return sectorDesignation;
    }

    private MapDesignation mapDesignation;
    public void SetMapDesignation(int x, int y){
        mapDesignation = new MapDesignation(x, y);
    }
    public MapDesignation GetMapDesignation(){
        return mapDesignation;
    }

    public Star star = null;

    //public StarBase starBase = null;
    public Quadrant parentQuadrant;

    public char icon = '*';

    public boolean navigable = true;

    public Sector(String name, int x, int y){
        this.sectorDesignation = name;
        SetMapDesignation(x, y);
    }

    public Sector(String name, int x, int y, boolean isStar, boolean isStarBase, Quadrant parent){
        this.sectorDesignation = name;
        SetMapDesignation(x, y);
        parentQuadrant = parent;

        if(isStar){
            star = new Star(mapDesignation.xDes, mapDesignation.yDes, parent);
            //starBase = null
            icon = star.icon;
            navigable = false;
        } else if (isStarBase && !isStar) {
            star = null;
            navigable = false;
            //starBase = new StarBase();
            //icon = starBase.icon;
        }
    }
}
