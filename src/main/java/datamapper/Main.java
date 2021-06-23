package datamapper;

public class Main {

    public static void main(String[] args) {

        Cash cashPeople = new Cash();
        SqlClient sqlClient = new SqlClient(cashPeople);
        Controller Controller= new Controller(sqlClient);

        System.out.println(Controller.getNamePeopleById(2));

    }
}
