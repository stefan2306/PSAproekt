package observer;

public class Джудже implements Observer
{

	private String name;
	private Observable магическаДъска;

	public Джудже(String name)
	{
		this.name = name;
	}

	@Override
	public void update()
	{
		if(this.магическаДъска == null) 
		{
			System.out.println("На Дядо Коледа не му трябват играчки");
			return;
		}
		String последнаКоманда = this.магическаДъска.getUpdate();
		System.out.println(this.name + "получи командата: " + последнаКоманда);
	}

	@Override
	public void checkBoard(Observable магическаДъска) 
	{
		this.магическаДъска = магическаДъска;
	}

}
