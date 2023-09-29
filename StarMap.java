public class StarMap {
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

    private final Quadrant[][] quadrantGrid = new Quadrant[8][8];
    public Quadrant[][] GetQuadrantGrid(){
        return quadrantGrid;
    }

    public StarMap(String name, int desX, int desY){
        for (int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                this.quadrantGrid[x][y] = new Quadrant(("Quadrant " + x + y), x, y);
            }
        }

        this.stringDesignation = name;

        SetGridDesignation(desX, desY);
    }
}
