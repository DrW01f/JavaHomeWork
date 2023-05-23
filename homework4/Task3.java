import java.util.LinkedList;
import java.util.ListIterator;

public class Task3 {
    /*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
    Используйте итератор */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        System.out.println(list);
        
        Double sum = 0d;
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasNext()){
            Integer elem=iterator.next();
            sum += elem;
            System.out.println(elem);                       
        }
        System.out.println(sum/list.size()); 
    }

}
