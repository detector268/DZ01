import java.util.Scanner;

public class DZ02 {

        public static void main (String args[]) {
//        принимаем параметры
            Scanner sc = new Scanner(System.in);
            int starColumn = 0;
            int starLine = 0;
            String value = "";
            try {
                starColumn = sc.nextInt();
                sc.nextLine();
            }
            catch (Exception e) {
                System.out.println("Ошибка ввода");
                sc.nextLine();
                System.exit(0);
            }

            try {
                starLine = sc.nextInt();
                sc.nextLine();
            }
            catch (Exception e) {
                System.out.println("Ошибка ввода");
                sc.nextLine();
                System.exit(0);
            }

            value = sc.nextLine();
            paint(starColumn, starLine, value);
        }

        public static void paint (int starColumn, int starLine, String value)    {
//        проверка на вписываемость
            if ((starLine<3) || (value.length() > starLine-2)) System.out.println("Ошибка");
            else{
//        рисование
                int paddingTop;
                int paddingRight;
                paddingTop = (starColumn - 3)/2;
                paddingRight = (starLine - value.length() - 2)/2;
                for(int i=starLine; i>0; i--){
                    System.out.print("*");
                }
                System.out.print("\n");
                for (int i=paddingTop; i>0; i--){
                    System.out.print("*");
                    for(int j=starLine-2; j>0; j--) System.out.print(" ");
                    System.out.println("*");
                }
                System.out.print("*");
                for(int i=paddingRight; i>0; i--) System.out.print(" ");
                System.out.print(value);
                for(int i=starLine-value.length()-paddingRight-2; i>0; i--)
                    System.out.print(" ");
                System.out.println("*");
                for (int i=starColumn-paddingTop-3; i>0; i--){
                    System.out.print("*");
                    for(int j=starLine-2; j>0; j--) System.out.print(" ");
                    System.out.println("*");
                }
                for(int i=starLine; i>0; i--){
                    System.out.print("*");
                }

            }

    }



}
