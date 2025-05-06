package homework_5;
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке. Напишите
//программу, которая создает три объекта класса CreditCard у которых заданы
//номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и
//снимите с третьей. Выведите на экран текущее состояние всех трех карточек

public class CreditCard {
    String accountNumber;
    double balance;

    public CreditCard(String accountNumber, double initialBalance){  //Конструктор кредитки
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {             // Метод для пополнения баланса
        if (amount > 0) {          // Проверка на положительную сумму
            balance += amount;
        }
    }
    public void withdraw(double amount) {      // Метод для снятия некоторой суммы
        if (balance >= amount && amount > 0) {   // Убедимся, что достаточно средств и сумма больше нуля
            balance -= amount;
        }
    }
    public void displayInfo() {             //Метод текущую информацию о карточке
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущая сумма: " + balance);
        System.out.println("-------------------------------");
    }


}
