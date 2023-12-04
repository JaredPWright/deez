package SST.Systems;

import SST.Components.Enemy;
import SST.Components.Health;
import SST.Components.Position3D;
import SST.Entity;
import SST.GameMaster;

import java.util.Random;

public class DeathRay {

    public static void fireDeathRay(){
        Random d100 = new Random();

        if(d100.nextInt(1,100) <= 70){
            for(Enemy badGuy : GameMaster.getInstance().entityStorage.getEnemyCabinet()){

                Entity tempBadGuy = badGuy.entity;
                Position3D tempBadGuyPos = (Position3D) tempBadGuy.components.get("Position3D");

                if(tempBadGuyPos.position.qDes == GameMaster.getInstance().player.getQuadrant()){
                    Health tempHealth = (Health) tempBadGuy.components.get("Health");
                    Damage.damage(tempHealth, 10000000);
                }
            }
        }
    }
}
