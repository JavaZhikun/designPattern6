package command_looseCoupling;

public class BakeChickenWingCommand extends Command
{
	public BakeChickenWingCommand(Barbecuer receiver)
	{
		super(receiver);
	}
	
	@Override
	public void excuteCommand() {
		// TODO Auto-generated method stub
		receiver.bakeChickenWing();
	}

}
