package abstractfactory;

public class ���������������� extends AbstractFactory 
{

	@Override
	������������������ getToy(String toyType) 
	{
		if(toyType.equals("������")) 
		{
			return new ������();
		}
		
		if(toyType.equals ("�����")) 
		{
			return new �����();
		}
		System.out.println("��������� �� � ������ ��� �����");
		return null;
	}

}
