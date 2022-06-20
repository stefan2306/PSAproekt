package abstractfactory;

public class FactoryProducer 
{

	public static AbstractFactory getFactory(String factoryName) 
	{
		
		if(factoryName.equals("ФабрикаЗаИгачки")) 
		{
			return new ФабрикаЗаИграчки();
		}		
		System.out.println(" Грешка! ");
		return null;

	}
	
}
