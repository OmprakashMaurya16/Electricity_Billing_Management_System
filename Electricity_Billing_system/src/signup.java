import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {
    JButton create, back;
    JTextField meter, user, password, name;
    JLabel heading, lblmeter, lbluser, lblname, lblpassword, image;
    Choice accountType;

    signup() {
        setBounds(450, 150, 700, 430);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 630, 330);
        panel.setBackground(Color.WHITE);
        panel.setBorder(new TitledBorder(new LineBorder(Color.RED), "Create Account",
                TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
        panel.setLayout(null);
        panel.setForeground(new Color(34, 139, 34));
        add(panel);

        heading = new JLabel("Create Account As");
        heading.setBounds(60, 60, 150, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(heading);

        accountType = new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(240, 60, 150, 23);
        panel.add(accountType);

        lblmeter = new JLabel("Meter Number");
        lblmeter.setBounds(60, 100, 150, 20);
        lblmeter.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(lblmeter);

        meter = new JTextField();
        meter.setBounds(240, 100, 150, 23);
        panel.add(meter);

        lbluser = new JLabel("Username");
        lbluser.setBounds(60, 140, 150, 20);
        lbluser.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(lbluser);

        user = new JTextField();
        user.setBounds(240, 140, 150, 23);
        panel.add(user);

        lblname = new JLabel("Name");
        lblname.setBounds(60, 180, 150, 20);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(lblname);

        name = new JTextField();
        name.setBounds(240, 180, 150, 23);
        panel.add(name);

        lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 220, 150, 20);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 15));
        panel.add(lblpassword);

        password = new JTextField();
        password.setBounds(240, 220, 150, 23);
        panel.add(password);

        create = new JButton("Create");
        create.setBounds(90, 270, 120, 25);
        create.setForeground(Color.WHITE);
        create.setBackground(Color.GRAY);
        create.addActionListener(this);
        panel.add(create);

        back = new JButton("Back");
        back.setBounds(250, 270, 120, 25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.GRAY);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(400, 40, 250, 250);
        panel.add(image);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String atype = accountType.getSelectedItem();
            String susername = user.getText();
            String smeter = meter.getText();
            String sname = name.getText();
            String spassword = password.getText();

            try {
                conn c = new conn();
                
                String querry = "insert into login value('" + smeter + "','" + susername + "','" + sname + "','"
                        + spassword + "','" + atype + "')";

                c.s.executeUpdate(querry);

                JOptionPane.showMessageDialog(null, "Account Created Successfully");

                setVisible(false);

                new login();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new login();
        }

    }

    public static void main(String[] args) {
        new signup();
    }
}
