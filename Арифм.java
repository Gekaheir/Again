import java.util.Scanner;

    public class Арифм {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество чисел: ");
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            System.out.println("Введите " + size + " чисел:");
            for (int i = 0; i < size; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();}
            scanner.close();
            int sum = 0;
            for (int number : numbers) {
                sum += number;}
            double average = (double) sum / numbers.length;
            System.out.println("\nМассив чисел: " + java.util.Arrays.toString(numbers));
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее арифметическое: " + average);
        }
    }