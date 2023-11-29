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
    public Position2D getPosition() {
        return (Position2D) components.get("Position2D");
    }

    public void setPosition(Position2D position) {
        components.put("Position2D", position);
    }

    // Additional methods for movement
    public void moveUp() {
        Position2D currentPosition = getPosition();
        if (currentPosition != null) {
            currentPosition.setY(currentPosition.getY() - 1);
        }
    }

    public void moveDown() {
        Position2D currentPosition = getPosition();
        if (currentPosition != null) {
            currentPosition.setY(currentPosition.getY() + 1);
        }
    }

    public void moveLeft() {
        Position2D currentPosition = getPosition();
        if (currentPosition != null) {
            currentPosition.setX(currentPosition.getX() - 1);
        }
    }

    public void moveRight() {
        Position2D currentPosition = getPosition();
        if (currentPosition != null) {
            currentPosition.setX(currentPosition.getX() + 1);
        }
    }
}
