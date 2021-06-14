package brige;

public class IciciBank extends Bank {

    public IciciBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("Open your account with ICICI Bank");
        return account;
    }
}
