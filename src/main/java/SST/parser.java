package SST;
import java.util.Random;

public class parser {

    public parser(){}
    public static boolean Parse(String args)
    {
            String line = args.toUpperCase()/*.substring(i)*/;
            if(line.length() < 2)
                line += "  ";
            else if (line.length() < 3 && line.length() > 2)
                line += " ";

            if(line.equals("SRSCAN") || line.substring(0).equals("S"))
            {

                return true;
            }
            else if(line.equals("STATUS") || line.substring(0,1).equals("ST"))
            {
                return true;
            }
            else if(line.equals("LRSCAN") || line.substring(0).equals("L"))
            {
                return true;
            }
            else if(line.equals("CHART") || line.substring(0).equals("C"))
            {
                return true;
            }
            else if(line.equals("DAMAGES") || line.substring(0,1).equals("DA"))
            {
                return true;
            }
            else if(line.equals("MOVE") || line.substring(0).equals("M"))
            {
                return true;
            }
            else if(line.equals("WARP") || line.substring(0).equals("W"))
            {
                return true;
            }
            else if(line.equals("IMPUSLE") || line.substring(0).equals("I"))
            {
                return true;
            }
            else if(line.equals("SHIELDS") || line.substring(0,1).equals("SH"))
            {
                return true;
            }
            else if(line.equals("PHASERS") || line.substring(0).equals("P"))
            {
                return true;
            }
            else if(line.equals("CLOAK"))
            {
                return true;
            }
            else if(line.equals("CAPTURE") || line.substring(0,1).equals("CA"))
            {
                return true;
            }
            else if(line.equals("REPORT") || line.substring(0,2).equals("REP"))
            {
                return true;
            }
            else if(line.equals("COMPUTER") || line.substring(0,1).equals("CO"))
            {
                return true;
            }
            else if(line.equals("TORPEDO") || line.substring(0,1).equals("TO"))
            {
                return true;
            }
            else if(line.equals("DOCK") || line.substring(0).equals("D"))
            {
                return true;
            }
            else if(line.equals("REST") || line.substring(0).equals("R"))
            {
                return true;
            }
            else if(line.equals("MAYDAY"))
            {
                return true;
            }
            else if(line.equals("ABANDON"))
            {
                return true;
            }
            else if(line.equals("DESTRUCT"))
            {
                return true;
            }
            else if(line.equals("QUIT"))
            {
                return true;
            }
            else if(line.equals("SENSORS") || line.substring(0,1).equals("SE"))
            {
                return true;
            }
            else if(line.equals("ORBIT") || line.substring(0).equals("O"))
            {
                return true;
            }
            else if(line.equals("TRANSPORT") || line.substring(0).equals("T"))
            {
                return true;
            }
            else if(line.equals("SHUTTLE") || line.substring(0,2).equals("SHU"))
            {
                return true;
            }
            else if(line.equals("MINE") || line.substring(0,1).equals("MI"))
            {
                return true;
            }
            else if(line.equals("STATUS") || line.substring(0,1).equals("ST"))
            {
                return true;
            }
            else if(line.equals("CRYSTALS") || line.substring(0,1).equals("CR"))
            {
                return true;
            }
            else if(line.equals("PLANETS") || line.substring(0,1).equals("PL"))
            {
                return true;
            }
            else if(line.equals("FREEZE"))
            {
                return true;
            }
            else if(line.equals("REQUEST") || line.substring(0,2).equals("REQ"))
            {
                return true;
            }
            else if(line.equals("DEATHRAY"))
            {
                return true;
            }
            else if(line.equals("PROBE") || line.substring(0,1).equals("PR"))
            {
                return true;
            }
            else if(line.equals("EMEXIT") || line.substring(0).equals("E"))
            {
                return true;
            }
            else if(line.equals("HELP"))
            {
                return true;
            }
            else if(line.equals("CURSES"))
            {
                return true;
            }

        System.out.println(Confusion());
        return true;
    }

    private static String Confusion(){
        Random rand = new Random();
        int d6 = rand.nextInt(5);

        switch (d6){
            case 0: return "What was that, Captain?\n";
            case 1: return "What do you mean, Cap?\n";
            case 2: return "I don't know what you mean, Captain!\n";
            case 3: return "I am not aware of that tactic, Captain.\n";
            case 4: return "Please restate your order, sir!\n";
            default: return "What are your orders, Captain?\n";
        }
    }
}
