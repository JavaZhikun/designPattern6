package command_looseCoupling;

public class Waiter
{
	private Command command;
	
	public void setOrder(Command command)
	{
		this.command = command;
	}
	
	//Í¨ÖªÖ´ÐÐ
	public void inform()
	{
		command.excuteCommand();
		
	}

}
