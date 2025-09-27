import java.util.ArrayList;
import java.util.List;

public class CarDataValidator {
    public static void main(String[] args) {
        double coolantTempe = 90.3; // градусы цельсия
        double engineRpms = 2500.3; // обороты двигателя
        double carSpeeds = 110.3; //скорость

        validateCarData (coolantTempe, engineRpms, carSpeeds);
    }

    public static void validateCarData(double temp, double rpm, double speed) {
        boolean isValid = true;
        List<String> errors = new ArrayList<>();
        if (temp < -40 || temp > 120) {
            errors.add("Температура двигателя: " + temp + "градусов цельсия. Проверьте охлаждающую жидкость.");
        }
        if (rpm < 0 || rpm > 7000) {
            errors.add("Обороты двигателя: " + rpm + "оборотов в минуту. Проверьте двигатель.");
        }
        if (speed < 0 || speed > 190) {
            errors.add("Скорость автомобиля: " + speed + "километров в час. Проверьте исправность спидометра.");
        }
        if (isValid) {
            System.out.println("Данные" + " Температура: " + temp + "\nОбороты: " + rpm + "\nСкорость: " + speed + "\nВсе исправно.");
        } else {
            System.out.println("Ошибки:");
            for (String error : errors) {
                System.out.println(" - " + error);
            }
        }

    }
}
