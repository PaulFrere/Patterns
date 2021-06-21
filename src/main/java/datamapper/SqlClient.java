package datamapper;

import java.sql.*;

public class SqlClient {

    private static Connection connection;
    private static Statement statement;
    private final Cash cash;

    public SqlClient(Cash cash) {
        this.cash = cash;
    }

    void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:Patternbase.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    People findById(int id) {
        if(cash.getPeopleFromCash(id)!=null){
            return cash.getPeopleFromCash(id);
        }else {
            String query = String.format("select * from people where id='%s'", id);
            try (ResultSet set = statement.executeQuery(query)) {
                if (set.next()) {
                    do {
                        People people = new People();
                        people.setId(set.getInt(1));
                        people.setName(set.getString(2));
                        people.setAge(set.getInt(3));
                        return people;
                    } while (set.next());
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return null;}

    }

    void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}