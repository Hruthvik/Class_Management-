package class_management;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class courseplan implements ItemListener,ActionListener
{
	JFrame q=new JFrame("COURSE PLAN");
	JPanel p=new JPanel();
	int i;
	JComboBox<String> jcb = new JComboBox<String>();  
	JLabel a=new JLabel("");
	public static String maths ="\nCompleted:UNIT 1,UNIT 2,UNIT 3\n\nCurrent:unit 4\n\nPending: UNIT 5"; 
	public static String pp="\nCompleted:UNIT 1,UNIT 2,UNIT 3\n\nCurrent:unit 4\n\nPending: UNIT 5"; 
	public static String cg="\nCompleted:UNIT 1,UNIT 2\n\nCurrent:UNIT 3\n\nPending: UNIT 4,UNIT 5"; 
	public static String ds="\nCompleted:UNIT 1,UNIT 2,UNIT 3\n\nCurrent:unit 4\n\nPending: UNIT 5"; 
	JButton b = new JButton("BACK");
	JButton e = new JButton("EDIT");
    TextArea text=new TextArea("",10,30); 
    
	courseplan()
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
	boolean d=false;
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
			new Class1();
		if(e.getSource()==this.e)
		{
			edit();
		}
			//new cp_edit();
	}
	
	}


