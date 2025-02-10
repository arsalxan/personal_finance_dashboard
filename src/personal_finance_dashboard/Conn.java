
package personal_finance_dashboard;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "newpassword");
            s = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
