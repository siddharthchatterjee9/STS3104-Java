package jdbc;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation {
    public static void main(String... args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost/ri_db";
        String username = "test";
        String password = "test123";
        String query = "SELECT * FROM userdetails where user_name=?";
        Scanner in = new Scanner(System.in);

        String user_name = in.nextLine();
        String pass_word = in.nextLine();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, user_name);
        ResultSet rs = st.executeQuery();
        ((ResultSet) rs).next();
        if (rs.getString(2).equals(pass_word)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Invalid username/password");
        }
    }
}
