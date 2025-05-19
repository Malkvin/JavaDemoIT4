package homework_8;
//Вывести на консоль новую строку, которой задублирована каждая буква из
//        начальной строки. Например, "Hello" -> "HHeelllloo"
import java.util.Scanner;

public class Homework_8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String doubledString = doubleEachCharacter(input);

        System.out.println("Новая строка: " + doubledString);

        scanner.close();
    }

    private static String doubleEachCharacter(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
}
