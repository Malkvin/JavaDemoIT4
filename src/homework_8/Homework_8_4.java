package homework_8;
//Ввести 3 строки с консоли. Найти слово, состоящее только из различных
//        символов. Если таких слов несколько, найти первое из них.

import java.util.HashSet;
import java.util.Scanner;

public class Homework_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine().trim();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine().trim();

        System.out.println("Введите третью строку:");
        String thirdString = scanner.nextLine().trim();

        String uniqueWord = findFirstUniqueWord(firstString, secondString, thirdString);

        if (uniqueWord != null) {
            System.out.println("Первое слово с уникальными символами: " + uniqueWord);
        } else {
            System.out.println("Нет слов с уникальными символами.");
        }

        scanner.close();
    }

    private static String findFirstUniqueWord(String... words) {
        for (String word : words) {
            HashSet<Character> set = new HashSet<>();
            boolean hasDuplicates = false;
            for (char ch : word.toCharArray()) {
                if (!set.add(ch)) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (!hasDuplicates) {
                return word;
            }
        }
        return null;
    }
}
