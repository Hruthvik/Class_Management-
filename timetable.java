package class_management;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

import class_management.Class;

import java.awt.*;
public class timetable implements ItemListener,ActionListener
{
	
	JFrame q=new JFrame("TimeTable");
	JPanel p=new JPanel();
	JLabel l=new JLabel("                                                              ");
	String time[]={"9AM","10AM","11AM","12PM","1PM","2PM","3PM"};
	String monday[]={"pp","cg","ds","ao","break","oslab","oslab"};
	String tuesday[]={"pp","cg","ds","ao","break","pplab","pplab"};
	String wednesday[]={"pp","cg","ds","ao","break","cglab","cglab"};
	String thursday[]={"pp","cg","ds","ao","break","oslab","oslab"};
	String friday[]={"pp","cg","ds","ao","break","oslab","oslab"};
	String saturday[]={"pp","cg","ds","ao","break","No Class","No Class"};
	String a[]=new String[7];
	JComboBox<String> t = new JComboBox<String>(time);  
	String room_no[]={"205","205","205","205","break","205","205"};
	String faculty[]={"jame","jack","frost","break","ten","lucy","kim"};
	JButton b = new JButton("BACK");
	JButton mon = new JButton("MONDAY");
	JButton tue = new JButton("TUESDAY");
	JButton wed = new JButton("WEDNESDAY");
	JButton thurs = new JButton("THURSDAY");
	JButton fri = new JButton("FRIDAY");
	JButton sat = new JButton("SATURDAY");


    TextArea text=new TextArea("",10,30);  
    public void set(String x[])
	{
		for(int i=0;i<x.length;i++)
			a[i]=x[i];
	}
	timetable()
	{
		q.setSize(550,550);
		q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		q.setVisible(true);
		 mon.setBackground(Color.pink);
		 tue.setBackground(Color.gray);
		 wed.setBackground(Color.blue);
		 thurs.setBackground(Color.yellow);
		 fri.setBackground(Color.red);
		 sat.setBackground(Color.white);
		 Font f = new Font("",Font.PLAIN,20);
		 text.setFont(f);
		 p.add(mon);
		 p.add(tue);
		 p.add(wed);
		 p.add(thurs);
		 p.add(fri);
		 p.add(sat);
		 p.add(l);
		 p.add(t);
		 p.add(text); 
		 p.add(b);
		 q.add(p);
		 t.addItemListener(this);
		 b.addActionListener(this);
		 mon.addActionListener(this);
		 tue.addActionListener(this);
		 wed.addActionListener(this);
		 thurs.addActionListener(this);
		 fri.addActionListener(this);
		 sat.addActionListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		
			if(e.getSource()==t)
			{
				if(t.getSelectedItem()=="9AM")
					text.setText("Period: \t"+a[0]+"\nRoom No:\t"+room_no[0]+"\nFaculty: \t"+faculty[0]);
				if(t.getSelectedItem()=="10AM")
					text.setText("Period: \t"+a[1]+"\nRoom No:\t"+room_no[1]+"\nFaculty: \t"+faculty[1]);
				if(t.getSelectedItem()=="12PM")
					text.setText("Period: \t"+a[3]+"\nRoom No:\t"+room_no[2]+"\nFaculty: \t"+faculty[2]);
				if(t.getSelectedItem()=="1PM")
					text.setText("Period: \t"+a[4]+"\nRoom No:\t"+room_no[4]+"\nFaculty: \t"+faculty[4]);
				if(t.getSelectedItem()=="2PM")
					text.setText("Period: \t"+a[5]+"\nRoom No:\t"+room_no[5]+"\nFaculty: \t"+faculty[5]);
				if(t.getSelectedItem()=="3PM")
					text.setText("Period: \t"+a[6]+"\nRoom No:\t"+room_no[6]+"\nFaculty: \t"+faculty[6]);
				if(t.getSelectedItem()=="11AM")
					text.setText("Period: \t"+a[2]+"\nRoom No:\t"+room_no[2]+"\nFaculty: \t"+faculty[2]);
			}
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
			new Class1();
		if(e.getSource()==mon)
		{
			this.set(monday);
			p.setBackground(Color.pink);
		}
		if(e.getSource()==tue)
		{
			this.set(tuesday);
			p.setBackground(Color.gray);
		}
		if(e.getSource()==wed)
		{
			this.set(wednesday);
			p.setBackground(Color.blue);
		}
		if(e.getSource()==thurs)
		{
			this.set(thursday);
			p.setBackground(Color.yellow);
		}
		if(e.getSource()==fri)
		{
			this.set(friday);
			p.setBackground(Color.red);
		}
		if(e.getSource()==sat)
		{
			this.set(saturday);
			p.setBackground(Color.white);
		}
	}
	}
