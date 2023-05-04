import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Task1 {
    public static void main(String[] args){
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
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
