import java.util.Scanner;
public class DZ03 {
    public static void main (String args[]) {

//        принимаем параметры
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число      для выхода q");
        while(true){
            try{
                String in = sc.nextLine();

                if (in.equals("q")) break;

                Long value = Long.parseLong(in);
                fibocalc(value);

            }
            catch (Exception e){ System.out.println("Вы ввели некоректное значение");
            }
        }

    }
    public static void fibocalc(long value){
        long raz = 0, raz1 = 0;
        while (value>0) {
            long r[] = new long[2];
            r = fibgen(value);
            value=value-r[0];
            if (raz==0) raz = r[1];

            else {raz1 = raz-r[1];
                raz = raz-raz1;
                System.out.print("1");
                for(long i=raz1; i>1; i--) System.out.print("0");
            }
        }
        System.out.print("1");
        for(long i=raz; i>1; i--) System.out.print("0");
    }

    public static long[] fibgen (long x){

        int i=1,  y=0,  z=1, v=1;

        while(y<=x && z<=x)
        {
            if (i%2==1) {
                y = z + y;
            }
            else        {
                z=y+z;
            }
            i++;
        }
        if (i%2==1){
            v =  y;
        }
        else {
            v =  z;
        }
        return new  long[]  {v, i-2};
    }

}


