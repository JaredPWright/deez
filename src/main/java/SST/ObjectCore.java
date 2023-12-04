package SST;
public class ObjectCore implements ObjectUtility {
    @Override
    public boolean isInRange(int range, MapCoordinates3D object1, MapCoordinates3D object2) {

        MapCoordinates3D temp = compareMapDesignations('-', object1, object2);

        if(Math.abs(temp.qDes) <= range && Math.abs(temp.yDes) <= range)
            return true;

        return false;
    }

    @Override
    public MapCoordinates3D compareMapDesignations(char operation, MapCoordinates3D leftTerm, MapCoordinates3D rightTerm) {

        MapCoordinates3D temp = new MapCoordinates3D(0,0);
        switch (operation){
            case '-':{
                temp.qDes = leftTerm.qDes - rightTerm.qDes;
                temp.yDes = leftTerm.yDes - leftTerm.yDes;
            }
            default:{
                temp.qDes = leftTerm.qDes + rightTerm.qDes;
                temp.yDes = leftTerm.yDes + leftTerm.yDes;
            }
        }

        return temp;
    }
}
