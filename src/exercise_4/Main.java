/*
Отфильтровать из строки числа
        Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
         Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
         Например, если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0.
*/

package exercise_4;
//test0-34##4s№;%s fjlsdfjs 9+9-9 sdf33 d8 h4 s3
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String enteredString = scan1.nextLine();
        System.out.println(Arrays.toString(getNumbers(enteredString)));
    }

    private static int[] getNumbers(String string) {
        char[] charArr = string.toCharArray();
        String resStr = "";
        boolean switcher = false;

        for (char c : charArr) {
            if (mainCondition(c)) {
                resStr += c;
                switcher = true;
            } else {
                if (switcher) {
                    resStr += "-";
                }
                switcher = false;
            }
        }
        return split(resStr, "-");

    }

    private static int[] split(String str, String div) {
        String[] strArr = str.split(div);
        int i = 0;
        int[] intArrRes = new int[str.length()];
        for (String t :
                strArr) {
            intArrRes[i++] = Integer.parseInt(t);
        }
        return intArrRes;
    }


    private static boolean mainCondition(char ch) {
        return ('0' <= ch) && (ch <= '9');
    }

}