package class_management;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Class1 implements ActionListener
{
JFrame calFrame = new JFrame("Calculator");
JLabel num1 = new JLabel("CLASS MANAGEMENT");
JButton tt = new JButton("Time Table");
JButton sub = new JButton("Submissions");
JButton cp = new JButton("Course Plan");
JButton exam = new JButton("Exam");
JButton back=new JButton("Back");
JPanel panel = new JPanel();
Class1 ()
{
Font f = new Font("Serif",Font.BOLD,24);
calFrame.setSize(650,550);
calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 calFrame.setVisible(true);
 panel.setLayout(null);
 num1.setBounds(200,50,500,30);
 tt.setBounds(200, 200, 250,30);
 sub.setBounds(200, 250, 250,30);
 cp.setBounds(200,300,250,30);
 exam.setBounds(200,350,250,30);
 back.setBounds(200,400,250,30);
 num1.setFont(f);
 tt.setFont(f);
 sub.setFont(f);
 exam.setFont(f);
 cp.setFont(f);
 back.setFont(f);
 panel.add(num1);
 panel.add(tt);
 panel.add(sub);
 panel.add(exam);
 panel.add(cp);
 panel.add(back);
 calFrame.add(panel);
 tt.addActionListener(this);
 sub.addActionListener(this);
 exam.addActionListener(this);
 cp.addActionListener(this);
 back.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
if(e.getSource()==tt)
{
 new timetable();
}
else if(e.getSource()==sub)
{
    new submissions();
}
else if(e.getSource()==cp)
{
new courseplan();
}
else if(e.getSource()==exam)
{
new exam();
}
else if(e.getSource()==back)
	new option();
	
}

} 
