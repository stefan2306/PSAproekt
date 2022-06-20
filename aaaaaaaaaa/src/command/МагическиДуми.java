package command;

public class МагическиДуми {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void изричанеНаДумите() {
		if(this.command == null) {
			System.out.println("Изречете магическите думи");
			return;
		}
		this.command.execute();
	}
	
}
