import java.util.Scanner;

public class Task2 {
    // Вычислить n! (произведение чисел от 1 до n)
    public static void main(String[] args){
        calculations();
    }   

    public static void calculations() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = 1; //для умножения 1
        if (number == 0) {
            System.out.println("Результат равен 0");
        }
        else{
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Результат равен: " + result);
        }
    }
}
