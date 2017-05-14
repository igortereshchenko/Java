import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static OracleConnection.OracleConnection.getOracleConnection;

/**
 * Created by Igor on 5/14/2017.
 */
public class TestConnection {

    public static void main(String[] args) throws SQLException {


        String selectTableSQL = " SELECT * from TABLE1";

        Statement statement = null;

        try {

            Connection connection= getOracleConnection();

            statement = connection.createStatement();


            // get data from DB
            ResultSet rs = statement.executeQuery(selectTableSQL);

            // fetch data
            while (rs.next()) {
                String field = rs.getString("COLUMN1");


                System.out.println("field : " + field);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
