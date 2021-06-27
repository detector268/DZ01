import java.util.*;

public class DZ05Balda{
public static void main(String[]args){
        System.out.println("Введите основное слово");
        Scanner sc = new Scanner(System.in);
        String mainWord = sc.nextLine();
        boolean exit =false;
        Set <String> slovar = new LinkedHashSet<String>();
        while (!exit){
                String nextWord = sc.nextLine();
                if (nextWord.isEmpty()) {exit=true;}
                        else {
                                if(validator(mainWord, nextWord)) {
                                  slovar.add(nextWord);
                                }
                                else {
                                        System.out.println("Попробуйте ещё раз");
                                }
                        }
                }

        System.out.println("ваш резултат: " + slovar.size());
        System.out.println("Вы ввели - "+slovar);
        }

        private static boolean validator(String main, String word){
        for (int i=0; i<word.length(); i++){
                if(-1==main.indexOf(word.charAt(i))) {
                        return false;
                }
        }
        return true;
        }
}