package homework_5;

public class Main {
    public static void main(String[] args) {
        // Создание трёх объектов кредитных карт
        CreditCard card1 = new CreditCard("1234-5678-9012", 10000.00);
        CreditCard card2 = new CreditCard("9876-5432-1098", 20000.00);
        CreditCard card3 = new CreditCard("4321-8765-2109", 3500.00);

        // Пополнение первых двух карт
        card1.deposit(455.00);
        card2.deposit(1500.00);

        // Снятие с третьей карты
        card3.withdraw(500.00);

        // Показываем состояние каждой карты
        System.out.println("Первая карта");
        card1.displayInfo();

        System.out.println("Вторая карта");
        card2.displayInfo();

        System.out.println("Третья карта");
        card3.displayInfo();
    }
}
