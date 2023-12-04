package SST;

import SST.Components.IComponent;
import SST.Components.Name;

import java.util.HashMap;
import java.util.Map;

public class Entity {

    public Map<String, IComponent> components = new HashMap<>();

    public Entity(String name) {
        addComponent(new Name(name));
    }

    public boolean active = true;

    public void addComponent(IComponent... newComponent) {
        for (int i = 0; i < newComponent.length; i++) {
            components.put(newComponent[i].componentName, newComponent[i]);
            newComponent[i].entity = this;
        }
    }

    public void removeComponent(String componentName) {
        components.remove(componentName);
    }

    public void takeAction() {
        if (!active)
            return;
        System.out.println("Taking action debug statement.");
    }

    // Assume a Position2D component for the entity's position

    // Additional methods for movement
    public MapCoordinates3D getCoordinates() {
        return getComponent(MapCoordinates3D.class);
    }

    public void setCoordinates(MapCoordinates3D coordinates) {
        addComponent(coordinates);
    }

    // Additional methods for movement
    public void moveUp() {
        MapCoordinates3D currentCoordinates = getCoordinates();
        if (currentCoordinates != null) {
            currentCoordinates.setYDes(currentCoordinates.getYDes() - 1);
        }
    }

    public void moveDown() {
        MapCoordinates3D currentCoordinates = getCoordinates();
        if (currentCoordinates != null) {
            currentCoordinates.setYDes(currentCoordinates.getYDes() + 1);
        }
    }

    public void moveLeft() {
        MapCoordinates3D currentCoordinates = getCoordinates();
        if (currentCoordinates != null) {
            currentCoordinates.setQDes(currentCoordinates.getQDes() - 1);
        }
    }

    public void moveRight() {
        MapCoordinates3D currentCoordinates = getCoordinates();
        if (currentCoordinates != null) {
            currentCoordinates.setQDes(currentCoordinates.getQDes() + 1);
        }

    }
    private <T extends IComponent> T getComponent(Class<T> componentType) {
        for (IComponent component : components.values()) {
            if (componentType.isAssignableFrom(component.getClass())) {
                return componentType.cast(component);
            }
        }
        return null;
    }

}
