package SST.Components;

public class Renderable extends IComponent {

    public String componentName = "Renderable";
    public char icon = '*';

    public Renderable(char setIcon){
        icon = setIcon;
    }
}
