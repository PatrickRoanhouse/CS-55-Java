import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.event.*;

                     
public class MouseDemo extends JFrame implements
MouseListener
{
  private Container c;
  private JTextField t1,t2;
  private Color col;
  
  public MouseDemo()
  {
	c=getContentPane();
    c.setLayout(new FlowLayout());
	c.add(new JLabel("X:"));
	t1 = new JTextField(4);
	c.add(t1);
	c.add(new JLabel("Y:"));
	t2 = new JTextField(4);
	c.add(t2);
	this.addMouseListener(this);
	  
	  
	  
	  
  }
  public void mouseEntered(MouseEvent e)
  {
	  col=getBackground();
	  c.setBackground(Color.GREEN);
	  
	  
  }
  
  
  
  public void mouseExited(MouseEvent e)
  {
	  c.setBackground(col);
	  
  }
  public void mouseClicked(MouseEvent e)
  {
	 int x=e.getX();
     int y=e.getY();
     t1.setText(""+x);
	 t2.setText(""+y);
	 
	  
  }
  public void mousePressed(MouseEvent e)
  {
	  
	  
  }
  public void mouseReleased(MouseEvent e)
  {
	  
	  
  }
  
  
  
  
  
	public static void main(String [] args)
	{
		MouseDemo win= new MouseDemo();
		win.setTitle(" Show MouseListener");
		win.setSize(300,500);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
}