package SST.Components;

import SST.MapCoordinates3D;

public class Position3D extends IComponent{
    public String componentName = "Position";
    public MapCoordinates3D position = new MapCoordinates3D(0,0,0);

    public Position3D(int setX, int setY, int setZ){
        position.xDes = setX;
        position.yDes = setY;
        position.zDes = setZ;
    }
}
