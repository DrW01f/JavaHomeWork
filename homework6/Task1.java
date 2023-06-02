import java.util.*;

public class Task1 {
/*Подумать над структурой класса Ноутбук для магазина техники -     
выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     * 
    */

    public static void main(String[] args) {

    Notebook note1 = new Notebook(30_000, 4, 128, "windows7", "black", 2);
    Notebook note2 = new Notebook(100_000, 16, 1024, "windows10", "white", 8);
    Notebook note3 = new Notebook(200_000, 32, 2048, "windows11", "gold", 16);
    Notebook note4 = new Notebook(70_000, 8, 512, "windows7", "black", 4);
    Notebook note5 = new Notebook(50_000, 4, 256, "windows8", "black", 4);
    Notebook note6 = new Notebook(90_000, 16, 512, "windows10", "white", 8);
    Notebook note7 = new Notebook(60_000, 8, 256, "windows8", "black", 4);
    Notebook note8 = new Notebook(30_000, 4, 128, "windows7", "black", 2);

    Set<Notebook> notebookss = new HashSet<>();
    notebookss.add(note1);
    notebookss.add(note2);
    notebookss.add(note3);
    notebookss.add(note4);
    notebookss.add(note5);
    notebookss.add(note6);
    notebookss.add(note7);
    notebookss.add(note8);

    Scanner scanner = new Scanner(System.in);
    
    while (true){
        findMenu();
        int filterNumber = scanner.nextInt();

    }


    }
    
    public static void findMenu(){

        System.out.println("Выберите условия для фильтра: \n");
        System.out.println("1   Стоимость");
        System.out.println("2   Объем оперативной памяти");
        System.out.println("3   Объем жесткого диска");
        System.out.println("4   Операционная система");
        System.out.println("5   Цвет");
        System.out.println("6   Объем видеокарты");
        System.out.println("0   Выход");
    }


}
    

