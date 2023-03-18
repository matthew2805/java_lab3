import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int result = 0;
        try {
            System.out.print("Введите a: ");
            a = scn.nextInt();
            System.out.print("Введите b: ");
            b = scn.nextInt();
            if (a > 1000 || a < 0 || b > 1000 || b < 0) {
                System.out.println("Error. Число больше 1000 или меньше 1 ");
            } else {
                result = (a * (a / b) + b * (b / a)) / (b / a + a / b);
                System.out.println("Больше " + result);
            }
        }
        catch (InputMismatchException exception) {
            System.out.println("Ошибка! Введите число");
        }
    }
}
