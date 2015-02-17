import java.awt.*;
import javax.swing.*;
import java.util.*;

// Name: Patrick Roanhouse

/*

*/
// case sensitive & all capitals as first letter mean it is an object

public class HelloFromJupiter
{
	public static void main(String args[])
	{
		System.out.println("Hello\nfrom\nJupiter");
		System.out.println("Hello from Jupiter");
		JOptionPane.showMessageDialog(null,"Hello From Jupiter\n");
		
		Font f= new Font("helvetica",Font.BOLD,14);
		
		JTextArea jt= new JTextArea(10,15);
		jt.setBackground(Color.WHITE);
		jt.setForeground(Color.BLACK);
		jt.setFont(f);
		jt.setText("Hello From Jupiter\n");
		JOptionPane.showMessageDialog(null, jt);
		
		JOptionPane.showMessageDialog(null,10+5);
		
		//myIO.display("Hello From Jupiter",Color.BLACK,Color.WHITE,64);
		
	}
}

	
