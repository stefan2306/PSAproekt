package singleton;

public class ����������
{
	private static ���������� instance;
	
	private ����������()
	{
		// TODO Auto-generated constructor stub
	}

	public static ���������� getInstance() 
	{
		
		if(instance == null) 
		{
			instance = new ����������();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {
		System.out.println("���� ������ ������ ������:" + message);
	}
}
