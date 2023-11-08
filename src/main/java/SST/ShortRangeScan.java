package SST;

public class ShortRangeScan implements Scan{

    @Override
    public Quadrant GetScanArea(MapCoordinates3D mDes, String parentName) {
        //make sure player always knows the name of the quadrant it's in
        return GameMaster.starMap.quadrantDictionary.get(parentName);
    }

    @Override
    public void GenerateScanCanvas(MapCoordinates3D mapDes, String parentName) {
        Quadrant tempQuad = GetScanArea(mapDes, parentName);

        ScanCanvas srScanCanvas = new ScanCanvas("Short Range Scanner");

        for(int x = 0; x < 10; x++)
            for(int y = 0; y < 10; y++){
                //srScanCanvas.getGraphics().drawString(Character.toString(tempQuad.GetSectorGrid()[x][y].icon), x*10, y*10);
            }
    }
}
