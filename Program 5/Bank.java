class Account {
    String customerName;
    String accountNumber;
    double balance;

    public Account(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit done. New Balance: " + balance);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance);
    }

    public void addInterest(double rate) {
        double interest = balance * rate;
        deposit(interest);
    }
}

class CurrentAccount extends Account {
    double minBalance = 500;
    double serviceCharge = 20;

    public CurrentAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Balance below minimum balance. Service charge of " + serviceCharge + " applied.");
            balance -= serviceCharge;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("CHETHANA.C(1BM23CS077)");
        SavingsAccount s1 = new SavingsAccount("Ayu", "1", 1000);
        s1.deposit(200);
        s1.addInterest(0.08);
        s1.displayBalance();

        CurrentAccount c1 = new CurrentAccount("Smith", "2", 2000);
        c1.deposit(300);
        c1.withdraw(1000);
        c1.displayBalance();
    }
}
