package SST;

import java.util.Scanner;

public class MainLoop {

    public static boolean commandParsed = false;
    public static StarMap starMap;

    public static void main(String[] args){
        Scanner readIn = new Scanner(System.in);
        System.out.println("What are your orders, Captain?> ");
        String in = readIn.nextLine();

        while(true){
            parser.Parse(in);
            System.out.println("What are your orders, Captain?> ");
            in = readIn.nextLine();
        }
    }
}
