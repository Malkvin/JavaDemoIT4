package homework_9;
//На вход поступает массив строк, верните Map<String, Boolean>, где каждая
//отдельная строка является ключом, и ее значение равно true, если эта строка
//встречается в массиве 2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"])→{"c": true}

import java.util.HashMap;
import java.util.Map;

public class Homework_9_3 {
    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "a", "c", "b"};
        String[] arr2 = {"c", "b", "a"};
        String[] arr3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(arr1)); // {"a": true, "b": true, "c": false}
        System.out.println(wordMultiple(arr2)); // {"a": false, "b": false, "c": false}
        System.out.println(wordMultiple(arr3)); // {"c": true}
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }

        return result;
    }
}
