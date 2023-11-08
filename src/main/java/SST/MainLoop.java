package SST;

import java.util.Scanner;

public class MainLoop {

    public static boolean commandParsed = true;

    public static void main(String[] args){

        System.out.println("Welcome to Super Star Trek!\nNew Game (N/n) or Load Game (L/l)");

        Scanner readIn = new Scanner(System.in);
        String in = readIn.nextLine();

        if(in.equalsIgnoreCase("l")){

        }

        System.out.println("What are your orders, Captain?> ");
        in = readIn.nextLine();

        while(commandParsed){
            commandParsed = parser.parse(in);
            System.out.println("What are your orders, Captain?> ");
            in = readIn.nextLine();
        }
    }
}