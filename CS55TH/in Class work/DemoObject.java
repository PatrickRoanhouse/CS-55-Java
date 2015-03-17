import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
//
/*    */
public class DemoObject
{


 public static void main(String [] args)
 {
   MyRect r1= new MyRect();
   r1.setWidth(20);r1.setHeight(130);
   System.out.println("The Area is "+r1.getArea());
   
   MyRect r2 = new MyRect(100,40);
   if( r1.getHeight() > r2.getHeight())
     
   System.out.println(" r1 > r2");
   
    System.out.println(r1 +"===="+r2.toString());
 
 
 System.exit(0);
 }

}
class MyRect
{
  private double width;
  private double height;
  
  public MyRect()
  {
  
  }
  public MyRect(double w, double h)
  {
     width= w; height= h;
  }
  
  public void setWidth(double width)
  { 
   this.width=width;
  }
  public double getWidth()
  {
    return width;
  }
  public double getArea()
  {
    return width * height;
  
  }
  public void setHeight(double h)
  {
   this.height=h;
  }
  public double getHeight()
  {
    return height;
  }
  
  public String toString()
  {
    return "MyRect :"+"\n"
	      +"Width:"+width+"\n"
		  +"Height:"+height+"\n"
		  +"Area:"+getArea()+"\n";
  }
  







}










