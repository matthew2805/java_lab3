import java.util.Random;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c = "abcdefghijkmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char [] aray =  new char[n];
        for (int i = 0; i<aray.length; i++){
            aray[i] = c.charAt(random.nextInt(c.length()));
        }
        for(char a : aray){
            System.out.printf("%c  ",a);
        }
        System.out.println();
        System.out.println("Какой символ найти?");
        String k = in.next();
        char key = k.charAt(0);
        boolean rez = false;
        for (int i = 0; i< aray.length;i++){
            if (aray[i] ==key) {
                rez = true;
                break;
            }
        }
        System.out.printf("Ответ: %b \n",rez);
    }
}
