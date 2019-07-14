//Удаление из строки повторяющихся символов
//        Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
//        Например, если было введено "abc cde def", то должно быть выведено "abcdef".

package exercise_5;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charsFromSin = scanner.nextLine().toCharArray();
        System.out.print(uniqueChars(charsFromSin));
        StringBuilder resultStr = new StringBuilder();

    }


    private static String uniqueChars(char[] chars) {
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            int counter = 0;

            for (int j = 0; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    counter++;
                }
            }

            if (counter == 1) {
                resultStr.append(chars[i]);
            }

        }
        return resultStr.toString();


    }
}
