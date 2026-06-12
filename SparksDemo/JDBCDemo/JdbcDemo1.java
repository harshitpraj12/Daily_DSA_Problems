package JDBCDemo;

import java.sql.*;

public class JdbcDemo1 {
    final static String DRIVE_STRING="com.mysql.cj.jdbc.Driver";
    final static String URL="jdbc:mysql://localhost:3306/studentdb";
    final static String UNAME="root";
    final static String PASS="Harshit@1";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVE_STRING);
            Connection connection = DriverManager.getConnection(URL, UNAME, PASS);
            Statement statement = connection.createStatement();
            String q1 = "select * from student";
            ResultSet q2 = statement.executeQuery(q1);
            while(q2.next()){
                int id = q2.getInt("id");
                String name = q2.getString("name");
                int roll = q2.getInt("rollno");
                System.out.println("ID "+ id+" NAME "+ name+ " ROLL " + roll);
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }    
}
