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

    public char icon = '*';

    public Sector(String name, int x, int y){
        this.sectorDesignation = name;
        SetMapDesignation(x, y);
    }

    public Sector(String name, int x, int y, boolean isStar, boolean isStarBase){
        this.sectorDesignation = name;
        SetMapDesignation(x, y);

        if(isStar){
            star = new Star();
            //starBase = null
            icon = star.icon;
        } else if (isStarBase && !isStar) {
            star = null;
            //starBase = new StarBase();
            //icon = starBase.icon;
        }
    }
}
