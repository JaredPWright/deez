package SST.Utilities;

import SST.Components.IComponent;
import SST.Components.Name;
import SST.Components.Position3D;
import SST.Entity;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class GameMasterUtilities {

    public void GenerateEntities(String entityName, int numEntities, int quadrant, Map<String, Entity> storageLoc,
                                 ArrayList<Position3D> slotsTaken, IComponent... newComponents){
        for(int i = 0; i < numEntities; i++){
            Random tempRand = new Random();

            Entity newEntity = new Entity(entityName+i);

            Position3D tempPos3D = new Position3D(quadrant, tempRand.nextInt(10), tempRand.nextInt(10));
            while(slotsTaken.contains(tempPos3D)){
                tempPos3D = new Position3D(quadrant, tempRand.nextInt(10), tempRand.nextInt(10));
            }
            slotsTaken.add(tempPos3D);

            newEntity.addComponent(tempPos3D);
            newEntity.addComponent(newComponents);

            Name tempName = (Name) newEntity.components.get("Name");
            storageLoc.put(tempName.GetName(), newEntity);
        }
    }

//    public boolean spaceOccupied(Position3D objectPosition){
//
//        for(Position3D pos : )
//    }
}
