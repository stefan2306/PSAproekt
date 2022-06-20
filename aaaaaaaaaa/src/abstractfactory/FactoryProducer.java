package abstractfactory;

public class FactoryProducer 
{

	public static AbstractFactory getFactory(String factoryName) 
	{
		
		if(factoryName.equals("‘абрика«а»гачки")) 
		{
			return new ‘абрика«а»грачки();
		}		
		System.out.println(" √решка! ");
		return null;

	}
	
}
