package SST;

import SST.Components.IComponent;
import SST.Components.Name;
import SST.MapCoordinates3D;

import java.util.HashMap;
import java.util.Map;

public class Entity {

    public Map<String,IComponent> components = new HashMap<String,IComponent>();

    public Entity(String name){
        addComponent(new Name(name));
    }

    public boolean active = true;

    public void addComponent(IComponent ... newComponent) {
        for (int i = 0; i < newComponent.length; i++){
            components.put(newComponent[i].componentName, newComponent[i]);
            newComponent[i].entity = this;
        }
    }

    public void removeComponent(String componentName){
        components.remove(componentName);
    }

    public void TakeAction(){

        if(!active)
            return;
        System.out.println("Taking action debug statement.");
    }
    public MapCoordinates3D getCoordinates(){
        int q = 0, y = 0, z = 0;
        y = MapCoordinates3D.getYDes();
        q = MapCoordinates3D.getQDes();
        z = MapCoordinates3D.getZDes();

        return new MapCoordinates3D(q, y, z);
    }


    // Additional methods for movement
    public static void moveUp() {
        Integer yDes = MapCoordinates3D.getYDes();
        if (yDes != null) {
            MapCoordinates3D.setYDes(yDes - 1);
        }
    }

    public static void moveLeft() {
        Integer qDes = MapCoordinates3D.getQDes();
        if (qDes != null) {
            MapCoordinates3D.setQDes(qDes - 1);
        }
    }

    public static void moveRight() {
        Integer qDes = MapCoordinates3D.getQDes();
        if (qDes != null) {
            MapCoordinates3D.setQDes(qDes + 1);
        }
    }
    public static void moveDown() {
        Integer yDes = MapCoordinates3D.getYDes();
        if (yDes != null) {
            MapCoordinates3D.setYDes(yDes + 1);
        }
    }
}
