import java.util.Random;

public class BankAccount {
    // The class should have the following attributes: (string) account number,
    // (double) checking balance, (double) savings balance.
    private String accountNumber;
    private double checkingBalance = 0; // chaneg in cons
    private double savingBalance = 0;
    public static int countOfaccount;
    public static double allAccountBalance;
    private double amount;

    // constructor
    public BankAccount() {
        countOfaccount++;
        this.accountNumber = GenerateAccountNumber();
        // System.out.println(accountNumber);

    }

    // Create a class member (static) that has the number of accounts created thus
    // far.
    public static int NumberOfaccounts() {
        System.out.println("number of accounts " + countOfaccount);
        return countOfaccount;
    }

    // Create a class member (static) that tracks the total amount of money stored
    // in every account created.
    public static double totalMoneyInBank() {
        return allAccountBalance;

    }

    // Create a private method that returns a random ten digit account number.
    public String GenerateAccountNumber() {
        String randomNum = "";
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            randomNum += rand.nextInt(10);
        }
        System.out.println("Generated Bank account number" + randomNum);
        return randomNum;
    }

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // public void setCheckingBalance(double checkingBalance) {
    // this.checkingBalance = checkingBalance;
    // }

    // In the constructor, call the private method from above so that each user has
    // a random ten digit account.-done
    // In the constructor, be sure to increment the account count.-done

    // Create a getter method for the user's saving account balance
    public double getSavingBalance() {
        return savingBalance;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    // public void setSavingBalance(double savingBalance) {
    // this.savingBalance = savingBalance;
    // }

    // Create a method that will allow a user to deposit money into either the
    // checking or saving, be sure to add to total amount stored.
    public void Deposit(String accountype, double amount) {
        if (accountype == "checking") {
            checkingBalance = checkingBalance + amount;
            System.out.println("Checking balance after Deposit= " + checkingBalance);
        } else if (accountype == "saving") {
            savingBalance = savingBalance + amount;
            System.out.println("Saving balance after Deposit= " + savingBalance);
        } else {
            System.out.println("Wrong Account type");
        }
        allAccountBalance = allAccountBalance + amount;
        System.out.println("All Bank accounts balance = " + allAccountBalance);

    }

    public void withdraw(String accountype, double amount) {

        if (accountype == "checking") {
            if (amount > checkingBalance) {
                System.out.println("Insufficient balance");
                return;
            }
            checkingBalance = checkingBalance - amount;
            System.out.println("Checking balance after withdrawal= " + checkingBalance);
        } else if (accountype == "saving") {
            if (amount > savingBalance) {
                System.out.println("Insufficient balance");
                return;
            }
            savingBalance = savingBalance - amount;
            System.out.println("Saving balance after withdrawal= " + savingBalance);
        } else {
            System.out.println("Wrong Account type");
        }
        allAccountBalance = allAccountBalance - amount;
        System.out.println("All Bank accounts balance = " + allAccountBalance);

    }

    // Create a method to see the total money from the checking and saving
    public void TABFC() {
        double TotalaccoungBalanceForCust = getCheckingBalance() + getSavingBalance();
        System.out.println("Customer total balance =" + TotalaccoungBalanceForCust);
    }

}
