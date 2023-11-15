package SST;

import SST.Components.Name;
import SST.Components.Position2D;

import java.util.Dictionary;

public class StarMap {

    private final Quadrant[] quadrantGrid = new Quadrant[8];
    public Quadrant[] GetQuadrantGrid(){
        return quadrantGrid;
    }

    public Dictionary<String,Quadrant> quadrantDictionary;

    public StarMap(String name){
        for (int q = 0; q < 10; q++){
            //generate a new quadrant
            Quadrant tempQuadrant = new Quadrant("quadrant_" + q, q);
            //add it to the array of quadrants
            this.quadrantGrid[q] = tempQuadrant;
            //cast it to the proper subclass
            Name temp = (Name)tempQuadrant.components.get("Name");
            //add it to our dictionary, just as a second way to access it. Don't know if we'll use it
            quadrantDictionary.put(temp.getName(), tempQuadrant);
        }
    }
}
