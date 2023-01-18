import java.util.Scanner;
// import java.lang.Math;
import java.lang.reflect.*;

public class Complex 
{
    public Complex(String func) 
    {
        // Object fun = func.getClass().getField(func).get();
        Scanner work = new Scanner(System.in);
        Double argc = work.nextDouble();
        Method meem = argc.getClass().getMethod("doSomething", null);
        Double res = Math.log(argc);
        System.out.println(Math.log(argc));
        work.close();
    }
}
