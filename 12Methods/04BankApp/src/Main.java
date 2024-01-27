public class Main {
    public static void main(String[] args) {
        BankAccount sezer = new BankAccount(444, 3434);
        BankAccount hasan = new BankAccount(555, 23434);
        BankAccount ayse = new BankAccount(666, 234234);

        ayse.depositMoney(500);
        sezer.withdrawMoney(600);
        hasan.withdrawMoney(450);
        BankAccount.showBankSummary();

        ayse.compare(sezer);
        sezer.compare(hasan);
    }
}

class BankAccount {

    private int accountNumber;
    private int accountBalance;
    private static int totalBankBalance = 0;
    private static int totalAccountCount = 0;
    private static int operationCount = 0;

    public BankAccount(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        totalBankBalance += accountBalance;
        totalAccountCount++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void compare(BankAccount comparedAccount) {
        if (this.getAccountBalance() < comparedAccount.getAccountBalance()) {
            System.out.println(this.getAccountNumber() + "'s money is less than " + comparedAccount.getAccountNumber() + "'s money");
        } else if (this.getAccountBalance() > comparedAccount.getAccountBalance()) {
            System.out.println(this.getAccountNumber() + "'s money is more than " + comparedAccount.getAccountNumber() + "'s money");
        } else {
            System.out.println(this.getAccountNumber() + "'s money is equal to " + comparedAccount.getAccountNumber() + "'s money");
        }
    }

    public void depositMoney(int amount) {
        this.accountBalance += amount;
        operationCount++;
    }

    public void withdrawMoney(int amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            operationCount++;
            totalBankBalance -= amount;
        } else {
            System.out.println("Insufficient funds in your account");
        }
    }

    public static void showBankSummary() {

        System.out.println("Number of accounts in the bank: " + totalAccountCount);
        System.out.println("Total money in the bank: " + totalBankBalance);
        System.out.println("Total number of operations in the bank: " + operationCount);
    }
}