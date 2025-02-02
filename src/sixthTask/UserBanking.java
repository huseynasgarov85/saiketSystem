package sixthTask;

import java.util.*;

public class UserBanking extends BankingTask {
    private static final List<BankingTask> bankingTasks = new ArrayList<>();
    public UserBanking(String name, String surname, Double balance, String pan) {
        super(name, surname, balance, pan);
    }
    public static void userController() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomPanNumber = random.nextInt(1000000, 10000000);
        String panNumber;
        while (true) {
            System.out.println("1. add a new user account in the bank \n" +
                    "2. put money into the account \n" +
                    "3. withdraw money from the account \n" +
                    "4. Displays account balance"
            );
            System.out.print("choose one option :");
            String option = scanner.next();
            panNumber = Integer.toString(randomPanNumber);
            switch (option) {
                case "1":
                    addNewUser(panNumber, scanner);
                    break;
                case "2":
                    addBalanceIntoCard(scanner);
                    break;
                case "3":
                    withDrawMoney(scanner);
                    break;
                case "4":
                    displayAllAccounts();
                    break;
                default:
                    System.out.println("Please choose true option");
                    break;
            }
        }
    }

    private static void addNewUser(String panNumber, Scanner scanner) {
        System.out.print("Enter name :");
        String name = scanner.next();
        System.out.print("Enter surname :");
        String surname = scanner.next();
        System.out.print("Enter balance :");
        Double balance = scanner.nextDouble();
        UserBanking userBanking = new UserBanking(name, surname, balance, panNumber);
        bankingTasks.add(userBanking);
        System.out.println("You added user successfully");
        System.out.println("name" + "-" + userBanking.getName());
        System.out.println("surname" + "-" + userBanking.getSurname());
        System.out.println("balance" + "-" + userBanking.getBalance());
        System.out.println("panNumber" + "-" + userBanking.getPan());
    }

    private static void addBalanceIntoCard(Scanner scanner) {
        int counter = 0;
        while (true) {
            System.out.print("Please enter your pan number :");
            String panNumber = scanner.next();
            for (BankingTask bankingTask : bankingTasks) {
                if (bankingTask.getPan().equals(panNumber)) {
                    System.out.print("how much money you want to add your balance :");
                    double addMoney = scanner.nextDouble();
                    if (addMoney > 0) {
                        bankingTask.setBalance(addMoney + bankingTask.getBalance());
                        counter++;
                        break;
                    }
                }
            }
            if (counter == 1) {
                break;
            }
            System.out.println("Please write true panNumber and after apply");
        }
    }

    private static void withDrawMoney(Scanner scanner) {
        int counter = 0;
        while (true) {
            System.out.print("Please enter your pan number :");
            String panNumber = scanner.next();
            for (BankingTask bankingTask : bankingTasks) {
                if (Objects.equals(panNumber, bankingTask.getPan())) {
                    System.out.print("how much money you want to withdraw :");
                    double withdrawMoneyBalance = scanner.nextDouble();
                    if (withdrawMoneyBalance > bankingTask.getBalance()) {
                        throw new RuntimeException("withdraw money is higher than your balance");
                    } else {
                        bankingTask.setBalance(bankingTask.getBalance() - withdrawMoneyBalance);
                        counter++;
                        break;
                    }
                }
            }
            if (counter == 1) {
                break;
            }
            System.out.println("Please write true panNumber and after  apply");
        }
    }
    private static void displayAllAccounts() {
        System.out.println("This all accounts : ");
        for (BankingTask bankingTask : bankingTasks) {
            System.out.println("name" + "-" + bankingTask.getName());
            System.out.println("surname" + "-" + bankingTask.getSurname());
            System.out.println("balance" + "-" + bankingTask.getBalance());
            System.out.println("panNumber" + "-" + bankingTask.getPan());
        }
    }
}
