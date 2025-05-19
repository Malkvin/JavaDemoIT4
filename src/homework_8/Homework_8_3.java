package homework_8;
//Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
//        меньше средней, а также их длину
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String thirdString = scanner.nextLine();

        List<String> strings = new ArrayList<>();
        strings.add(firstString);
        strings.add(secondString);
        strings.add(thirdString);

        int totalLength = firstString.length() + secondString.length() + thirdString.length();
        int averageLength = totalLength / strings.size();

        System.out.println("Средняя длина строк: " + averageLength);

        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.println(s + " (" + s.length() + ")");
            }
        }

        scanner.close();
    }
}
