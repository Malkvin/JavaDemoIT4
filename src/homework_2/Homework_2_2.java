package homework_2;

import java.util.Scanner;

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
public class Homework_2_2 {
    public static void main(String[] args) {
        System.out.println("Введите температуру");
        try (Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Warm");
            } else if (t > -20 && t <= -5) {
                System.out.println("Normal");
            } else { // t <= -20
                System.out.println("Cold");
            }

        }
    }
}