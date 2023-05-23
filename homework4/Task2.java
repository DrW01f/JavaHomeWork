import java.util.LinkedList;

public class Task2 {
/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        enqueue("Первый элемент",list);
        enqueue("Второй элемент",list);
        System.out.println(list);
        enqueue("Новый элемент", list);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println("Возвращенный элемент: " + first(list));
    }
    
    public static void enqueue(String elem, LinkedList<String> list){
        list.add(elem);
    }
    
    public static String dequeue(LinkedList<String> list){
        String a = list.removeFirst();
        return a;
    }
    
    public static String first(LinkedList<String> list){
        String firstElem = list.getFirst();
        return firstElem;
    }

}
