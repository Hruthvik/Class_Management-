package class_management;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.*;
public class option implements ActionListener{
	JFrame q=new JFrame("CLass Management");
	JPanel p=new JPanel();
	JLabel num1 = new JLabel("        CLASS MANAGEMENT");
	JLabel num2= new JLabel("-------------------------------------------");
	JButton s = new JButton("STUDENT");
	JButton f = new JButton("FACULTY");  
	option()
	{
		q.setSize(250,150);
		q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		q.setVisible(true);
		num1.setBounds(100,100,500,30);
		s.setBounds(200,100,80,30);
		f.setBounds(200,200,80,30);
		p.add(num1);
		p.add(num2);
		p.add(f);
		 p.add(s);
		 q.add(p);
		 s.addActionListener(this);
		 f.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==s)
		{
			new Class1();
		}
		if(e.getSource()==f)
		{
			new Login();
		}
	}
	public static void main(String args[])
	{
		
		new option();
	}
}
