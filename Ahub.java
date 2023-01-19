import java.util.*;
public class Ahub 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Калькулятор! Для начала работы, выберите желаемый режим работы:\n(1) Рациональные числа\n(2) Комплексные числа");
        String mode = work.nextLine();
        if (mode.equals("1")) 
        {
            System.out.println("Выберите желаемое действие:\n(1) Сложение\n(2) Вычитание\n(3) Умножение\n(4) Деление");
            try 
            {
                int move = work.nextInt();
                if (move>4 || move<1) 
                {
                    System.out.println("Ошибка! Задано неверное значение!");
                }
                System.out.println("Введите первый и второй аргументы через Enter:");
                Double arg1 = work.nextDouble();
                Double arg2 = work.nextDouble();
                if (move == 4 && arg2 == 0) 
                {
                    System.out.println("Ошибка! На ноль делить - нельзя!");
                    System.exit(1);
                }
                System.out.println("\n" + new Plus(arg1, arg2, move));
            }
            catch (Exception e) 
            {
                System.out.println("Ошибка! Задано неверное значение!");
            }
        }
        else if (mode.equals("2"))
        {
            System.out.println("Выберите желаемую функцию\n(1) Синус\n(2) Косинус\n(3) Тангенс\n(4) Логарифм по основанию");
            try 
            {
                int func = work.nextInt();
                if (func>4 || func<1) 
                {
                    System.out.println("Ошибка! Задано неверное значение!");
                }
                System.out.println("Введите желаемое число: ");
                Double argc = work.nextDouble();
                System.out.println(new Complex(func, argc));
            }
            catch (Exception e) 
            {
                System.out.println("Ошибка! Задано неверное значение!");
            }
        }
        else 
        {
            System.out.println("Ошибка! Введён неверный номер");
        }
        work.close();
    }

}
