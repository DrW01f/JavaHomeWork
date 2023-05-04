import java.util.Scanner;

public class Task4 {
    /*Реализовать простой калькулятор (введите первое число, введите второе число, 
    введите требуемую операцию, ответ)*/
    public static void main(String[] args) {
        while(true){
            System.out.println("Вас приветствует личинка Skynet!"); 
            System.out.println("Введите первое число: ");
            Double firstNumber = inputFunc();
            System.out.println("Введите второе число: ");
            Double secondNumber = inputFunc();
            String result = calculations(firstNumber, secondNumber);
            System.out.println(result);
            System.out.println("Хотите продолжить? 1 - да, 0 - нет");
            Double answer = inputFunc();
            if(answer == 0){
                break;
            }
        }
    }

    public static String calculations(Double a, Double b) {
        System.out.println("Пока доступны слудеющие оперрации: ");
        System.out.println("1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String answer = "";
        switch (choice) {
            case "1":
                answer = Double.toString((a+b));
                break;
            case "2":
                answer = Double.toString((a-b));
                break;
            case "3":
                answer = Double.toString((a*b));
                break;
            case "4":
                if (b == 0)
                {
                    answer = "На ноль делить нельзя";
                }
                else {
                    answer = Double.toString((a/b));   
                } 
                break;
        }
        return answer;        
    }

    public static Double inputFunc() {        
        Scanner scanner = new Scanner(System.in);
        Double number = Double.parseDouble(scanner.nextLine());
        return number;
    }
}
