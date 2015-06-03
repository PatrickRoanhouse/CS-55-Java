import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class HasWindow
{
	public static void main(String[] args)
	{
		 JFrame win= new JFrame("My First Window");
		 win.setSize(400,500);
		 win.setLayout(new FlowLayout());
		 JButton b1=new  JButton("PressMe");
		 win.add(b1);
		 win.getContentPane().setBackground(Color.GREEN);
		 win.setVisible(true);
		 win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
}