public class Divide 
{
    public Divide(double dig1, double dig2, int move) 
    {
        if (move == 4) 
        {
            System.out.print(dig1 + " / " + dig2 + " = " + dig1/dig2);
            System.exit(1);
        }
        else if (move > 4)
        {
            System.out.println("Ошибка! Введён неверный номер");
        }
    }
}
