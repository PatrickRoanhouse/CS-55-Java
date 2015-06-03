import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.event.*;

                     
public class  Test extends JFrame
{
	public static void main(String[] args)
	{
		Test win = new Test();
	    win.setSize(500,500);
		win.setTitle(" Color Window ");
		MyPanel mp= new MyPanel();
	    win.add(mp);
		
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
}

class MyPanel extends JPanel implements 
MouseListener
{     public static int CIRCLE=1;
      public static int SQUARE=2;
	  private int xPos=10;
	  private int yPos=10;
	  private int type;
	
	public MyPanel()
	{
		this.setBackground(Color.YELLOW);
		addMouseListener(this);
		
		
		
		
	}
	public void setType(int t)
	{
		type= t;
		repaint();
		
	}
	
	
	
	
  public void paintComponent(Graphics g)
  {
	 super.paintComponent(g);
     g.setColor(Color.BLUE);
      switch (type)	
	  {
		case 1 : g.fillOval(xPos,yPos,80,80);
              break;
        case 2 : g.fillRect(xPos,yPos,80,80);			  
		      break;
	    default : ;
		  
	  }	  
	  
	  
	  
  }  
	
	
	
	
 public void mouseEntered(MouseEvent e)
  {
	  
	  
	  
  }
  
  
  
  public void mouseExited(MouseEvent e)
  {
	  
	  
  }
  public void mouseClicked(MouseEvent e)
  {
	xPos= e.getX();
    yPos= e.getY();
    setType(MyPanel.SQUARE);	
	 
	  
  }
  public void mousePressed(MouseEvent e)
  {
	  
	  
  }
  public void mouseReleased(MouseEvent e)
  {
	  
	  
  }
  
  
  
  
  	
	
	
}














