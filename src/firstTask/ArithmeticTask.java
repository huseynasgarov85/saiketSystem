package firstTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticTask {
    private static Integer counter = 0;

    public static void ArithmeticTaskInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.add \n" + "2.subtract \n" + "3. multiply \n" + "4. divide");

        System.out.print("which one you want to select ? : ");
        String select = scanner.next();


        while (true) {
            try {
                System.out.println("Please enter two number ");
                System.out.print("First one :");
                Double num1 = scanner.nextDouble();
                System.out.print("Second one :");
                Double num2 = scanner.nextDouble();
                switch (select) {
                    case "1":
                        System.out.println(add(num1, num2));
                        break;
                    case "2":
                        System.out.println(subtract(num1, num2));
                        break;
                    case "3":
                        System.out.println(multiply(num1, num2));
                        break;
                    case "4":
                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed.");
                            break;
                        }
                        System.out.println(divide(num1, num2));
                        break;
                    default:
                        System.out.println("please select the correct option");
                        break;
                }
                if (counter == 1) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input please enter numeric value");
                scanner.nextLine();
            }
        }
    }

    private static Double add(Double num1, Double num2) {
        counter++;
        return num1 + num2;
    }

    private static Double subtract(Double num1, Double num2) {
        counter++;
        return num1 - num2;
    }

    private static Double multiply(Double num1, Double num2) {
        counter++;
        return num1 * num2;
    }

    private static Double divide(Double num1, Double num2) {
        counter++;
        return num1 / num2;
    }
}
