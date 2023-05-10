import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        List<Integer> list = createList();
        evenCountDeleter(list);

    }

    public static List<Integer> createList() {
        System.out.println("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите минимальное число: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите максимальное число: ");
        int max = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        System.out.println(list);
        return list;
    }

    public static void evenCountDeleter(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

}