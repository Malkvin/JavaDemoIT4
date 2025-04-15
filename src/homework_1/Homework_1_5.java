package homework_1;
//Задача 5:
//В переменных q и w хранятся два натуральных числа. Создайте программу,
//выводящую на экран результат деления q на w с остатком. Пример вывода
//программы (для случая, когда в q хранится 21, а в w хранится 8):
//        21 / 8 = 2 и 5 в остатке.
public class Homework_1_5 {
    public static void main(String[] args) {
        int q = 18;
        int w = 7;
        int first = q / w;
        int second = q % w;
        String result = q + " / " + w + " = " + first + " и " + second + " в остатке.";
        System.out.println(result);
    }
}
