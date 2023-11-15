package SST.Systems;

import SST.GameMaster;

public class Victory {

    private boolean haveWeWon(){
        return GameMaster.getInstance().getKlingons().isEmpty();
    }

    public void declareVictory(){
        if(haveWeWon())
            System.out.println("You win!");
        //display some information here
    }
}
