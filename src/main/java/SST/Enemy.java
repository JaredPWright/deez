package SST;

import java.util.ArrayList;
import java.util.List;

public class Enemy {

    List<IComponent> components = new ArrayList<IComponent>();

    public void addComponent(IComponent newComponent){
        components.add(newComponent);
    }

    public void TakeAction(){

        System.out.println("Taking action debug statement.");
    }
    
}
