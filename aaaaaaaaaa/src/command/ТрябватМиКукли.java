package command;

public class ТрябватМиКукли implements Command
{
	private Играчка играчка;
	
	public ТрябватМиКукли(Играчка играчка) 
	{
		this.играчка = играчка;
	}
	
	@Override
	public void execute() 
	{
		this.играчка.кукла();
	}
}
