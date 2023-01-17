public class Plus extends Minus
{
    public Plus(double dig1, double dig2, int move) 
    {
        super(dig1, dig2, move);
        if (move == 1) 
        {
            Double sum = dig1 + dig2;
            System.out.print(dig1 + "+" + dig2 + "= " + sum);
        }
    }
}
