package SST.Components;

import SST.Entity;
import SST.MapCoordinates3D;

public class Position3D extends IComponent{
    public String componentName = "Position";
    public MapCoordinates3D position = new MapCoordinates3D(0,0,0);

    public Position3D(int setQ, int setY, int setZ){
        super();
        position.qDes = setQ;
        position.yDes = setY;
        position.zDes = setZ;
    }
}
