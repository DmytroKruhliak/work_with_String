/*
Отфильтровать из строки числа
        Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
         Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
         Например, если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0.
*/

        package exercise_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Scanner scan1 = new Scanner(System.in);
//        String enteredString = scan1.nextLine();
        String enteredStr = "test0-344ss fjlsdfjs 99-9 sdf33 d8 h4 s3";

        char[] charArrayOfEnteredString = enteredStr.toCharArray();
        char[] semiResultArray = new char[enteredStr.length()];

        String charArrToStr = "";

        String[] strToArrayStr;

        int i = 0, j = 0;

        for (char t : charArrayOfEnteredString) {

            if (t >= '0' && t <= '9') {
                semiResultArray[j] = t;
                j++;
            }else{
                j++;
                semiResultArray[j] = ' ';
            }
        }

        charArrToStr = String.copyValueOf(semiResultArray);
        strToArrayStr = charArrToStr.split(" ");
//        for (char t :
//                semiResultArray) {
//            if (t != ' ') {
//                semiResultArray[i++] = t;
//            }
//        }
        System.out.println((Arrays.toString(strToArrayStr)));
    }

}
