package abstractfactory;

public class ФабрикаЗаИграчки extends AbstractFactory 
{

	@Override
	ПроизведенаИграчка getToy(String toyType) 
	{
		if(toyType.equals("КОЛЕЛО")) 
		{
			return new Колело();
		}
		
		if(toyType.equals ("КУКЛА")) 
		{
			return new Кукла();
		}
		System.out.println("Играчката не е колело или кукла");
		return null;
	}

}
