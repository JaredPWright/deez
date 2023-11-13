package SST;

import SST.Components.IComponent;
import SST.Components.Name;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entity {

    public Map<String,IComponent> components = new HashMap<String,IComponent>();

    public Entity(String name){
        addComponent(new Name(name));
    }

    public void addComponent(IComponent ... newComponent) {
        for (int i = 0; i < newComponent.length; i++){
            components.put(newComponent[i].componentName, newComponent[i]);
            newComponent[i].entity = this;
        }

    }

    public void TakeAction(){

        System.out.println("Taking action debug statement.");
    }
}
