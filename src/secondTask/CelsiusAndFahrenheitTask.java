package secondTask;

import java.util.Objects;
import java.util.Scanner;

public class CelsiusAndFahrenheitTask {

    public static void CelsiusAndFahrenheitTaskInput() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Celsius \n" + "2. Fahrenheit");
            System.out.print("Select one option :");
            String select = scanner.next();
            if (Objects.equals(select, "1")) {
                System.out.print("Insert one value :");
                double num = scanner.nextInt();
                double result = celsiusToFahrenheit(num);
                System.out.println(num + " celsius " + "= " + result + " fahrenheit");
                break;
            } else if (Objects.equals(select, "2")) {
                System.out.print("Insert one value :");
                double num = scanner.nextInt();
                double value = FahrenheitToCelsius(num);
                System.out.println(num + " fahrenheit " + "= " + value + " celsius");
                break;
            } else{
                System.out.println("Invalid option please select valid option");
            }
        }

    }

    private static double celsiusToFahrenheit(double number) {
       return (number * 9 / 5) + 32;
    }

    private static double FahrenheitToCelsius(double number) {
       return (number - 32) * 5/9;
    }
}
