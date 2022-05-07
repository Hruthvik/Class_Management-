package class_management;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class submissions implements ItemListener,ActionListener
{
	JFrame q=new JFrame("Submissions");
	JPanel p=new JPanel();
	int i;
	JComboBox<String> jcb = new JComboBox<String>();  
	JLabel a=new JLabel("");
	static String maths ="\nTopic:\t\t Rearsch report paper \n\nDue Date:\t16.09.2019\n\nDay:\t\t Monday"; 
	static String pp="\nTopic:\t\t CIA III Component - project\n\nDue Date:\t13.09.2019\n\nDay:\t\t Friday";
	static String cg="\nTopic:\t\t CIA III Component - project\n\nDue Date:\t16.09.2019\n\nDay:\t\t Monday";
	static String ds="\nTopic:\t\t CIA III Component - assignment\n\nDue Date:\t17.09.2019\n\nDay:\t\t Tuesday";
	JButton b = new JButton("BACK");
    TextArea text=new TextArea("",10,30);  
    JButton e = new JButton("EDIT");
	submissions()
	{
		q.setSize(550,550);
		q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		q.setVisible(true);
		jcb.addItem("SELECT");
		 jcb.addItem("MATHS");   
		 jcb.addItem("PROGRAMING PARADIGM");    
		 jcb.addItem("COMPUTER GRAPHICS");
		 jcb.addItem("DIGITAL SYSTEMS");
		 Font f = new Font("",Font.PLAIN,16);
		 text.setFont(f);
		 p.add(jcb);
		 p.add(a);
		 p.add(text);
		 if(Login.t==true)
		 p.add(e);
		 p.add(b);
		 q.add(p);
		 jcb.addItemListener(this);
		 b.addActionListener(this);
		 e.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==jcb) 
		{
			if(jcb.getSelectedItem()=="MATHS")
			{
				text.setText(maths);
				i=1;
			}
			if(jcb.getSelectedItem()=="PROGRAMING PARADIGM")
			{
				text.setText(pp);
				i=2;
			}
				if(jcb.getSelectedItem()=="COMPUTER GRAPHICS")
				{
					text.setText(cg);
					i=3;
				}
				if(jcb.getSelectedItem()=="DIGITAL SYSTEMS")
				{
					text.setText(ds);
					i=4;
				}
			
		}
		
	}
	public void edit()
	{
		if(i==1)
			maths=text.getText();
			if(i==2)
				pp=text.getText();
				if(i==3)
					cg=text.getText();
					if(i==4)
						ds=text.getText();
						
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
			new Class1();
		if(e.getSource()==this.e)
		{
			edit();
		}
	}
	public static void main(String args[])
	{
		
	}
	
	}

