package SST.Utilities;

import SST.Components.Enemy;
import SST.Components.IComponent;
import SST.Components.Movable;
import SST.Components.Position3D;

import java.util.ArrayList;

public class EntityStorage {
    private ArrayList<Position3D> positionCabinet = new ArrayList<>();
    public ArrayList<Position3D> getPositionCabinet() { return positionCabinet; }
    private ArrayList<Enemy> enemyCabinet = new ArrayList<>();
    public ArrayList<Enemy> getEnemyCabinet() { return enemyCabinet; }
    private ArrayList<Movable> movableCabinet = new ArrayList<>();
    public ArrayList<Movable> getMovableCabinet() { return movableCabinet; }
    private ArrayList<IComponent> genPopComponentCabinet = new ArrayList<>();
    public ArrayList<IComponent> getGenPopComponentCabinet() { return genPopComponentCabinet; }

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
