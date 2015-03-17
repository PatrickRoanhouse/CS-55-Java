public class MyRect
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
  public int getWidth()
  {
    return width;
  }
  public int getArea()
  {
    return width * height;
  
  }
  public void setHeight(double h)
  {
   this.height=h;
  }
  public int getHeight()
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


