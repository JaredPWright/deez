package SST;

import SST.Components.Position3D;
import SST.Components.Renderable;

public class Sector extends Entity{

    public Sector(String name, int q, int x, int y){
        super(name);
        addComponent(new Position3D(q,x,y), new Renderable( '*'));
    }

    public Position3D GetSectorDesignation (){
        Position3D temp = (Position3D) components.get("MapCoordinates3D");
        return temp;
    }
}