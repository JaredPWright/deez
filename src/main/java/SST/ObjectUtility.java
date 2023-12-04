package SST;

public interface ObjectUtility {
    public boolean isInRange(int range, MapCoordinates3D object1, MapCoordinates3D object2);

    public MapCoordinates3D compareMapDesignations(char operation, MapCoordinates3D leftTerm, MapCoordinates3D rightTerm);
}
