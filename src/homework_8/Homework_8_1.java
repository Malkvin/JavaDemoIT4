package homework_8;
//Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
//        Вывести найденные строки и их длину.

import java.util.Scanner;

public class Homework_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String thirdString = scanner.nextLine();

        String shortestString = findShortest(firstString, secondString, thirdString);
        String longestString = findLongest(firstString, secondString, thirdString);

        System.out.println("Самая короткая строка: " + shortestString + ", её длина: " + shortestString.length());
        System.out.println("Самая длинная строка: " + longestString + ", её длина: " + longestString.length());

        scanner.close();
    }

    private static String findShortest(String... strings) {
        String shortest = strings[0];
        for (String s : strings) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        return shortest;
    }

    private static String findLongest(String... strings) {
        String longest = strings[0];
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }
}
