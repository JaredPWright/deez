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

    public Sector(String name, int x, int y){
        this.sectorDesignation = name;
        SetMapDesignation(x, y);
    }
}
