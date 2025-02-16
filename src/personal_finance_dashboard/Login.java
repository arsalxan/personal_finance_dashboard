
package personal_finance_dashboard;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    

    JLabel title, username, password , logo;
    JTextField usertf;
    JPasswordField passtf;
    JButton clear, login, signup;
    ImageIcon icon , scaledIcon;
    Image image;

    Login() {

        setTitle("Get your Finance personalised");
        title = new JLabel("\"LOGIN OR START NEW WITH US\"");
        title.setBounds(220, 80, 520, 25);
        title.setForeground(Color.white);
        title.setFont(new Font("Raleway", Font.BOLD, 24));
        add(title);

        icon = new ImageIcon(getClass().getResource("/personal_finance_dashboard/icons/loogo.png"));
        image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        scaledIcon = new ImageIcon(image);
        logo = new JLabel(scaledIcon);
        logo.setBounds(100, 50, 80, 80);
        add(logo);

        username = new JLabel("Username:");
        username.setBounds(250, 170, 150, 40);
        username.setFont(new Font("Raleway", Font.BOLD, 22));
        username.setForeground(Color.white);
        add(username);

        usertf = new JTextField();
        usertf.setBounds(420, 170, 240, 40);
        usertf.setFont(new Font("Raleway", Font.BOLD, 18));
        usertf.setForeground(Color.black);
        add(usertf);

        password = new JLabel("Password:");
        password.setBounds(250, 220, 150, 40);
        password.setFont(new Font("Raleway", Font.BOLD, 22));
        password.setForeground(Color.white);
        add(password);

        passtf = new JPasswordField();
        passtf.setBounds(420, 220, 240, 40);
        passtf.setFont(new Font("Raleway", Font.BOLD, 22));
        passtf.setDocument(new LimitedDocument(4));
        add(passtf);

        login = new JButton("Login");
        login.setBounds(280, 320, 100, 40);
        login.setForeground(Color.BLACK);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(430, 320, 100, 40);
        clear.setForeground(Color.BLACK);
        //to perform action of button
        clear.addActionListener(this);
        add(clear);
        

        signup= new JButton("Sign Up");
        signup.setBounds(560, 320, 100, 40);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);

        setLayout(null);
        setSize(800, 600);
        setLocation(500, 200);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
           usertf.setText("");
           passtf.setText("");
        }
        else if(ae.getSource()==login){

        }
       else if(ae.getSource()==signup){
            // setVisible(false);
            dispose();
            new SignUp();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
