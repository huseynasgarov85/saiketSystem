package sixthTask;

public class BankingTask {
    private String name;
    private String surname;
    private Double balance;
    private String pan;

    public BankingTask(String name, String surname, Double balance, String pan) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.pan = pan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return "BankingTask{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", pan='" + pan + '\'' +
                '}';
    }
}
