package SST;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static java.util.Map.entry;

public class parser {

//    public Map<String,String> commands = new HashMap<String,String>(){{
//        put("s","ShortScan");
//        put("srscan", "ShortScan");
//        put("")
//    }};

    public parser(){}
    public static boolean parse(String args)
    {
            String line = args.toUpperCase();

            if(line.length() < 2)
                line += "  ";
            else if (line.length() == 2)
                line += " ";

            String methodName = null;
            String optionalParameter = null;
            Object obj = null;

            if(line.equals("SRSCAN") || line.substring(0).equals("S"))
            {
                methodName = "ShortScan";
                obj = new ScanCanvas();
            }
            else if(line.equals("STATUS") || line.substring(0,1).equals("ST"))
            {
                methodName = "Status";
                //obj = new Status();
            }
            else if(line.equals("LRSCAN") || line.substring(0).equals("L"))
            {
                methodName = "LongScan";
                //obj = new LongScan();
            }
            else if(line.equals("CHART") || line.substring(0).equals("C"))
            {
                methodName = "Chart";
                //obj = new Chart();
            }
            else if(line.equals("DAMAGES") || line.substring(0,1).equals("DA"))
            {
                methodName = "Damages";
                //obj = new Damages();
            }
            else if(line.equals("MOVE") || line.substring(0).equals("M"))
            {
                methodName = "Move";
                obj = GameMaster.getInstance().player;
            }
            else if(line.equals("WARP") || line.substring(0).equals("W"))
            {
                methodName = "Move";
                optionalParameter = "Warp";
                obj = GameMaster.getInstance().player;
            }
            else if(line.equals("IMPUSLE") || line.substring(0).equals("I"))
            {
                methodName = "Move";
                optionalParameter = "Impulse";
                obj = GameMaster.getInstance().player;
            }
            else if(line.equals("SHIELDS") || line.substring(0,1).equals("SH"))
            {
                methodName = "Shield";
            }
            else if(line.equals("PHASERS") || line.substring(0).equals("P"))
            {
                methodName = "Phaser";
            }
            else if(line.equals("CLOAK"))
            {
                methodName = "Cloak";
            }
            else if(line.equals("CAPTURE") || line.substring(0,1).equals("CA"))
            {
                methodName = "Capture";
            }
            else if(line.equals("REPORT") || line.substring(0,2).equals("REP"))
            {
                methodName = "Report";
            }
            else if(line.equals("COMPUTER") || line.substring(0,1).equals("CO"))
            {
                methodName = "Computer";
            }
            else if(line.equals("TORPEDO") || line.substring(0,1).equals("TO"))
            {
                methodName = "Torpedo";
            }
            else if(line.equals("DOCK") || line.substring(0).equals("D"))
            {
                methodName = "Dock";
            }
            else if(line.equals("REST") || line.substring(0).equals("R"))
            {
                methodName = "Rest";
            }
            else if(line.equals("MAYDAY"))
            {
                methodName = "Mayday";
            }
            else if(line.equals("ABANDON"))
            {
                methodName = "Abandon";
            }
            else if(line.equals("DESTRUCT"))
            {
                methodName = "Destruct";
            }
            else if(line.equals("QUIT"))
            {
                methodName = "Quit";
            }
            else if(line.equals("SENSORS") || line.substring(0,1).equals("SE"))
            {
                methodName = "Sensors";
            }
            else if(line.equals("ORBIT") || line.substring(0).equals("O"))
            {
                methodName = "Orbit";
            }
            else if(line.equals("TRANSPORT") || line.substring(0).equals("T"))
            {
                methodName = "Transport";
            }
            else if(line.equals("SHUTTLE") || line.substring(0,2).equals("SHU"))
            {
                methodName = "Shuttle";
            }
            else if(line.equals("MINE") || line.substring(0,1).equals("MI"))
            {
                methodName = "Mine";
            }
            else if(line.equals("STATUS") || line.substring(0,1).equals("ST"))
            {
                methodName = "Status";
            }
            else if(line.equals("CRYSTALS") || line.substring(0,1).equals("CR"))
            {
                methodName = "Crystals";
            }
            else if(line.equals("PLANETS") || line.substring(0,1).equals("PL"))
            {
                methodName = "Planets";
            }
            else if(line.equals("FREEZE"))
            {
                methodName = "Freeze";
            }
            else if(line.equals("REQUEST") || line.substring(0,2).equals("REQ"))
            {
                methodName = "Request";
            }
            else if(line.equals("DEATHRAY"))
            {
                methodName = "DeathRay";
            }
            else if(line.equals("PROBE") || line.substring(0,1).equals("PR"))
            {
                methodName = "Probe";
            }
            else if(line.equals("EMEXIT") || line.substring(0).equals("E"))
            {
                methodName = "EmergencyExit";
            }
            else if(line.equals("HELP"))
            {
                methodName = "Help";
            }
            else if(line.equals("CURSES"))
            {
                methodName = "Curses";
            }
            else if(line.equals("LOG"))
            {
                methodName = "SaveGame";
                obj = GameMaster.getInstance();
                //this is the save function call
                //GameMaster.getInstance().SaveGame(GameMaster.getInstance().player.getName());
            }else{

                System.out.println(Confusion());
                return true;
            }

            //rewrite as a straight call. It's already buried in a loop

            if(optionalParameter != null)
                GameMaster.getInstance().tick(methodName, obj, optionalParameter);
            else if(methodName != null)
                GameMaster.getInstance().tick(methodName, obj);
            else
                GameMaster.getInstance().tick();

        return true;
    }

    private static String Confusion(){
        Random rand = new Random();
        int d6 = rand.nextInt(5);

        switch (d6){
            case 0: return "What was that, Captain?\n";
            case 1: return "What do you mean, Cap?\n";
            case 2: return "I don't know what you mean, Cap'n!\n";
            case 3: return "I am not aware of that tactic, Captain.\n";
            case 4: return "Please restate your order, sir!\n";
            default: return "What are your orders, Captain?\n";
        }
    }
}
