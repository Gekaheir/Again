import java.util.Scanner;

public class ПлощадьКруга {
    public static void main(String[] args) {
        final double PI = 3.1454129;
        System.out.println("Введите радиус: ");
        Scanner scanner = new Scanner(System.in);
        double rad = scanner.nextDouble();
        System.out.println("Площадь круга : " + PI * rad);
        if (rad <= 10){
            double r = rad * 10;
            System.out.println("Площадь круга : " + r);}
        }
    }
