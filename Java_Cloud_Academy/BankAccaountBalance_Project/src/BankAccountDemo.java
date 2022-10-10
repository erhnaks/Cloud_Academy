public class BankAccountDemo {
    public static void main(String[] args) {


        BankAccount myAccount = new BankAccount("Johnny", 2000);
        BankAccount yourAccount = new BankAccount("Maria", 5000);

        myAccount.deposit(2000);

        System.out.println(myAccount.getBalance());


        myAccount.withdraw(2000);

        System.out.println();

        System.out.println(myAccount.getBalance());


        yourAccount.deposit(7000);

        System.out.println();

        System.out.println("Your balance is: £" +yourAccount.getBalance() + " Account Holder: " + yourAccount.getOwner());


    } // end of main
}
