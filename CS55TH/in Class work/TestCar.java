import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


                     
public class TestCar
{

 public static void main(String [] args)
 {
     Car c1 = new Car();
	 Car c2 = new Car();
	 c1.setMake("Lamb");
	 c2.setMake("Nissan");
	 c1.setPrice(666666.0);
	 c2.setPrice(23000.0);
	 c1.setYear(2014);
	 c2.setYear(2015);
	 c1.setColor("Red");
	 c2.setColor("Black");
	 System.out.println(c1.toString()+c2.toString());
	 
	 if(c1.getPrice() > c2.getPrice())
	   System.out.println("The Car is "+c1.getMake());
	 
	 
	Car    [] x= new Car[10];
	
	for(int i= 0; i < x.length; i++)
		x[i]= Car.makeACar();
	 
	 
	 
	 
	 
	 
 
 
 }



}
class Car
{
   private String make;
   private int year;
   private double price;
   private String color;
   private String vinNum;
   private static int count;
   
   // Constructor
   public Car()
   {
	 count ++;  
   }
   
   
   
   public Car(String make,double p,int y,String c,String v)
   {
	  this.make=make; setPrice(p); year=y;
      color=c; vinNum=v;	  
	   count ++;  
	   
   }
   public Car(String m,double p)
   {
	  this(m,p,0,"Unknown","") ;
	   
   }
   
  public static Car makeACar()
  {
	 String [] m={"BMW","Nisan","Fiat","Toyota","Honda","Tesla","Jupiter"
	 ,"PaiKan","Benz"} ;
	 
	  int im= (int)(Math.random()* m.length);
	  
	  
	  String [] c={"Red","Grren","Black","Blue","Pink","Yellow","Orange"}
	  ;
	  int ic= (int)(Math.random()* c.length);
	  
	  double p =(int)(Math.random()* (60000-10000+1)) + 10000;
	  
	  int y=(int)(Math.random()* (2015-2000+1)) + 2000;
	  
	  String [] v={"BMW999","Nisan888","Fiat777","Toyota666","Honda333","Tesla777","Jupiter222"
	 ,"PaiKan999","Benz111"} ;
	  int iv=(int)(Math.random()* v.length);
	  
	  return new Car(m[im],p,y,c[ic],v[iv]);
	  
	  
  }  
  public void setMake(String make)
  {
     this.make=make;
  }
    
   public void setColor(String c)
  {
     this.color=c;
  }
   public void setVinNum(String vinNum)
  {     
     this.vinNum=vinNum;
  }
   public void setYear(int y)
   {
      year = y;
   }
   public void setPrice(double p)
   {
	  if ( p > 0)
        price=p;
	  else
		System.out.println("Price can not be negative");
   }
   
   public double getPrice()
   {
       return price;
   }
   public int getYear()
   {
     return year;
   }
   public String getColor()
   {
    return color;
   }
   public String getMake()
   { 
     return make;
	} 
   public String getVinNum()
   {
     return vinNum;
   }
   
   public static int getCount()
   {
	   return count;
	   
   }
   
   
   public String toString()
   {
     return "Make:"+make+"\n"
	       +"Price:"+price+"\n"
		   +"Year:"+year+"\n"
		   +"Color:"+color+"\n"
		   +"VinNum:"+vinNum+"\n\n\n";
   }
   }
   
   


