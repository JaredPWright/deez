package SST;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.google.gson.Gson;

public class GameMaster {

    private static GameMaster single_instance = null;

    public static StarMap starMap;

    public Player player;

    private Map<String, Entity> klingons = new HashMap<String, Entity>();
    private Map<String, Entity> romulans = new HashMap<String, Entity>();

    private GameDifficulty difficulty = GameDifficulty.Normal;
    public void SetDifficulty(GameDifficulty diff){
        difficulty = diff;
    }

    private GameMaster(){

    }

    public GameDifficulty GetDifficulty(){
        return difficulty;
    }

    public Map<String, Entity> GetKlingons(){
        return klingons;
    }

    public Map<String, Entity> GetRomulans(){
        return romulans;
    }

    public static synchronized GameMaster getInstance(){
        if (single_instance == null){
            single_instance = new GameMaster();
        }

        return single_instance;
    }

    public void StartNewGame(GameDifficulty gameDifficulty, String filename){
        SetDifficulty(gameDifficulty);

        starMap = new StarMap("starMap_" + filename);

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

        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
            entry.getValue().TakeAction();
        }
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

        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
            entry.getValue().TakeAction();
        }
    }

    public void tick(){
        for (Map.Entry<String, Entity> entry : klingons.entrySet()) {
            entry.getValue().TakeAction();
        }

        for(Map.Entry<String, Entity> entry : romulans.entrySet()){
            entry.getValue().TakeAction();
        }
    }
}
