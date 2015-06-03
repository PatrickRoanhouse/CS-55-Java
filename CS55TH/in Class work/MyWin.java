import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.event.*;

                     
public class  MyWin extends 
JFrame implements ActionListener
{
	 private Container c;
	 private JButton b1,b2,b3;
	 
	 public MyWin()
	 {
		c= getContentPane(); 
		c.setLayout(new FlowLayout());
		
		b1 = new JButton("Red");
		b1.addActionListener(this);
		
		b2 = new JButton("Green");
		b2.addActionListener(this);
		b3 = new JButton("Blue");
		b3.addActionListener(this);
		c.add(b1);c.add(b2);
		c.add(b3);
		
		 
	 }
	
	 public void actionPerformed(ActionEvent e)
	 {
		 if (e.getSource()==b1)
		   c.setBackground(Color.RED);
	     else if (e.getSource()==b2)
		   c.setBackground(Color.GREEN);
		 else if(e.getSource()==b3)
		   c.setBackground(Color.BLUE);
		 else
			  ;
	 }
	public static void main(String[] args)
	{
		MyWin win = new MyWin();
	    win.setSize(500,500);
		win.setTitle(" Color Window ");
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	
}