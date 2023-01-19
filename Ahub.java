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
            String move = work.nextLine();
            System.out.println("Введите первый и второй аргументы через Enter:");
            try 
            {
                Double arg1 = work.nextDouble();
                Double arg2 = work.nextDouble();
                if (move.equals("4") && arg2 == 0) 
                {
                    System.out.println("Ошибка! Делить на ноль - нельзя!");
                    System.exit(1);
                }
                System.out.println("\n" + new Plus(arg1, arg2, move));
            } 
            catch (Exception e) 
            {
                System.out.println("Ошибка! Заданное значение не является числом!");
            }
        }
        else if (mode.equals("2"))
        {
            System.out.println("Выберите желаемую функцию\n(1) Синус\n(2) Косинус\n(3) Тангенс\n(4) Логарифм по основанию");
            String func = work.nextLine();
            System.out.println("Введите желаемое число: ");
            Double argc = work.nextDouble();
            System.out.println(new Complex(func, argc));
        }
        else 
        {
            System.out.println("Ошибка! Введён неверный номер");
        }
        work.close();
    }

}
