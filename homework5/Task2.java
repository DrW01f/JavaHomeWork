import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, 
    Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,
     Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, 
     Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, 
     Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая 
     найдет и выведет повторяющиеся имена с количеством повторений. 
     Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/

    public static void main(String[] args) {
        String[] namesAll = new String[]{"Иван Иванов", "Светлана Петрова",
        "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
        "Петр Чернышов", "Мария Федорова", "Марина Светлова",
        "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
        "Иван Мечников", "Петр Петин", "Иван Ежов"};
        
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

        for (String item : namesAll) { 
        int count = 0;
        String names = item.split(" ")[0];
        for (String find : namesAll) { 
            if (names.equals(find.split(" ")[0])) {
                count++;
            }            
        }
        
        if (map.containsKey(count)) {
            List<String> list = map.get(count);
            if (!list.contains(names)) {
                list.add(names);
            }

        } else {
            List<String> list = new ArrayList<>();
            list.add(names);
            map.put(count, list);
        }
        }
        System.out.println(map);
    }
}
