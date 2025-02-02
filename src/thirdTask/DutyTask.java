package thirdTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DutyTask {
    private static final List<Task> tasks = new ArrayList<>();

    public static void dutyTaskInput() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. add new duty \n" +
                    "2. Complete an existing task \n " +
                    "3. Show tasks list \n" +
                    "4. exit"
            );
            System.out.print("choose an option :");
            String option = scanner.next();
            switch (option) {
                case "1":
                    addDuty(scanner);
                    break;
                case "2":
                    completeTask(scanner);
                    break;
                case "3":
                    showList();
                    break;
                case "4":
                    System.out.println("exit the program");
                    break;
            }

        }

    }

    private static void addDuty(Scanner scanner) {
        System.out.print("Enter new duty :");
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Tamponu temizler
        }
        String newDuty = scanner.nextLine();
        tasks.add(new Task(newDuty, false));
        System.out.println("You added newDuty");
    }

    private static void completeTask(Scanner scanner) {
        System.out.print("Which one you want to complete :");
        int choose = scanner.nextInt();
        if (choose <= tasks.size() && choose > 0) {
            Task task = tasks.get(choose - 1);
            task.setFinished(true);
            System.out.println("You completed task");
        } else {
            System.out.println("You enter a true value");
        }
    }

    private static void showList() {
        if (tasks.isEmpty()) {
            System.out.println("dutys is empty");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + " - " + tasks.get(i));
            }
        }
    }
}
