package SST.Utilities;

import SST.Components.AggressionLevel;
import SST.GameDifficulty;

public class DifficultyModifiers {

    private DifficultyModifier novice = new DifficultyModifier();
    private DifficultyModifier normal = new DifficultyModifier(AggressionLevel.Moderate, 1.25, 1.1, 1, 1, 2, 1);
    private DifficultyModifier good = new DifficultyModifier(AggressionLevel.High, 2.0, 1.2, 1, 2, 1, 2);
    private DifficultyModifier expert = new DifficultyModifier(AggressionLevel.ExtremelyHigh, 2.0, 1.25, 2, 2, 1, 3);
    private DifficultyModifier emeritus = new DifficultyModifier(AggressionLevel.IrrationallyHigh, 2.5, 1.5, 3, 2, 1, 4);

    public DifficultyModifier setDifficultyModifer(GameDifficulty difficulty){
        switch(difficulty){
            case Novice :{
                return novice;
            }
            case Normal :{
                return normal;
            }
            case Good:{
                return good;
            }
            case Expert:{
                return expert;
            }
            default:{
                return emeritus;
            }
        }
    }
}
