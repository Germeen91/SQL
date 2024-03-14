package org.example.class1;


import java.sql.*;

public class E1SQL {
    public static void main(String[] args) throws SQLException {

// SQL dependency

        // variable dbUrl .. contains all data about the server ,database and everything
        // jdbc .. it is api set of interfaces and classes help us build api from java to execute query CONNECT with[mysql] datatype of database
       // 3.239.... address of the server our data where are located
        // this server has schema [ batch16 and syntaxhrm_mysql]


        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
        // Creates the connection between java program and the database
        Connection connection= DriverManager.getConnection(dbUrl,userName,password); // DriverManager from sql
        // Takes our queries executes them and brings the results back
        // my java in usa and data base in india so need statement interface
        Statement statement=connection.createStatement();
        String query="select * from person";
        ResultSet rs= statement.executeQuery(query); // set row at the time
        while (rs.next()){ // all row one by one  [next has how many row /number of iteration will iterate and set condition true auto]
            String id=rs.getString(1); // getString by column name or index
            // of column start from 1
            String firstName=rs.getString("FirstName");
            System.out.println(id+" "+firstName);
        }

    }
}
//next method :
// 1- if any row being written by the query it returns true
// 2- it move the cursor to next row number 0 because initial of row -1