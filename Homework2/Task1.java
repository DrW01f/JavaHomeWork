import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
/*Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
Используйте StringBuilder для подготовки ответа
Исходная json строка это просто String !!! Для работы используйте методы String, такие 
как replace, split, substring и т.д. по необходимости
Создать метод, который запишет результат работы в файл. Обработайте исключения и 
запишите ошибки в лог файл.
2. *Получить исходную json строку из файла, используя FileReader или Scanner */       
String str =  readFile();
System.out.println(newString(str));


}

    
public static String readFile(){
    File file = new File("Homework2/text.json");
    Scanner scanner = null;
    try {
        scanner = new Scanner(file);
    } catch (FileNotFoundException ex) {
        System.out.println("Внимание! Ошибка:");
        ex.printStackTrace();
    }
    String res = "";
    while (scanner.hasNext()){
        res += scanner.nextLine() + "\n";
    }
    System.out.println(res);
    return res;
    }

public static String newString(String str){
    StringBuilder stringBuilder = new StringBuilder();
    str = str.replace(":", ",")
    .replaceAll("[^A-Za-zА-Яа-я-0-9-,]", "")
    .replace("фамилия", "Студент")
    .replace("оценка", "получил")
    .replace("предмет", "по предмету");

    String[] myString = str.split(",");
    for (int i = 0; i < myString.length; i++) {
        if (myString[i].equals("Студент") && i != 0) {
            stringBuilder.append("\n");
        }
        stringBuilder.append(myString[i] + " ");
        }   
return stringBuilder.toString();
}



}