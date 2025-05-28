package homework_9;
//Пользователь вводит набор чисел в виде одной строки с клавиатуры.
//Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
//Вывести результат на экран.
//При решении использовать коллекции.

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework_9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую: ");
        String input = scanner.nextLine();

        // Преобразование строки в список чисел
        String[] numbers = input.split(", ");
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));

        // Вывод результата
        System.out.println(STR."Набор уникальных чисел: \{String.join(", ", uniqueNumbers)}");

        scanner.close();
    }
}
