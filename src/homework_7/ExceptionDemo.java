package homework_7;

public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();

        System.out.println("Метод 1:");
        demo.methodOne();

        System.out.println("\nМетод 2:");
        demo.methodTwo();

        System.out.println("\nМетод 3:");
        demo.methodThree();

        System.out.println("\nМетод 4:");
        demo.methodFour();
    }

    // Метод 1: Использование простого блока try-catch
    public void methodOne() {
        try {
            int result = 10 / 0; // Делим на ноль, чтобы спровоцировать исключение
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: деление на ноль");
        }
    }

    // Метод 2: Использование нескольких блоков catch
    public void methodTwo() {
        try {
            int[] array = new int[5];
            array[10] = 20; // Доступ к несуществующему элементу массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: выход за границы массива");
        } catch (NullPointerException e) {
            System.out.println("Исключение: попытка обращения к null");
        }
    }

    // Метод 3: Использование multi-catch
    public void methodThree() {
        try {
            String str = null;
            int length = str.length(); // Попытка получить длину строки, которая равна null
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение: либо NullPointerException, либо ArrayIndexOutOfBoundsException");
        }
    }

    // Метод 4: Использование блока finally
    public void methodFour() {
        try {
            throw new RuntimeException("Искусственное исключение"); // Искусственно генерируем исключение
        } catch (RuntimeException e) {
            System.out.println("Исключение поймано: " + e.getMessage());
        } finally {
            System.out.println("Блок finally всегда выполняется");
        }
    }
}