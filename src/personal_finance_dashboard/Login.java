
package personal_finance_dashboard;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;

public class Login extends JFrame {
    public static class LimitedDocument extends PlainDocument {
        private int maxLength;

        public LimitedDocument(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str != null && getLength() + str.length() <= maxLength) {
                super.insertString(offset, str, attr);
            }
        }
    }

    JLabel title, username, password;
    JTextField usertf, passtf;
    JButton clear, login, signin;

    Login() {

        setVisible(true);
        setTitle("Get your Finance personalised");
        title = new JLabel("\"LOGIN OR START NEW WITH US\"");
        title.setBounds(25, 10, 400, 25);
        title.setForeground(Color.white);
        title.setFont(new Font("Raleway", Font.BOLD, 20));
        add(title);

        username = new JLabel("Username:");
        username.setBounds(50, 50, 100, 20);
        username.setFont(new Font("Raleway", Font.ITALIC, 18));
        username.setForeground(Color.white);
        add(username);

        usertf = new JTextField();
        usertf.setBounds(155, 50, 180, 20);
        usertf.setFont(new Font("Raleway", Font.ITALIC, 18));
        usertf.setForeground(Color.black);
        add(usertf);

        password = new JLabel("Password:");
        password.setBounds(50, 100, 100, 15);
        password.setFont(new Font("Raleway", Font.ITALIC, 18));
        password.setForeground(Color.white);
        add(password);

        passtf = new JTextField();
        passtf.setBounds(155, 100, 180, 20);
        passtf.setFont(new Font("Raleway", Font.ITALIC, 18));
        passtf.setForeground(Color.black);
        add(passtf);

        login = new JButton("Login");
        login.setBounds(158, 120, 80, 20);
        login.setForeground(Color.BLACK);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(250, 120, 80, 20);
        clear.setForeground(Color.BLACK);
        add(clear);

        setLayout(null);
        setSize(400, 400);
        setLocation(400, 400);
        getContentPane().setBackground(Color.DARK_GRAY);

    }

    public static void main(String[] args) {
        new Login();
    }
}
