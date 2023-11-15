package SST.Systems;

import SST.Components.Position3D;
import SST.Entity;
import SST.GameMaster;

import javax.swing.text.Position;

public class Explosion {

    public void explode(int range, Entity explodingEntity){
        for(Position3D stellarObjects : GameMaster.getInstance().entityStorage.getPositionCabinet()){
            Position3D objPos = (Position3D) explodingEntity.components.get("Position3D");

            for(int x = 0; x < 3; x++)
                for(int y = 0; y < 3; y++){
                    if(objPos == stellarObjects){
                        //call damage
                    }
                }
        }
    }
}
