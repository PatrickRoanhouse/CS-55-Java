// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.event.*;

                     
public class SMC extends JFrame implements ActionListener 
{
	private Container c;
	private JButton b1, b2, b3, b4, b5;
	private JTextField t1, t2 , t3;
	
	public SMC()
	{
		c = getContentPane();
		
		//Panel 1 Font
		JLabel lab = new JLabel();
		Font f = new Font("times new roman", Font.BOLD+Font.ITALIC, 160);
		lab.setFont(f);
		lab.setForeground(Color.BLUE);
		lab.setText("SMC");
		
		//Panel 1
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		p1.add(lab);
		
		//Panel 2
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.GREEN);
		p2.setLayout(new GridLayout(3,2,5,5));
		p2.add(new JLabel("First Name: "));
		t1 = new JTextField(25);
		p2.add(t1);
		
		p2.add(new JLabel("Last Name: "));
		t2 = new JTextField(25);
		p2.add(t2);
		
		p2.add(new JLabel("Student ID#: "));
		t3 = new JTextField(25);
		p2.add(t3);
		
		//Panel 3
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.GREEN);
		p3.setLayout(new FlowLayout());
		
		b1 = new JButton("Add");
		b2 = new JButton("Clear");
		b3 = new JButton("Show");
		b4 = new JButton("Save");
		b5 = new JButton("Remove");
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		
		//Window Layout
		
		c.setLayout(new GridLayout(3,1));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		
	}
		
	public void actionPerformed(ActionEvent e)
	{
		String fn = t1.getText();
		String ln = t2.getText();
		String id = t3.getText();
		Student st = new Student (fn,ln,id);
		
		MyIO.display(st,Color.BLACK,Color.WHITE,24);
		
	}
	
	
	public static void main(String [] args)
	{
		SMC win = new SMC();
		win.setTitle("Event Registration");
		win.setSize(500,700);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}