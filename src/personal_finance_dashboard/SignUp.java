
package personal_finance_dashboard;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            passtf.setText("");
            usertf.setText("");
        }
        else if(ae.getSource()==proceed){
            dispose();
            new Dashboard();
        }
    }

    JLabel income, username, password , logo , login;
    JTextField usertf;
    JPasswordField passtf;
    JButton clear, proceed;
    ImageIcon icon , scaledIcon;
    Image image;
    JCheckBox salary , rent , freelance;

    SignUp(){

        setTitle("Sing Up Page");
        JLabel heading= new JLabel("\"Please provide your details\"");
        heading.setBounds(220, 80, 520, 25);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Raleway", Font.BOLD, 24));
        add(heading);

        icon = new ImageIcon(getClass().getResource("/personal_finance_dashboard/icons/loogo.png"));
        image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        scaledIcon = new ImageIcon(image);
        logo = new JLabel(scaledIcon);
        logo.setBounds(100, 50, 80, 80);
        add(logo);

        username = new JLabel("Set a username:");
        username.setBounds(120, 170, 250, 40);
        username.setFont(new Font("Raleway", Font.BOLD, 22));
        username.setForeground(Color.white);
        add(username);

        usertf = new JTextField();
        usertf.setBounds(400, 170, 240, 40);
        usertf.setFont(new Font("Raleway", Font.BOLD, 18));
        usertf.setForeground(Color.black);
        add(usertf);

        password = new JLabel("Set Password:");
        password.setBounds(120, 230, 200, 40);
        password.setFont(new Font("Raleway", Font.BOLD, 22));
        password.setForeground(Color.white);
        add(password);

        passtf = new JPasswordField();
        passtf.setBounds(400, 230, 240, 40);
        passtf.setFont(new Font("Raleway", Font.BOLD, 22));
        passtf.setDocument(new LimitedDocument(4));
        add(passtf);

        income = new JLabel("<html>&nbsp Select your <br>income source(s)</html>");
        income.setBounds(120 , 300 , 250 , 60);
        income.setFont(new Font("Raleway", Font.BOLD, 22));
        income.setForeground(Color.white);
        add(income);


        salary = new JCheckBox("Salary");
        salary.setBounds(400 , 300 , 100 , 35);
        salary.setFont(new Font("Raleway", Font.BOLD, 18));
        salary.setForeground(Color.white);
        salary.setBackground(null);
        add(salary);

        rent = new JCheckBox("Rent");
        rent.setBounds(520 , 300 , 80 , 35);
        rent.setFont(new Font("Raleway", Font.BOLD, 18));
        rent.setForeground(Color.white);
        rent.setBackground(null);
        add(rent);

        freelance = new JCheckBox("Freelance");
        freelance.setBounds(620 , 300 , 140 , 35);
        freelance.setFont(new Font("Raleway", Font.BOLD, 18));
        freelance.setForeground(Color.white);
        freelance.setBackground(null);
        add(freelance);

        clear = new JButton("Clear");
        clear.setBounds(250, 400, 100, 40);
        clear.setForeground(Color.BLACK);
        //to perform action of button(clearing the text fields)
        clear.addActionListener(this);
        add(clear);
        

        proceed= new JButton("Proceed");
        proceed.setBounds(380, 400, 100, 40);
        proceed.setForeground(Color.BLACK);
        proceed.addActionListener(this);
        add(proceed);

        login = new JLabel("Already an existing user ?");
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setBounds(280, 450, 200, 40);
        login.setForeground(Color.WHITE);
        login.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                dispose();
                new Login();
            }
        });
        add(login);


        setLayout(null);
        setSize(800, 600);
        setLocation(300, 150);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
   
    public static void main(String [] args){
        new SignUp();
    }

}
