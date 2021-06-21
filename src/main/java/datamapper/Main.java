package datamapper;

public class Main {

    public static void main(String[] args) {

        Cash cashPeople = new Cash();
        SqlClient sqlClient = new SqlClient(cashPeople);

        sqlClient.connect();

        People people1 = sqlClient.findById(2);

        System.out.println(people1.getId());
        System.out.println(people1.getName());
        System.out.println(people1.getAge());

        cashPeople.addToCash(people1);

        People people2 = sqlClient.findById(3);
        System.out.println(people2.getId());
        System.out.println(people2.getName());
        System.out.println(people2.getAge());


        sqlClient.disconnect();
    }
}
