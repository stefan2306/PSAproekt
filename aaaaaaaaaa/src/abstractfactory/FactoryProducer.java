package abstractfactory;

public class FactoryProducer 
{

	public static AbstractFactory getFactory(String factoryName) 
	{
		
		if(factoryName.equals("���������������")) 
		{
			return new ����������������();
		}		
		System.out.println(" ������! ");
		return null;

	}
	
}
