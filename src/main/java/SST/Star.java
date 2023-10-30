package SST;

import java.util.List;

public class Star extends ObjectCore {
    public char icon = 'S';
    private MapDesignation starDesignation;
    private Quadrant parentQuadrant;
    private List<Star> adjacentStars;
    private boolean novaed = false;

    public Star(int x, int y, Quadrant parent){
        icon = 'S';
        starDesignation = new MapDesignation(x,y);
        parentQuadrant = parent;
    }

    public void Nova(/*Player player*/){
        //if(isInRange(1, starDesignation, player) && !novaed)
        //  damagePlayer();
        gatherLocalStars(/*player*/);
    }

    private void gatherLocalStars(/*Player player*/){
        for(int i = 0; i < parentQuadrant.GetStarList().size(); i++){
            //if(isInRange(1, starDesignation, parentQuadrant.GetStarList().get(i).starDesignation))
            //  parentQuadrant.GetStarList().get(i).Nova(player);
        }
    }
}
