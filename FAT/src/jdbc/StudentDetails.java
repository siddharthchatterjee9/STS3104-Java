package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class StudentDetails {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/ri_db";
        String username = "test";
        String password = "test123";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");

    }
}
