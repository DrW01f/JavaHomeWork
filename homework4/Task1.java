import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Task1 {
/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
 * “перевернутый” список. Постараться не обращаться к листу по индексам.
 */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println(list);
        reverse(list);
    }


    public static void reverse(LinkedList<String> argList){
    
        ListIterator<String> iterator = argList.listIterator(argList.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
            }    
        }
}