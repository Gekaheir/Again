import java.util.Scanner;

public class ТаблицаУмножения {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}