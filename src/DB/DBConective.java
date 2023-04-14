package DB;
import java.sql.*;

public class DBConective {
    public static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;

        } else {
            try {
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:/c:/DDD/PortalAluno/DBUSER.db";
                connection = DriverManager.getConnection(url);

                Statement statement = connection.createStatement();
                String query = "SELECT * FROM ALUNO";
                ResultSet resultSet = statement.executeQuery(query);
                while(resultSet.next()){
                    String nomeAluno = resultSet.getString("NM_ALUNO");
                    String emailAluno = resultSet.getString("EMAIL_ALUNO");
                    int idAluno = resultSet.getInt("ID_ALUNO");

                    System.out.println(nomeAluno+", "+emailAluno+", "+idAluno);
                }

            }
            catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static Object setConnection(String passWord, String nameUser, String emailUser) {
        if (connection != null) {
            return connection;
        } else {
            try {
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:/c:/DDD/PortalAluno/DBUSER.db";
                connection = DriverManager.getConnection(url);

                Statement statement = connection.createStatement();
                String query = "INSERT INTO ALUNO(NM_ALUNO,EMAIL_ALUNO,PASSWORD) VALUES('"+ nameUser+"','"+emailUser+"','"+passWord+"')";
                ResultSet resultSet = statement.executeQuery(query);

            }
            catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
}

