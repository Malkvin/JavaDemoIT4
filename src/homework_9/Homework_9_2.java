package homework_9;
//Создать класс, который будет хранить в себе коллекцию с названиями
//животных. Реализовать методы удаления и добавления животных по
//следующим правилам: добавляется всегда в начало коллекции, а удаляется
//всегда из конца. Показать работу объекта этого класса в main методе другого
//класса.

import java.util.LinkedList;
import java.util.List;

public class Homework_9_2 {
    private final List<String> animals = new LinkedList<>();

    // Добавление животного в начало списка
    public void addAnimal(String animal) {
        animals.add(0, animal);
    }

    // Удаление последнего элемента списка
    public void removeLastAnimal() {
        if (!animals.isEmpty()) {
            animals.remove(animals.size() - 1);
        }
    }

    // Получение текущего содержимого коллекции
    public List<String> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Homework_9_2{" +
                "animals=" + animals +
                '}';
    }
}

// Класс для демонстрации работы
class Main {
    public static void main(String[] args) {
        Homework_9_2 collection = new Homework_9_2();

        // Добавление животных
        collection.addAnimal("Dog");
        collection.addAnimal("Cat");
        collection.addAnimal("Bird");
        collection.addAnimal("Mouse");

        System.out.println(STR."Коллекция животных: \{collection}");

        // Удаление последнего животного
        collection.removeLastAnimal();

        System.out.println(STR."После удаления последнего животного: \{collection}");
    }
}
