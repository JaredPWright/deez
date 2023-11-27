package SST.Systems;

import SST.Entity;
import SST.Components.Health;
import SST.GameMaster;
import SST.Components.Name;
import SST.Utilities.GameMasterUtilities;

public class ClearBoard {

    public static void clearTheBoard(Entity... entities){
        for(Entity entity : entities){
            if(entity.components.containsKey("Health")){
                Health tempHealth = (Health) entity.components.get("Health");
                if(tempHealth.getHealth() <= 0){
                    entity.active = false;
                }
            }

            if(entity.active = false){
                entity.removeComponent("Renderable");
            }

            if(entity.components.containsKey("Enemy")){
                Name entityName = (Name) entity.components.get("Name");
                GameMaster.getInstance().getKlingons().remove(entityName.getName());
            }
        }
    }
}
