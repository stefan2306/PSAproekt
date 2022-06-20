package command;

public class Играчка 
{
	private boolean колелоИлиКукла;
	
	public void кукла()
	{
		System.out.println(" Трябват ми кукли! ");
		this.колелоИлиКукла = true;
	}
	
	public void колело()
	{
		System.out.println(" Трябват ми колелета! ");
		this.колелоИлиКукла = false;
	}

}
