package datamapper;

public class Controller {
    SqlClient sqlClient;
    People people;

    public Controller(SqlClient sqlClient) {
        this.sqlClient = sqlClient;
    }

    public String getNamePeopleById (int id){
        people = sqlClient.findById(id);
        return people.getName();
    }

    public int getAgePeopleById (int id){
        people = sqlClient.findById(id);
        return people.getAge();
    }
}
