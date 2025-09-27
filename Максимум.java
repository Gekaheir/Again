import java.util.Scanner;

public class Максимум {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float b = scanner.nextFloat();
        System.out.println("Введите третье число: ");
        float c = scanner.nextFloat();
        scanner.close();
        float min = Math.min(Math.min(a, b), c);
        System.out.println("Максимальное число: " + min);
    }
}
