/* JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(parent);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getName());
    }
	*/
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class DemoJFileChooser
{
	public static void main(String [] args)
	throws Exception
	{
		
		JFileChooser chooser = new JFileChooser();
	   int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
	String infile =chooser.getSelectedFile().getName();
	System.out.println(" you have selected:"+infile);
	
	}
	
	}

}











