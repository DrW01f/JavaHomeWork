import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    /*
     * Заполнить список названиями планет Солнечной системы в произвольном порядке с
     * повторениями. Вывести название каждой планеты и количество его повторений в
     * списке.
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Меркурий", "Венера", "Земля", "Марс",
                "Юпитер", "Сатурн", "Уран", "Нептун");
        List<String> newList = solarSystem(list, 20);
        System.out.println(newList);
        counter(newList);
    }

    public static List solarSystem(List list, int size) {

        List<String> newList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            newList.add((String) list.get((int) (Math.random() * (list.size() + 1) - 1)));
        }
        return newList;
    }

    private static void counter(List list) {
        int count = 0;
        Set<String> set = new LinkedHashSet<>(list);
        for (String planet : set) {
            System.out.printf("\n%s %s ", Collections.frequency(list, planet), planet);
        }
    }
}
