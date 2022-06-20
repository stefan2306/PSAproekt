package singleton;

public class ÄÿהמÊמכוהא
{
	private static ÄÿהמÊמכוהא instance;
	
	private ÄÿהמÊמכוהא()
	{
		// TODO Auto-generated constructor stub
	}

	public static ÄÿהמÊמכוהא getInstance() 
	{
		
		if(instance == null) 
		{
			instance = new ÄÿהמÊמכוהא();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println("Äÿהמ Êמכוהא טחנטקא הףלטעו:" + message);
	}
}
