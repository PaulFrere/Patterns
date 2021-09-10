import brige.CurrentAccount;
import brige.IciciBank;
import factory.Account;
import factory.AccountFactory;

public class Main {
    public static void main(String[] args) {


//       AccountFactory accountFactory = new AccountFactory();
//
//        Account savingAccount = accountFactory.getAccount("SAVING");
//        savingAccount.accountType();
//
//        Account currentAccount = accountFactory.getAccount("CURRENT");
//        currentAccount.accountType();
//
//        accountFactory = new AccountFactory();
//
//        savingAccount = accountFactory.getAccount("SAVING");
//        savingAccount.accountType();
//
//        currentAccount = accountFactory.getAccount("CURRENT");
//        currentAccount.accountType();


        IciciBank iciciBank = new IciciBank(new CurrentAccount());
        Account current = (Account) iciciBank.openAccount();
        current.accountType();

    }
}