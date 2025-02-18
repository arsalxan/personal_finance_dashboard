
package personal_finance_dashboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Dashboard extends JFrame implements ActionListener {

    JLabel income, salary, logo, rent, freelance;
    JTextField usertf;
    JPasswordField passtf;
    JButton savings, expense, viewSavings, viewExpenses, addIncome;
    ImageIcon icon, scaledIcon;
    Image image;

    Dashboard() {

        setTitle("Dashboard");
        JLabel heading = new JLabel("Personal Finance Dashboard");
        heading.setBounds(220, 80, 500, 25);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Raleway", Font.BOLD, 26));
        add(heading);

        icon = new ImageIcon(getClass().getResource("/personal_finance_dashboard/icons/loogo.png"));
        image = icon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        scaledIcon = new ImageIcon(image);
        logo = new JLabel(scaledIcon);
        logo.setBounds(100, 50, 80, 80);
        add(logo);

        income = new JLabel("Total income: Rs.12000");
        income.setBounds(530, 20, 270, 30);
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setForeground(Color.WHITE);
        add(income);

        salary = new JLabel("Salary: Rs.8500");
        salary.setBounds(130, 175, 200, 40);
        salary.setFont(new Font("Raleway", Font.BOLD, 20));
        salary.setForeground(Color.WHITE);
        add(salary);

        rent = new JLabel("Rent: Rs.1200");
        rent.setBounds(355, 175, 180, 40);
        rent.setFont(new Font("Raleway", Font.BOLD, 20));
        rent.setForeground(Color.WHITE);
        add(rent);

        freelance = new JLabel("Freelance: Rs.2300");
        freelance.setBounds(555, 175, 220, 40);
        freelance.setFont(new Font("Raleway", Font.BOLD, 20));
        freelance.setForeground(Color.WHITE);
        add(freelance);

        savings = new JButton("Add Savings Plan");
        savings.setBounds(200, 255, 200, 40);
        savings.setForeground(Color.BLACK);
        savings.addActionListener(this);
        add(savings);

        expense = new JButton("Add Expenses");
        expense.setBounds(430, 255, 150, 40);
        expense.setForeground(Color.BLACK);
        expense.addActionListener(this);
        add(expense);

        viewSavings = new JButton("View Savings");
        viewSavings.setBounds(200, 345, 200, 40);
        viewSavings.setForeground(Color.BLACK);
        viewSavings.addActionListener(this);
        add(viewSavings);

        viewExpenses = new JButton("View Expenses");
        viewExpenses.setBounds(430, 345, 150, 40);
        viewExpenses.setForeground(Color.BLACK);
        viewExpenses.addActionListener(this);
        add(viewExpenses);

        // Creating the circular button (JButton) with custom painting
        addIncome = new JButton() {
            // Overriding the paintComponent method to customize the button appearance
            @Override
            protected void paintComponent(Graphics g) {
                // Casting the Graphics object to Graphics2D for more advanced features like
                // anti-aliasing
                Graphics2D g2 = (Graphics2D) g;

                // Enabling anti-aliasing for smoother edges, especially for curves like circles
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Drawing the circular background (transparent) for the button
                // Setting a light gray color with transparency (last parameter is alpha for
                // transparency)
                g2.setColor(new Color(200, 200, 200, 100)); // Color with 60% transparency
                g2.fillOval(0, 0, getWidth(), getHeight()); // Drawing a filled oval (circle) to create the button shape

                // Drawing the text inside the button manually (super.paintComponent won't work
                // for custom shapes)
                g2.setColor(Color.WHITE); // Setting the text color to white so it contrasts against the dark gray
                                          // background
                Font font = new Font("Arial", Font.BOLD, 30); // Creating a bold font with size 30 for the "+" symbol
                g2.setFont(font); // Setting the font for drawing the text

                // Calculating the correct position to center the "+" symbol inside the circle
                // FontMetrics helps to measure the width of the text and ensures it's centered
                FontMetrics fm = g2.getFontMetrics();
                int x = (getWidth() - fm.stringWidth("+")) / 2; // Horizontally center the text
                int y = (getHeight() + fm.getAscent()) / 2 - 2; // Vertically center the text (adjusted by -2 for
                                                                // perfect alignment)

                // Drawing the "+" symbol at the calculated position
                g2.drawString("+", x, y); // The "+" will be centered within the circular button
            }

            // Overriding the paintBorder method to draw a circular border
            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(Color.LIGHT_GRAY); // Setting the border color to light gray
                g.drawOval(0, 0, getWidth() - 1, getHeight() - 1); // Drawing the circular border around the button
            }
        };

        // Setting the position and size of the button on the frame (absolute
        // positioning)
        addIncome.setBounds(720, 500, 50, 50); // x, y coordinates, width, height (50x50 for a small circular button)

        // Removing default button features to customize appearance
        addIncome.setFocusPainted(false); // Disable the focus outline when the button is clicked
        addIncome.setContentAreaFilled(false); // Prevent the button's background from being painted (no solid
                                               // background)
        addIncome.setBorderPainted(false); // Disable the default border (since we draw a custom border)
        addIncome.setOpaque(false); // Make the button transparent, so the background color is not painted

        // Add the button to the frame (you should have an existing frame object like
        // `frame.add(addIncome);`)

        // You can also set the text color (white in this case) and other properties,
        // but they're managed in the custom painting.

        add(addIncome);

        setLayout(null);
        setSize(800, 600);
        setLocation(300, 150);
        getContentPane().setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == savings) {
            passtf.setText("");
            usertf.setText("");
        } else if (ae.getSource() == expense) {

        }
    }

}
