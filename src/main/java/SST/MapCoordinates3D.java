package SST;

public class MapCoordinates3D {
    public int qDes = 0;
    public int yDes = 0;
    public int zDes = 0;

    public MapCoordinates3D(int q, int y, int z) {
        qDes = q;
        yDes = y;
        zDes = z;
    }

    public int getYDes() {
        return yDes;
    }

    public int getQDes() {
        return qDes;
    }

    public int setZDes() {
        return zDes;
    }

    public void setYDes(int yes) {
        yDes = yes;
    }

    public void setQDes(int qes){
        qDes = qes;
    }

    public void setZDes(int zes){
        zDes = zes;
    }
}
