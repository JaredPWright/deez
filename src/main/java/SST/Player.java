package SST;

import SST.Components.*;
import SST.Quadrant;
import SST.Sector;

public class Player extends Entity{

    //name included in Entity base class
    private Health health;
    public Health getHealth(){return health;}
    private Position3D position3D;

    public Player(String name) {
        super(name);
        health = new Health(100, GameMaster.getInstance().difficultyModifier.getGeneralModifier());
        position3D = new Position3D(0,0,0);
        this.addComponent(health, position3D, new Movable(), new Renderable('P'));
    }

    public Position3D getCoordinates(){return position3D;}

    public Position2D getSector(){
        Position2D retval = new Position2D(position3D.position.yDes, position3D.position.zDes);
        return retval;
    }

    public int getQuadrant(){return position3D.position.qDes;}
}

