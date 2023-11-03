package SST;

public class phaser {

    boolean hit()
    {
        int playerx = Player.getSector();
        int playery = Player.getQuadrant();

        int enemyx = enemy.getSector();
        int ememyy = enemy.getQuadrant();

        if(playerx == enemyx)
        {
            hit = true;
        } else if (playery == enemyy) {
            hit = true;
        }
        return hit;
    }
}
