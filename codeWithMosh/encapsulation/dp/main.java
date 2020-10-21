package encapsulation.dp;

public class main {
    public static void main(String[] args)
    {
        var account = new Account();
        account.deposit(100);
        System.out.println("Current balance is : "+account.getBalance());

        account.withdraw(25);
        System.out.println("Current balance is : "+account.getBalance());


    }
}
