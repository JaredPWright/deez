package SST;

public class move
{
    public static int movement = 1;
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            String line = args[i];
            if(line.equals("FOWARD"))
            {
                int warp = WARP();

                int move = movement * warp;

                int sec = Player.getSector();
                //int qua = Player.getQuadrant();

                Player.setSector() = move - sec;
                //when player added, find the cords in the nested for loop and move the player up x places
            }
            if(line.equals("Right"))
            {
                int warp = WARP();

                int move = movement * warp;

                int qua = Player.getQuadrant();

                Player.setQuadrant = move + qua;
                //when player added, find the cords in the nested for loop and move the player right x places
            }
            if(line.equals("Left"))
            {
                int warp = WARP();

                int move = movement * warp;

                int qua = Player.getQuadrant();

                Player.setQuadrant = move - qua;

                //when player added, find the cords in the nested for loop and move the player left x places
            }
            if(line.equals("Backward"))
            {
                int warp = WARP();

                int move = movement * warp;

                int sec = Player.getSector();
                //int qua = Player.getQuadrant();

                Player.setSector() = move + sec;

                //when player added, find the cords in the nested for loop and move the player down x places
            }
        }
    }

}
