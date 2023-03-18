import java.util.InputMismatchException;
import java.util.Scanner;
public class task1 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n,sum=0;
        try {
            System.out.print("Введите число: ");
            n=scn.nextInt();
            if (n!=0){
                {
                    do
                    {
                        sum += n;
                        System.out.print("Введите число: ");
                        n=scn.nextInt();
                    } while (n != 0);
                    System.out.println("Сумма всех чисел равна "+sum);
                }
            }
        }
        catch (InputMismatchException exception) {
            System.out.println("Ошибка! Введите число");
        }
    }
}
