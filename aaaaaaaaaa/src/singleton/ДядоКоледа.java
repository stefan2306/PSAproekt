package singleton;

public class ДядоКоледа
{
	private static ДядоКоледа instance;
	
	private ДядоКоледа()
	{
		// TODO Auto-generated constructor stub
	}

	public static ДядоКоледа getInstance() 
	{
		
		if(instance == null) 
		{
			instance = new ДядоКоледа();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println("Дядо Коледа изрича думите:" + message);
	}
}
