package observer;
import java.util.ArrayList;
import java.util.List;

public class �������������� implements Observable 
{

	private List<������> ��������;
	private String ��������������;
	
	public ��������������() 
	{
		this.�������� = new ArrayList<>();
	}

	@Override
	public void goToBoard(������ ������) 
	{
		this.��������.add(������);
		(��������).checkBoard(this);
	}

	@Override
	public void getToy(������ ������)
	{
		this.��������.remove(������);
		������.checkBoard(null);
	}

	@Override
	public void notifyObservers()
	{
		for(������ ������: this.��������) 
		{
			������.update();
		}
	}

	@Override
	public String getUpdate() 
	{
		return this.��������������;
	}

	public void checkBoard(String ��������������)
	{
		this.�������������� = ��������������;
		this.notifyObservers();
	}

}
