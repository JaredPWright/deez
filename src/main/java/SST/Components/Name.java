package SST.Components;

import SST.Entity;

public class Name extends IComponent{
    private String name = "Default";
    public String getName(){ return name; }
    public String componentName = "Name";

    public Name(String name){
        super();
        componentName = name;
    }
}
