package command_optimize;

public abstract class Command 
{
	public Barbecuer receiver;
	
	public Command( Barbecuer receiver)
	{
		this.receiver = receiver;
	}
	
	public abstract void excuteCommand();
	

}
