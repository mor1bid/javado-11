public class Multi extends Divide implements Calcula 
{
    public Multi(double dig1, double dig2, int move) 
    {
        super(dig1, dig2, move);
        if (move == 3) 
        {
            System.out.print(dig1*dig2);
        }
    }
}
