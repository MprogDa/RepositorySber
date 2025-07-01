package unit5.unit5_4;

import java.util.*;
import java.io.*;

public class TextCount {

    /**
     * Подсчитывает частоту вхождения слов
     * @param file ссылка на файл
     */
    public static String count(String file){
        HashMap<String, Integer> count = new HashMap<>();
        String str = "Результат (по убыванию):\n";
        char[] symbol = new char[] {',', '.', '/', '@', '#', '—', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', '-', '+', '<', '>', '?', '!', '/', '\\'};


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                for (char s: symbol) line = line.replace(s, ' ');

                String[] words = line.split(" ");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        count.put(word, count.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            return "Ошибка чтения файла";
        }

        // сортировка по убыванию
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(count.entrySet());
        sorted.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));


        for (Map.Entry<String, Integer> entry : sorted) str += entry.getKey() + " : " + entry.getValue() + "\n";

        return str;
    }
}
