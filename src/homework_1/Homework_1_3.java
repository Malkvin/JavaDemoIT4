package homework_1;
//Задача 3:
//В переменной n хранится трёхзначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
//результате мы должны получить 9 (1+2+6).
public class Homework_1_3 {
    public static void main(String[] args) {
        int n = 946;
//        Забираем левое число
        int a = n / 100;
//        Забираем среднее число
        int b = (n % 100) / 10;
//        Забираем правое число
        int c = n % 10;
//        Считаем сумму
        int sumN = a+b+c;
        System.out.println(sumN);
    }
}
