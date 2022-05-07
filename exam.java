package class_management;


	import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class exam implements ItemListener,ActionListener
	{
		JFrame q=new JFrame("EXAM");
		JPanel p=new JPanel();
		JComboBox<String> ex = new JComboBox<String>();  
		JLabel a=new JLabel("");
		
		JButton b = new JButton("BACK");
	        TextArea text=new TextArea("",15,50);  
		exam()
		{
			q.setSize(650,650);
			q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			q.setVisible(true);
			ex.addItem("SELECT");
			 ex.addItem("CIE 1");   
			 ex.addItem("CIE 2");
			 ex.addItem("CIE 3");
			 ex.addItem("SEE");
			 Font f = new Font("",Font.PLAIN,16);
			 text.setFont(f);		 
			 p.add(ex);
			 p.add(a);
			 p.add(text); 
			 p.add(b);
			 q.add(p);
			 ex.addItemListener(this);
			 b.addActionListener(this);
		}
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getSource()==ex) 
			{
				if(ex.getSelectedItem()=="SEE")
				{
					text.setText("\tSUBJECT\tDATE\t\tTIME\n\n\tEVA\t\t30.11.19\t9:30AM-11:30AM\n\n\tECO\t\t2.12.19\t9:30AM-12:30PM\n\n\tMATH\t\t4.12.19\t9:30AM-12:30PM\n\n\tDLD\t\t6.12.19\t9:30AM-12:30PM\n\n\tDS\t\t9.12.19\t9:30AM-12:30PM\n\n\tCO\t\t11.12.19\t9:30AM-12:30PM\n\n\tPYTH\t\t13.12.19\t9:30AM-12:30PM");
				}
				else
				{
					text.setText("\n\n\t\tEXAM COMPLETED!");
				}
				
			}
			
		}
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==b)
				new Class1();
		}
		}
