package observer;
import java.util.ArrayList;
import java.util.List;

public class МагическаДъска implements Observable 
{

	private List<Джудже> джуджета;
	private String магическаДъска;
	
	public МагическаДъска() 
	{
		this.джуджета = new ArrayList<>();
	}

	@Override
	public void goToBoard(Джудже джудже) 
	{
		this.джуджета.add(джудже);
		(джуджета).checkBoard(this);
	}

	@Override
	public void getToy(Джудже джудже)
	{
		this.джуджета.remove(джудже);
		джудже.checkBoard(null);
	}

	@Override
	public void notifyObservers()
	{
		for(Джудже джудже: this.джуджета) 
		{
			джудже.update();
		}
	}

	@Override
	public String getUpdate() 
	{
		return this.магическаДъска;
	}

	public void checkBoard(String магическаДъска)
	{
		this.магическаДъска = магическаДъска;
		this.notifyObservers();
	}

}
