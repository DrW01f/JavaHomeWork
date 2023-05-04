import java.util.Scanner;

public class Task1 {
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    public static void main(String[] args){
        calculations();
    } 

    public static void calculations(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int result = 0; 
        for (int i = 0; i <= Integer.parseInt(number); i++) {
            result += i;
        }
        
        System.out.println("Результат равен: " + result);

    }
}
