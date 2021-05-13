
import java.util.Scanner;
import java.util.Random;

public class DZ01 {
    public static void main (String args[]) {
//DZ1
//        принимаем параметр
        Random random = new Random();
        int x = random.nextInt(1000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while(true){
            try{
                int value = sc.nextInt();
                if (value==x) {
                    System.out.println("Вы угадали!");
                    break;
                }
                if (x<value) System.out.println("Меньше");
                else System.out.println("Больше");
            }
            catch (Exception e){
                sc.nextLine();
                System.out.println("Вы ввели некоректное значение");
            }
        }

    }
}
