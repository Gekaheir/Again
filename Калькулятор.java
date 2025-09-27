import java.util.Scanner;

public class Калькулятор {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.println("Введите операцию (+,-,/,*): ");
        String operation = scanner.next();
        scanner.close();
        double result;
        if (operation.equals("+")) {
            result = num1 + num2;
            System.out.println("Результат" + num1 + "+" + num2 + "=" + result);
        } else if (operation.equals("-")) {
            result = num1 - num2;
            System.out.println("Результат" + num1 + "-" + num2 + "=" + result);
        } else if (operation.equals("*")) {
            result = num1 * num2;
            System.out.println("Результат" + num1 + "*" + num2 + "=" + result);
        } else if (operation.equals("/")) {
            if (num2 !=0) {
                result = num1 / num2;
                System.out.println("Результат" + num1 + "/" + num2 + "=" + result);
            } else {
                System.out.println("Делить на ноль нельзя");
            }
        }
    }
}
