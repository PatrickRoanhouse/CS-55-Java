import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ShowString
{
 public static void main(String args[])
 {
    String x=JOptionPane.showInputDialog(
	"Enter Phrase");
	System.out.println(x);
	
	int n=x.indexOf(" ");
	System.out.println("====>>>"+n);
	
	String first=x.substring(0,n);
	System.out.println(first);
	String rest= x.substring(n+1);
    System.out.println(rest);
	
	String f=rest + first;
	System.out.println("+++>>>"+f);
	
	
	
	
	
 
 }
 
 }