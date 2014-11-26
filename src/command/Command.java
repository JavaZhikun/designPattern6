package command;

public abstract class Command 
{
	public Receiver receiver;
	
	public Command(Receiver receiver)
	{
		this.receiver = receiver;
	}
	
	public abstract void excute();

}
