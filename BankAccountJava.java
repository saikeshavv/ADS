class BankAccount {
  
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Setting balance to 0.");
        }
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void setAccountHolderName(String name) {
        if (name != null && !name.isEmpty()) {
            this.accountHolderName = name;
        } else {
            System.out.println("Invalid name.");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "Rahul Sharma", 5000);

        account.displayAccountInfo();

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(10000); 
        account.deposit(-500);  

        account.displayAccountInfo();
    }
}