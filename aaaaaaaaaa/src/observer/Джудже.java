package observer;

public class ������ implements Observer
{

	private String name;
	private Observable ��������������;

	public ������(String name)
	{
		this.name = name;
	}

	@Override
	public void update()
	{
		if(this.�������������� == null) 
		{
			System.out.println("�� ���� ������ �� �� ������� �������");
			return;
		}
		String ��������������� = this.��������������.getUpdate();
		System.out.println(this.name + "������ ���������: " + ���������������);
	}

	@Override
	public void checkBoard(Observable ��������������) 
	{
		this.�������������� = ��������������;
	}

}
