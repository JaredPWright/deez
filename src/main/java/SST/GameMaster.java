package SST;

import java.awt.font.NumericShaper;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import SST.Components.*;
import SST.Utilities.DifficultyModifier;
import SST.Utilities.DifficultyModifiers;
import SST.Utilities.EntityStorage;
import SST.Utilities.GameMasterUtilities;
import com.google.common.collect.Range;
import com.google.gson.Gson;

public class GameMaster {

    private static GameMaster single_instance = null;

    public StarMap starMap;
    public DifficultyModifier difficultyModifier;

    public Player player;

    public EntityStorage entityStorage;
    private Map<String, Entity> klingons = new HashMap<String, Entity>();
    private Map<String, Entity> stars = new HashMap<String, Entity>();
    private Map<String, Entity> planets = new HashMap<String, Entity>();
    private Map<String, Entity> starBases = new HashMap<String, Entity>();
    //private Map<String, Entity> romulans = new HashMap<String, Entity>();

    private GameDifficulty difficulty = GameDifficulty.Normal;
    public void SetDifficulty(GameDifficulty diff){
        difficulty = diff;
    }
    private DifficultyModifier diffMod;
    public DifficultyModifier getDiffMod() { return diffMod; }

    //for spawning purposes. We'll set these when we load the game.
    private Random d3 = new Random();
    public int enemiesPerQuad = 3;
    public int starsPerQuad = 5;
    public int basesPerQuad = 1;

    public double novaChance = .05;

    private GameMaster(){

    }

    public GameDifficulty getDifficulty(){
        return difficulty;
    }

    public Map<String, Entity> getKlingons(){
        return klingons;
    }
    public Map<String, Entity> getStars() { return stars; }
    public Map<String, Entity> getPlanets() { return planets; }
    public Map<String, Entity> getStarBases() { return starBases; }

//    public Map<String, Entity> GetRomulans(){
//        return romulans;
//    }

    public static synchronized GameMaster getInstance(){
        if (single_instance == null){
            single_instance = new GameMaster();
        }

        return single_instance;
    }

    public void StartNewGame(GameDifficulty gameDifficulty, String filename){
        SetDifficulty(gameDifficulty);

        setGlobalValues(gameDifficulty);

        starMap = new StarMap("starMap_" + filename);

        int q = 0;
        for(Quadrant quad : starMap.GetQuadrantGrid()) {
            for (Entity[] sects : quad.GetSectorGrid()) {
                for(Entity sector : sects) {
                    ArrayList slotsTaken = new ArrayList<Position3D>();
                    GameMasterUtilities gmu = new GameMasterUtilities();
                    gmu.GenerateEntities("klingon", enemiesPerQuad, q, klingons, slotsTaken,
                                        new Enemy(),
                                        new Combatant(),
                                        new Health(2, diffMod.getGeneralModifier()),
                                        new Movable(),
                                        new Renderable('{')
                    );

                    gmu.GenerateEntities("star", starsPerQuad, q, stars, slotsTaken,
                                        new Traversable()
                    );

//                    gmu.GenerateEntities();
                }
            }
            q++;
        }


        SaveGame(filename);
    }

    public void SaveGame(String filename){
        //save the new game settings to a json file. We will save on Quit too.
        Gson gson = new Gson();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename+".json");
            fileWriter.write(gson.toJson(single_instance));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void tick(String methodName, Object obj, String optionalArg){

        java.lang.reflect.Method method;

        try {
            method = obj.getClass().getMethod(methodName);
            method.invoke(obj, optionalArg);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, Entity> entry : klingons.entrySet()) {
            entry.getValue().TakeAction();
        }

//        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
//            entry.getValue().TakeAction();
//        }
    }

    public void tick(String methodName, Object obj){

        java.lang.reflect.Method method;

        try {
            method = obj.getClass().getMethod(methodName);
            method.invoke(obj);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<String, Entity> entry : klingons.entrySet()) {
            entry.getValue().TakeAction();
        }

//        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
//            entry.getValue().TakeAction();
//        }
    }

    public void tick(){
        for (Map.Entry<String, Entity> entry : klingons.entrySet()) {
            entry.getValue().TakeAction();
        }

//        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
//            entry.getValue().TakeAction();
//        }
    }

    public void setGlobalValues(GameDifficulty gameDifficulty){
        //generate a new modifier class
        DifficultyModifiers diffMods = new DifficultyModifiers();
        //set the modifier values
        diffMod = diffMods.setDifficultyModifer(gameDifficulty);

        novaChance = novaChance * diffMod.getNovaChanceMultiplier();

        enemiesPerQuad = d3.nextInt(enemiesPerQuad) * diffMod.getEnemiesPerQuadrantMultiplier();
        starsPerQuad = d3.nextInt(starsPerQuad) * diffMod.getStarsPerQuadrantMultiplier();
        basesPerQuad = d3.nextInt(basesPerQuad) * diffMod.getBasesPerQuadrantMultiplier();
    }

    //Leaving this here in case we get to saving stuff later.
//    public void setGlobalValues(){}
}
