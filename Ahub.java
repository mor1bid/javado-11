import java.util.Scanner;
public class Ahub 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Калькулятор! Для начала работы, выберите желаемый режим работы:\n(1) Рациональные числа\n(2) Комплексные числа");
        String mode = work.nextLine();
        System.out.println("Выберите желаемое действие:\n(1) Сложение\n(2) Вычитание\n(3) Умножение\n(4) Деление");
        int move = work.nextInt();
        if (mode.equals("1")) 
        {
            System.out.println("Введите первый и второй аргументы через Enter:");
            Double arg1 = work.nextDouble();
            Double arg2 = work.nextDouble();
            System.out.println("\n" + new Plus(arg1, arg2, move));
        }
        else if (mode.equals("2"))
        {
            
        }
        else 
        {
            System.out.println("Ошибка! Введён неверный номер");
        }
        work.close();
    }

}
