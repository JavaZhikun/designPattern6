package command_looseCoupling;

public class Waiter
{
	private Command command;
	
	public void setOrder(Command command)
	{
		this.command = command;
	}
	
	//ִ֪ͨ��
	public void inform()
	{
		command.excuteCommand();
		
	}

}
