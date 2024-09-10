import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

    JButton login, cancel, signup;

    login() {
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(330, 20, 100, 20);
        l1.setFont(new Font("Areial", Font.BOLD, 15));
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(420, 21, 180, 22);
        add(t1);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(330, 70, 100, 20);
        l2.setFont(new Font("Areial", Font.BOLD, 15));
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(420, 71, 180, 22);
        add(t2);

        JLabel l3 = new JLabel("Loggin As");
        l3.setBounds(330, 120, 80, 20);
        l3.setFont(new Font("Areial", Font.BOLD, 15));
        add(l3);

        Choice c1 = new Choice();
        c1.add("Admin");
        c1.add("Customer");
        c1.setBounds(420, 120, 179, 23);
        add(c1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(360, 170, 100, 23);
        login.addActionListener(this);
        add(login);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4 = i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel = new JButton("Cancel", new ImageIcon(i4));
        cancel.setBounds(480, 170, 100, 23);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signup = new JButton("Signup", new ImageIcon(i6));
        signup.setBounds(410, 220, 100, 23);
        signup.addActionListener(this);
        add(signup);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i8));
        image.setBounds(0, 0, 250, 250);
        add(image);

        setLayout(null);
        setSize(640, 330);
        setLocation(400, 200);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {

        } else if (ae.getSource() == cancel) {
                setVisible(false);
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new signup();
        }
    }

    public static void main(String[] args) {
        new login();
    }

}