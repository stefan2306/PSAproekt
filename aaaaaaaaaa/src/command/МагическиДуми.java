package command;

public class ������������� {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ����������������() {
		if(this.command == null) {
			System.out.println("�������� ����������� ����");
			return;
		}
		this.command.execute();
	}
	
}
