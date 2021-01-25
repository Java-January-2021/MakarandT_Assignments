public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        BankAccount BA1 = new BankAccount();
        BA1.Deposit("checking", 500);
        BA1.withdraw("checking", 100);

        BA1.Deposit("saving", 5000);
        BA1.withdraw("saving", 1000);
        System.out.println("Checking balance =" + BA1.getCheckingBalance());
        System.out.println("Saving balance = " + BA1.getSavingBalance());
        // System.out.println(BA1.getaccountNumber());
        // System.out.println(getSavingBalance());
        BA1.TABFC();

        // new cust 2 BankAccount BA1 = new BankAccount();
        // new cust 2 BankAccount BA1 = new BankAccount();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        BankAccount newcust2 = new BankAccount();

        newcust2.Deposit("checking", 80000);
        newcust2.withdraw("checking", 10000);

        newcust2.Deposit("saving", 70000);
        newcust2.withdraw("saving", 5000);
        System.out.println("Checking balance =" + newcust2.getCheckingBalance());
        System.out.println("Saving balance = " + newcust2.getSavingBalance());
        // System.out.println(BA1.getaccountNumber());
        // System.out.println(getSavingBalance());
        newcust2.TABFC();

        newcust2.NumberOfaccounts();
        // new cust 2 BankAccount BA1 = new BankAccount();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        BankAccount BA3 = new BankAccount();

        BA3.Deposit("checking", 1000);
        BA3.withdraw("checking", 80050);

        BA3.Deposit("saving", 1000);
        BA3.withdraw("saving", 50000);
        System.out.println("Checking balance =" + BA3.getCheckingBalance());
        System.out.println("Saving balance = " + BA3.getSavingBalance());
        // System.out.println(BA1.getaccountNumber());
        // System.out.println(getSavingBalance());
        BA3.TABFC();

        BA3.NumberOfaccounts();

    }

}
