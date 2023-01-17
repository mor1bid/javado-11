public class Plus extends Minus implements Calcula 
{
    public Plus(double dig1, double dig2, int move) 
    {
        super(dig1, dig2, move);
        if (move == 1) 
        {
            // System.out.print(dig1 + "+" + dig2 + "= ");
            System.out.println(dig1+dig2);
        }
    }
}
