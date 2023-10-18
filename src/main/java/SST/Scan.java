package SST;

public interface Scan<T> {
    public T GetScanArea(MapDesignation mDes, String parentName);
    public void GenerateScanCanvas(MapDesignation mapDes, String parentName);
}
