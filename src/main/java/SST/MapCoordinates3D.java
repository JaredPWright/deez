package SST;
public class MapCoordinates3D {
    public static int qDes = 0;
    public static int yDes = 0;
    public static int zDes = 0;

    public MapCoordinates3D(int q, int y, int z) {
        qDes = q;
        yDes = y;
        zDes = z;
    }

    public static int getYDes() {
        return yDes;
    }

    public static int getQDes() {
        return qDes;
    }
    public static int getZDes() {
        return qDes;
    }

    public static int setZDes() {
        return zDes;
    }

    public static void setYDes(int yes) {
        yDes = yes;
    }

    public static void setQDes(int qes){
        qDes = qes;
    }

    public static void setZDes(int zes){
        zDes = zes;
    }
}
