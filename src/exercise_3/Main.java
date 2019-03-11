package exercise_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        String deleteSpaces = enteredString.replaceAll(" ", "");
        String[] SplitedBySpace = deleteSpaces.split("");

        String[] reversedWord = new String[SplitedBySpace.length];


    }
}
