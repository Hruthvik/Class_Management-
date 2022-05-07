package class_management;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;

public class Login implements ActionListener {
	JFrame calFrame = new JFrame("Login");
    JPanel panel = new JPanel();;
    JLabel user_label = new JLabel("User name: ");
    JLabel password_label = new JLabel("Password: ");
    JLabel message = new JLabel();
    JTextField userName_text = new JTextField();
    JPasswordField password_text = new JPasswordField();
    JButton submit = new JButton("SUBMIT");
    static boolean t=false;
  

    Login() {
        
    	calFrame.setSize(300,300);
    	calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 calFrame.setVisible(true);
    	 panel.setLayout(null);
    	 user_label.setBounds(70,70,80,30);
    	 userName_text.setBounds(150,70,80,30);
    	 password_label.setBounds(70,140,80,30);
    	 password_text.setBounds(150,140,80,30);
    	 message.setBounds(70,220,80,30);
    	 submit.setBounds(70,180,80,30);
    	 panel.add(user_label);
        panel.add(userName_text);
       panel.add(password_label);
        panel.add(password_text);

        
        panel.add(message);
        panel.add(submit);
        calFrame.add(panel);
        // Adding the listeners to components..
        submit.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==submit)
    	{
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText(" Hello " + userName+".");
            t=true;
            new Class1();
        } else {
            message.setText(" Invalid user.. .");
        }
    	}

    }

}
