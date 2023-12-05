package SST;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static java.util.Map.entry;
import SST.ScanCanvas;
import SST.ManualMove;
import SST.Player;
import SST.GameMaster;

public class parser {

    public static boolean parse(String args) {
        String line = args.toUpperCase();

        if (line.length() < 2)
            line += "  ";
        else if (line.length() < 3 && line.length() > 2)
            line += " ";

        if (line.equals("SRSCAN") || line.startsWith("S")) {
            ScanCanvas.ShortScan();
        } else if (line.equals("STATUS") || line.startsWith("ST")) {
            return true;
        } else if (line.equals("LRSCAN") || line.startsWith("L")) {
            return true;
        } else if (line.equals("CHART") || line.startsWith("C")) {
            return true;
        } else if (line.equals("DAMAGES") || line.startsWith("DA")) {
            return true;
        } else if (line.equals("MOVE") || line.startsWith("M")) {
            return true;
        } else if (line.equals("WARP") || line.startsWith("W")) {
            return true;
        } else if (line.equals("IMPULSE") || line.startsWith("I")) {
            return true;
        } else if (line.equals("SHIELDS") || line.startsWith("SH")) {
            return true;
        } else if (line.equals("PHASERS") || line.startsWith("P")) {
            return true;
        } else if (line.equals("CLOAK")) {
            return true;
        } else if (line.equals("CAPTURE") || line.startsWith("CA")) {
            return true;
        } else if (line.equals("REPORT") || line.startsWith("REP")) {
            return true;
        } else if (line.equals("COMPUTER") || line.startsWith("CO")) {
            return true;
        } else if (line.equals("TORPEDO") || line.startsWith("TO")) {
            return true;
        } else if (line.equals("DOCK") || line.startsWith("D")) {
            return true;
        } else if (line.equals("REST") || line.startsWith("R")) {
            return true;
        } else if (line.equals("MAYDAY")) {
            return true;
        } else if (line.equals("ABANDON")) {
            return true;
        } else if (line.equals("DESTRUCT")) {
            return true;
        } else if (line.equals("QUIT")) {
            return true;
        } else if (line.equals("SENSORS") || line.startsWith("SE")) {
            return true;
        } else if (line.equals("ORBIT") || line.startsWith("O")) {
            return true;
        } else if (line.equals("TRANSPORT") || line.startsWith("T")) {
            ManualMove.move(GameMaster.player);
        } else if (line.equals("SHUTTLE") || line.startsWith("SHU")) {
            return true;
        } else if (line.equals("MINE") || line.startsWith("MI")) {
            return true;
        } else if (line.equals("CRYSTALS") || line.startsWith("CR")) {
            return true;
        } else if (line.equals("PLANETS") || line.startsWith("PL")) {
            return true;
        } else if (line.equals("FREEZE")) {
            return true;
        } else if (line.equals("REQUEST") || line.startsWith("REQ")) {
            return true;
        } else if (line.equals("DEATHRAY")) {
            return true;
        } else if (line.equals("PROBE") || line.startsWith("PR")) {
            return true;
        } else if (line.equals("EMEXIT") || line.startsWith("E")) {
            return true;
        } else if (line.equals("HELP")) {
            return true;
        } else if (line.equals("CURSES")) {
            return true;
        }
        return false;
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
