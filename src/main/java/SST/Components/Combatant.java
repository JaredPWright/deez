package SST.Components;

import SST.Entity;

public class Combatant extends IComponent{
    public String componentName = "Combatant";
    public double damage = 1.0;

    public AggressionLevel aggressionLevel = AggressionLevel.Low;

    public Combatant(AggressionLevel aggroLvl, double newDamage) {
        super();
        aggressionLevel = aggroLvl;
        damage = damage*newDamage;
    }

    public Combatant(AggressionLevel aggroLvl) {
        super();
        aggressionLevel = aggroLvl;
    }

    public Combatant() {
        super();
    }
}
