package SST.Systems;

import SST.Star;

public class Nova {

    public void onSuperNova(Star starInQuestion){
        starInQuestion.isBlackHole = true;
        starInQuestion.removeComponent("Traversable");
    }
}
