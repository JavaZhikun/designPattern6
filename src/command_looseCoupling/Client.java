package command_looseCoupling;

public class Client 
{
	public static void main(String[] args) {
		//开店前的准备
		Barbecuer boy = new Barbecuer();//烤肉师
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		//开门营业
		girl.setOrder(bakeMuttonCommand1);
		girl.inform();
		girl.setOrder(bakeMuttonCommand2);
		girl.inform();
		girl.setOrder(bakeChickenWingCommand1);
		girl.inform();
		
		
	}

}
