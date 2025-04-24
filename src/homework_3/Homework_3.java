package homework_3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Задача 1:
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
//Задача 2:
//Найти минимальный - максимальный элементы и вывести в консоль.
//Задача 3:
//Найти индексы минимального и максимального элементов и вывести в консоль.
//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
//вывести сообщение, что их нет.
//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй
//и предпоследний и т.д.
//Задача 6:
//Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)
public class Homework_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int massSize = scanner.nextInt();

        int[] mass = new int[massSize];
        for (int i = 0; i < massSize; i++) {
            mass[i] = (int) (Math.random() * 100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(mass));

        System.out.print("Массив в обратном порядке: ");  // Массив в обрантном порядке
        for (int i = massSize - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        System.out.println();
        int min = mass[0];                               //Находим минимальное значение
        for (int i = 1; i < massSize; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = mass[0];                                 //Находим максимальное значение
        for (int i = 1; i < massSize; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println();

        int index_min = 0;                               //Находим минимальный идекс
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == min) {
                index_min = i;
            }
        }
        System.out.print("Минимальное значение индекса: " + index_min);
        System.out.println();

        int index_max = 0;                               //Находим максимальный идекс
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == max) {
                index_max = i;
            }
        }
        System.out.print("Максимальное значение индекса: " + index_max);
        System.out.println();

        System.out.println();          //Подсчет нулей
        int nills = 0;
        for (int i = 0; i < massSize; i++) {
            if (mass[i] == 0) {
                nills++;
            }
        }
        System.out.println(nills > 0 ? "Нулевых значений: " + nills : "Нулевые значения отсутствуют"); //Подсчет нулей

        for (int i = 0; i < massSize / 2; i++) {              //Переворачивание массива
            int a = mass[i];
            mass[i] = mass[(massSize - 1) - i];
            mass[(massSize - 1) - i] = a;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();

        boolean isAscend = true;                          //Сортировка массива
        for (int i = 1; i < massSize; i++) {
            if (mass[i] <= mass[i - 1]) {
                isAscend = false;
                break;
            }
        }
        if (isAscend) {
            System.out.println("Массив возрастающая последовательность");
        } else {
            System.out.println("Массив не возрастающая последовательность");
        }
        scanner.close();
    }
}

