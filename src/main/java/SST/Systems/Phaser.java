package SST.Systems;

import SST.Components.Health;
import SST.Components.Position3D;
import SST.Entity;
import SST.GameMaster;

public class Phaser {

    public static void firePhaser(Entity target, int attackerDamage){
        Position3D targetPos = (Position3D) target.components.get("Position3D");

        if((targetPos.position.yDes == GameMaster.getInstance().player.getCoordinates().position.yDes
                ||
           targetPos.position.zDes == GameMaster.getInstance().player.getCoordinates().position.zDes)
                &&
           targetPos.position.qDes == GameMaster.getInstance().player.getQuadrant())
        {
            Health tempHealth = (Health) target.components.get("Health");
            Damage.damage(tempHealth, (int)GameMaster.getInstance().getDiffMod().getDamageMultiplier());
        }
    }
}