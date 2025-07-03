public class CreateAccount {
    public static void main(String[] args) {
        Account ephyAccount = new Account(); // creating an object
        ephyAccount.accountNo = 1423;
        ephyAccount.accountName = "Ephy";
        ephyAccount.balance = 500;

        System.out.println("A/c no: " + ephyAccount.accountNo + "\nA/c name: " + ephyAccount.accountName + "\nBalance: "
                + ephyAccount.balance);
    }
}