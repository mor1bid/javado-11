import java.util.Scanner;

public class Complex 
{
    public Complex(int func, Double argc) 
    {
        Scanner work = new Scanner(System.in);
        if (func == 1) 
        {
            System.out.print("sin " + argc + " = " + Math.sin(argc));
        }
        else if (func == 2) 
        {
            System.out.print("cos " + argc + " = " + Math.cos(argc));
        }
        else if (func == 3) 
        {
            System.out.print("tg " + argc + " = " + Math.tan(argc));
        }
        else if (func == 4) 
        {
            Double base = work.nextDouble();
            System.out.print("log" + base + " " + argc + " = " + basedLog(argc, base));
        }
        work.close();
        System.exit(1);
    }

    public static double basedLog (double base, double argc) 
    {
        return Math.log(argc) / Math.log(base);
    }
}
