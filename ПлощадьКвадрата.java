import java.util.Scanner;
import java.lang.Math;

public class ПлощадьКвадрата {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int b = a * a;
        System.out.println("Площадь квадрата: " + b);
    }
}
