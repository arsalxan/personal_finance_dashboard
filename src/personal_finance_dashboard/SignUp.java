
package personal_finance_dashboard;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
    JLabel name;
    JTextField nametf;
    SignUp(){
        setLayout(null);
        setTitle("Sing Up Page");
        JLabel heading= new JLabel("\"Please provide your details\"");
        heading.setBounds(180,10,600,30);
        heading.setFont(new Font("Raleway",Font.BOLD,30));
        heading.setForeground(Color.white);
        add(heading);

        name = new JLabel("Name:");
        name.setBounds(70,80,100,25);
        name.setFont(new Font("Raleway",Font.BOLD, 20));
        name.setForeground(Color.white);
        add(name);

        nametf= new JTextField();
        nametf.setBounds(170,80,400,25);
        nametf.setFont(new Font("Raleway",Font.PLAIN, 16));
        nametf.setForeground(Color.black);
        add(nametf);

        setVisible(true);
        setSize(800,700);
        setLocation(200,200);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
   
    public static void main(String [] args){
        new SignUp();
    }
}
