package fourthTask;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void guessGameInput()  {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(0,100);
        int counter = 0;
        while (true){
            System.out.print("Enter number :");
            int userNumber = scanner.nextInt();
            if (number < userNumber){
                System.out.println("The estimate is too high!");
            } else if (number > userNumber) {
                System.out.println("The estimate is too low!");
            } else {
                counter++;
                System.out.print("Congratulations! You guessed it. ");
                break;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
