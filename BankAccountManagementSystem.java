// Superclass BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Method to be overridden in subclasses
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass SavingsAccount (Extends BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding displayAccountType method
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount (Extends BankAccount)
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding displayAccountType method
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount (Extends BankAccount)
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Overriding displayAccountType method
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Main class
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different bank accounts
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA54321", 3000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD67890", 10000, 12);

        // Displaying account details
        System.out.println("Bank Account Details:");
        System.out.println();
        savings.displayAccountDetails();
        savings.displayAccountType();
        System.out.println();
        checking.displayAccountDetails();
        checking.displayAccountType();
        System.out.println();
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}

//SampleOutput
//Bank Account Details:
//
//Account Number: SA12345
//Balance: 5000.0
//Account Type: Savings Account
//Interest Rate: 3.5%
//
//Account Number: CA54321
//Balance: 3000.0
//Account Type: Checking Account
//Withdrawal Limit: 1000.0
//
//Account Number: FD67890
//Balance: 10000.0
//Account Type: Fixed Deposit Account
//Maturity Period: 12 months

