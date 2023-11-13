package SST.Components;

import SST.Entity;

public class Renderable extends IComponent {

    public String componentName = "Renderable";
    public char icon = '*';

    public Renderable(char setIcon){
        super();
        icon = setIcon;
    }
}
