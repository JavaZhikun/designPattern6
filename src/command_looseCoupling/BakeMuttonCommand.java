package command_looseCoupling;

public class BakeMuttonCommand extends Command
{
	public BakeMuttonCommand(Barbecuer receiver)
	{
		super(receiver);
	}
	
	@Override
	public void excuteCommand() {
		// TODO Auto-generated method stub
		receiver.bakeMutton();
	}
	

}
