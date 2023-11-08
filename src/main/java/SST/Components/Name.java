package SST.Components;

public class Name extends IComponent{
    private String name = "Default";
    public String GetName(){ return name; }
    public String componentName = "Name";

    public Name(String name){
        componentName = name;
    }
}
