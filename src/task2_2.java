import java.util.InputMismatchException;
import java.util.Scanner;

public class task2_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 0;
        try {

            System.out.print("Введите первое число от 1 до 1000: ");
            a = scn.nextInt();
            System.out.print("Введите второе число от 1 до 1000: ");
            b = scn.nextInt();
            result = a <= 1000 & a >= 1 & b <= 1000 & b >= 1 ? (a * (a / b) + b * (b / a)) / (b / a + a / b) : 0;
            System.out.println("Наибольшее число:  " + result);
        }
        catch (InputMismatchException exception) {
            System.out.println("Ошибка! Введите число");
        }
    }
}
