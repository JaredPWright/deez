package SST;

public interface Scan<T> {
    public T GetScanArea(MapCoordinates3D mDes, String parentName);
    public void GenerateScanCanvas(MapCoordinates3D mapDes, String parentName);
}
