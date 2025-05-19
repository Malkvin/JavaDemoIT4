package homework_8;
//Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
//        возрастания значений их длины.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Homework_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String thirdString = scanner.nextLine();

        String[] strings = {firstString, secondString, thirdString};
        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки упорядочены по возрастанию длины:");
        for (String s : strings) {
            System.out.println(s + " (" + s.length() + ")");
        }

        scanner.close();
    }
}
