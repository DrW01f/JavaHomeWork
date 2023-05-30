import java.util.ArrayList;

public class Task1 {
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
может иметь несколько телефонов.*/
    public static void main(String[] args) {

    PhoneBook book = new PhoneBook();
    //Номера не складываем, поэтому пусть будут строками
    book.add("123456789", "User1"); 
    book.add("11 111 11", "User11");
    book.add("222222222", "User2");
    book.add("333", "User3");
    book.add("3334", "User3");
    book.add("11", "User1");
    System.out.println(book.getToList());
    ArrayList<String> searchName = book.searchByName("User1");
    System.out.println(searchName);
    searchName = book.searchByName("User3");
    System.out.println(searchName);
    String searchContact = book.searchByNumber("222222222");
    System.out.println(searchContact);
    System.out.println(book.getAllList());

    }
}


  
