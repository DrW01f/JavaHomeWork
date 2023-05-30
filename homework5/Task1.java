

public class Task1 {
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
может иметь несколько телефонов.*/
    public static void main(String[] args) {

    PhoneBook book = new PhoneBook();
    book.add("123456789", "User1");
    book.add("11 111 11", "User11");
    book.add("222222222", "User2");
    book.add("333", "User3");
    book.add("11", "User1");
    System.out.println(book.getToList());
    


    }
}


  
