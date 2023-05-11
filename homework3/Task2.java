import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.IntSummaryStatistics;

public class Task2 {
    /* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее 
    арифметическое из этого списка. Collections.max()*/
    public static void main(String[] args) {
      
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 8, 5, 9, 4, 3, 2, 7, 1, 6, 3, 8);
        Collections.max(list, null);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }


}