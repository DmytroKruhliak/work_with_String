package exercise_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine(); // считал строку, любую, с пробелами
        String deleteSpaces = enteredString.replace(" ", ""); // удалил все пробелы
        String[] SplitedBySpace = deleteSpaces.split(""); // Запихнул строку без пробелов в массив
        String reversedWordStr = "";

        for (int i = SplitedBySpace.length; i != 0; i--) {
            reversedWordStr += SplitedBySpace[i - 1];
        }

        System.out.println((deleteSpaces.equalsIgnoreCase(reversedWordStr))
                ? "Ваша строка является Палиндромом"
                : "Ваша строка не является Палиндромом");
    }
}
