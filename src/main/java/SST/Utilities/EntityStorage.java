package SST.Utilities;

import SST.Components.Enemy;
import SST.Components.IComponent;
import SST.Components.Movable;
import SST.Components.Position3D;

import java.util.ArrayList;

public class EntityStorage {
    ArrayList<Position3D> positionCabinet = new ArrayList<>();
    ArrayList<Enemy> enemyCabinet = new ArrayList<>();
    ArrayList<Movable> movableCabinet = new ArrayList<>();
    ArrayList<IComponent> genPopComponentCabinet = new ArrayList<>();

    public void AddToGenPop(IComponent... add){
        for (IComponent icomp : add){
            genPopComponentCabinet.add(icomp);
        }
    }

    public void AddToPositionRegistry(Position3D... pos3d){
        for (Position3D pos : pos3d)
            positionCabinet.add(pos);
        AddToGenPop(pos3d);
    }

    public void AddToEnemyRegistry(Enemy... enemies){
        for(Enemy enemy : enemies)
            enemyCabinet.add(enemy);
        AddToGenPop(enemies);
    }

    public void AddToMovableRegistry(Movable... movables){
        for(Movable movable : movables)
            movableCabinet.add(movable);
        AddToGenPop(movables);
    }
}
