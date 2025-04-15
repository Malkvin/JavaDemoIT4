package homework_1;
//Задача 2:
//В переменной n хранится двузначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
//результате мы должны получить 8 (2 + 6).
public class Homework_1_2 {
    public static void main(String[] args) {
        int n = 65;
//        Забираем левое число
        int a = n / 10;
//        Забираем правое число
        int b = n % 10;
//        Считаем сумму
        int sumN = a+b;

        System.out.println(sumN);
    }
}
