

public class PayRoll
{
	
	public static double pay(EMP e)
	{   double money=0.0;
		/*if(e instanceof Programmer)
		{
		  money	=((Programmer)e).getBonus();
			
		}	
		return e.getSal()+ money;
		*/
		return e.getSal()+e.getBonus();
		
	}
	
	
}