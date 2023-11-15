package SST.Utilities;

import SST.Components.AggressionLevel;

public class DifficultyModifier {

    private AggressionLevel generalAggroLevel = AggressionLevel.Low;
    public AggressionLevel getGeneralAggroLevel() { return generalAggroLevel; }
    private double damageMultiplier = 1.0;
    public double getDamageMultiplier() { return damageMultiplier; }
    private double novaChanceMultiplier = 1.0;
    public double getNovaChanceMultiplier() { return novaChanceMultiplier; }

    private int enemiesPerQuadrantMultiplier = 1;
    public int getEnemiesPerQuadrantMultiplier() { return enemiesPerQuadrantMultiplier; }
    private int starsPerQuadrantMultiplier = 1;
    public int getStarsPerQuadrantMultiplier() { return starsPerQuadrantMultiplier; }
    private int basesPerQuadrantMultiplier = 1;
    public int getBasesPerQuadrantMultiplier() { return basesPerQuadrantMultiplier; }
    private int generalModifier = 1;
    public int getGeneralModifier() { return generalModifier; }

    public DifficultyModifier(){}

    public DifficultyModifier(AggressionLevel genAggLvl, double dam, double novaChc, int enmPQ, int strPQ, int basPQ, int genMod){
        damageMultiplier = dam;
        novaChanceMultiplier = novaChc;
        enemiesPerQuadrantMultiplier = enmPQ;
        starsPerQuadrantMultiplier = strPQ;
        basesPerQuadrantMultiplier = basPQ;
        generalModifier = genMod;
    }
}
