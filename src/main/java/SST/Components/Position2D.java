package SST.Components;

import SST.MapCoordinates2D;
import SST.MapCoordinates3D;

public class Position2D extends IComponent{

    public String componentName = "Position";
    public MapCoordinates2D position = new MapCoordinates2D(0,0);

    public Position2D(int setX, int setY){
        position.xDes = setX;
        position.yDes = setY;
    }
}
