package command;

public class ConcreteCommand extends Command
{
	public ConcreteCommand(Receiver receiver)
	{
		super(receiver);
	}
	
	@Override
	public void excute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
