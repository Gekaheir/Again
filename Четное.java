import java.util.Scanner;

public class Четное {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("Число четное.");
        }else {
            System.out.println("Чиcло нечетное.");
        }
    }
}
