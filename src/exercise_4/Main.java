package exercise_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan1 = new Scanner(System.in);
//        String enteredString = scan1.nextLine();
        String enteredStr = "test0-344 fjlsdfj 999 sdf33 d8 h4 s3";

        char[] charArrayOfEnteredString = enteredStr.toCharArray();
        char[] semiResultArray = new char[enteredStr.length()];

        String charArrToStr = "";

        String[] strToArrayStr = new String[charArrToStr.length()];

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
        charArrToStr = charArrToStr.copyValueOf(semiResultArray);
        strToArrayStr = charArrToStr.split(" ");
        System.out.println(Arrays.toString(strToArrayStr));
    }

}
