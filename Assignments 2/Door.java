// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/

public class Door
{
	private boolean closed;
	private boolean locked;
	private String inscription;

	public Door(String c)
	{
		inscription=c;
		closed=true;
		locked=true;
	}
				
	public String prtInscription()
	{
		return inscription;
	}
		
	public boolean isClosed()
	{
		return closed;
	}

	public boolean isLocked()
	{
		return locked;
	}
				
	public void open()
	{
		if(closed==true&&locked==false)
		{
			System.out.println("--- Door opened ---\n");
			closed = false;
		}
		else
		{
			System.out.println("\n**** Door is closed and locked. Try again ****\n\n");
		}

	}

	public void close()
	{
		if(locked==false)
		{
			System.out.println("\n--- Door closed ---\n\n");
			closed = true;
		}
		else
		{
			System.out.println("\n**** Unlock the door first. Try aqain ****\n\n");
		}
	}
		
	public void lock()
	{
		if(locked==false)
		{
			System.out.println("\n--- Door locked ---\n\n");
			locked = true;
		}
		else
		{
			System.out.println("\n**** Door is already locked. Try again ****\n\n");
		}
	}
		
	public void unlock()
	{
		if(locked==true)
		{
			System.out.println("\n--- Door unlocked ---\n\n");
			locked = false;
		}
		else
		{
			System.out.println("\n**** Door is already unlocked. Try again ****\n\n");
		}
	}
		
	public void setOpen()
	{
		closed=false;
	}
			
	public void setUnlocked()
	{
		locked=false;
	}
}