public class GameData {
    private String playerName = "default";
    public String GetPlayerName(String getKey){
        if(getKey.equals("AcceptableKey"))
            return playerName;
        else
            return "";
    }
    public void SetPlayerName(String setKey, String newPlayerName){
        if(setKey.equals("AcceptableKey"))
            playerName = newPlayerName;
    }
}
