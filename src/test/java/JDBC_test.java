import java.sql.*;

public class JDBC_test {
    /*
    type: jdbc:mysql
    host/ip: 45.87.83.5
    port: 3306
    database_name: u168183796_qaloantec
    username: u168183796_qaloantecuser
    password: 0&vG1A/MuWN

    url = jdbc:mysql://45.87.83.5/u168183796_qaloantec
    username: u168183796_qaloantecuser
    password: 0&vG1A/MuWN

    */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

       Connection connection=DriverManager.getConnection("jdbc:mysql://45.87.83.5/u168183796_qaloantec","u168183796_qaloantecuser",
               "0&vG1A/MuWN");

       String query="SELECT * FROM u168183796_qaloantec.users;";

        Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet=statement.executeQuery(query);

        resultSet.next();
        System.out.println(resultSet.getString("firstname"));
        resultSet.absolute(100);
        System.out.println(resultSet.getString("email"));


    }
}
