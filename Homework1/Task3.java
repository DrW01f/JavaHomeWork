import java.util.Scanner;

public class Task3 {
    /*
     * Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и
     * на себя без остатка)
     */
    public static void main(String[] args) {
        int number = inputFunc();
        System.out.println(findSimpleNumbers(number));
    }

    public static int inputFunc() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        return number;
    }

    public static String findSimpleNumbers(int number) {
        String trickyOut = "";
        int numberOfDivisions = 0; //кол-во делителей
        for (int i = 1; i <= number; i++) {
            //Проход всех чисел с подсчетом числа делителей 
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numberOfDivisions++;
                }
            }
            if (numberOfDivisions <= 2) {
                trickyOut += Integer.toString(i) + ", ";
            }        
            numberOfDivisions = 0;
        }
        return trickyOut;
    }
}
