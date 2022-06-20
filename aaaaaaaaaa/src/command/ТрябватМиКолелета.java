package command;

public class ТрябватМиКолелета implements Command
{
	private Играчка играчка;
	
	public ТрябватМиКолелета(Играчка играчка) 
	{
		this.играчка = играчка;
	}
	
	@Override
	public void execute() 
	{
		this.играчка.колело();
	}
}
