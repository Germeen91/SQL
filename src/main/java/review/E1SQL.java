package review;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";

        Connection connection= DriverManager.getConnection(dbUrl,userName,password);
        Statement statement=connection.createStatement();
        String query="select * from employee";
        ResultSet rs= statement.executeQuery(query);
        while (rs.next()){
            String id=rs.getString(1);
            String salary=rs.getString(2);
            String grade=rs.getString(3);
            String department=rs.getString(4);

            System.out.println(id+" "+salary+" "+grade+" "+department);
        }

















    }
}
