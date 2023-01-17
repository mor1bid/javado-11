public class Minus extends Multi implements Calcula 
{
    public Minus(double dig1, double dig2, int move) 
    {
        super(dig1, dig2, move);
        if (move == 2) 
        {
            System.out.print(dig1-dig2);
        }
    }
}
