public class BankAccount {

    private String owner;
    private int balance;


    public BankAccount(String owner) {
        this(owner, 0);

    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit should be minimum £1.00");
        } // end of if-else
    } // end of deposit


    public void withdraw(int moneyOut) {
        if (moneyOut > 0 && moneyOut <= balance) {
            balance -= moneyOut;
            System.out.println("You have withdrawn £" + moneyOut + ". Your remaining balance is £" + balance + ".");
        } else {
            System.out.println("You do not have enough fund in your account to withdraw");
        } // end of if-else
    } // end of withdraw

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        System.out.println("Your balance is:");
        return balance;
    }

}
