package factory;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Current Account");
    }
}
