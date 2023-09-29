public class StarMap {
    private String stringDesignation = "def";
    public String GetStringDesignation(){
        return  stringDesignation;
    }

    private final Quadrant[][] quadrantGrid = new Quadrant[8][8];
    public Quadrant[][] GetQuadrantGrid(){
        return quadrantGrid;
    }

    public StarMap(String name){
        for (int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                this.quadrantGrid[x][y] = new Quadrant(("Quadrant " + x + y), x, y);
            }
        }

        this.stringDesignation = name;
    }
}
