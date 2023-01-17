public class Minus extends Multi
{
    public Minus(double dig1, double dig2, int move) 
    {
        super(dig1, dig2, move);
        if (move == 2) 
        {
            Double mus = dig1 - dig2;
            System.out.print(dig1 + "-" + dig2 + "= " + mus);
        }
    }
}
