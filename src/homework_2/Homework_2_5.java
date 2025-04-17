package homework_2;

import java.util.Scanner;

/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */
public class Homework_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int sum = 0;
        while (scanner.hasNextInt()) {        //Проверяем что число положительное и целочисленное
            int a = scanner.nextInt();
            if (a <= 0) {
                if (a == 0) {
                    System.out.println("Введите значение больше 0");
                    return;
                }
                System.out.println("Вы ввели отрицательное число");
                return;
            }
            for (int i = 1; i < a + 1; i++) { //Счетчик
                sum = sum + i;
            }
            System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
            return;
        }
        System.out.println("Вы ввели не целое число");
        scanner.close();
    }
}